package Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "gasto")
public class Gasto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "cod_gasto", unique = true, nullable = false)
    private Integer codGasto;
    @Column(name = "tipo_gasto")
    private String tipoGasto;
    @Column(name = "fecha_ing")
    private String fechaIng;
    @Column(name = "fecha_fing")
    private String fechaFIng;

    @ManyToOne(
        cascade = CascadeType.MERGE
    )
    @JoinColumn(
            name = "CURP",
            referencedColumnName = "CURP1"
    )
    private Profesor profesor;

    @ManyToOne(
            cascade = CascadeType.MERGE
    )
    @JoinColumn(
            name = "cod_pais",
            referencedColumnName = "cod_pais2"
    )
    private Pais pais;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "viaje_gasto",
            joinColumns = @JoinColumn(
                    name = "cod_viaje2",
                    referencedColumnName = "cod_viaje"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "cod_gasto1",
                    referencedColumnName = "cod_gasto"
            )
    )
    private List<Gasto> gastoList;
}
