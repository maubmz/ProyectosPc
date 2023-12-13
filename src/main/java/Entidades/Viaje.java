package Entidades;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "viaje")
public class Viaje {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "cod_viaje")
    private Integer codViaje;
    @Column(name = "fecha_inv")
    private String fechaInv;
    @Column(name = "fecha_finv")
    private String fechaFInv;
    private String motivo;

    @ManyToOne(
            cascade = CascadeType.MERGE
    )
    @JoinColumn(
            name = "cod_pais1",
            referencedColumnName = "cod_pais"
    )
    @JsonBackReference
    private Pais codPais;

    @ManyToMany(mappedBy = "viajes", cascade = CascadeType.MERGE)
    @JsonIgnore
    private List<Profesor> profesores;

    @ManyToMany(mappedBy = "gastoList", cascade = CascadeType.MERGE)
    @JsonIgnore
    private List<Gasto> gastoList;

}
