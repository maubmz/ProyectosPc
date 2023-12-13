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
@Builder
@Data
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "cod_pais", unique = true, nullable = false)
    private Integer codPais;
    @Column(name = "nombre_pais")
    private String nombrePais;

    @OneToMany(
            mappedBy = "codPais",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonBackReference
    private List<Viaje> viajes;

    @OneToMany(
            mappedBy = "pais",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonBackReference
    private List<Gasto> gastos;

}
