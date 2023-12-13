package Repositorios;

import Entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepositorio extends JpaRepository<Pais, Integer> {
}
