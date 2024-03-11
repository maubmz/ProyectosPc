package com.qr.SistemasQr.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "constancia")
public class Constancia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_constancia", unique = true, nullable = false)
    private Integer idConstancia;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ManyToOne(
            cascade = CascadeType.MERGE
    )
    @JoinColumn(
            name = "no_cuenta1",
            referencedColumnName = "no_cuenta"
    )
    @JsonBackReference
    private Estudiante estudiante;

}
