package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface FuncionRepositorio extends JpaRepository<Funcion, Long> {
    Optional<Funcion> findByDia(String dia);
}
