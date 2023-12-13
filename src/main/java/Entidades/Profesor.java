package Entidades;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "CURP",unique = true, nullable = false)
    private String curp;
    private String nombre;
    private String apellido;
    private String despacho;

    @OneToMany(
            mappedBy = "profesor",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonBackReference
    private List<Gasto> gastoList;


    @ManyToMany(
            cascade = CascadeType.MERGE
    )
    @JoinTable(
            name = "profesor_viaje",
            joinColumns = @JoinColumn(
                    name = "CURP2",
                    referencedColumnName = "CURP"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "cod_viaje1",
                    referencedColumnName = "cod_viaje"
            )
    )
    private List<Viaje> viajes;
}
