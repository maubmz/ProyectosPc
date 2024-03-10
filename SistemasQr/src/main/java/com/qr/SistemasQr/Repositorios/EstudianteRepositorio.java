package com.qr.SistemasQr.Repositorios;

import com.qr.SistemasQr.Entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
    Estudiante findByNoCuenta(Integer noCuenta);
}
