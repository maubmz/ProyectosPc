package com.qr.SistemasQr.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @Column(name = "no_cuenta", unique = true, nullable = false)
    private Integer noCuenta;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "correo", nullable = false)
    private String correo;

    @OneToMany(
            mappedBy = "estudiante",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private List<Constancia> constancias;

}
