package com.qr.SistemasQr.Repositorios;

import com.qr.SistemasQr.Entidades.Constancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstanciaRepositorio extends JpaRepository<Constancia, Integer> {
    Constancia findByIdConstancia(Integer idConstancia);

}
