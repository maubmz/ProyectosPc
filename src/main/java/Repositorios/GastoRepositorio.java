package Repositorios;

import Entidades.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepositorio extends JpaRepository<Gasto, Integer> {
}
