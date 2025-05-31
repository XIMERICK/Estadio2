package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FuncionRepositorio extends JpaRepository<Funcion, Long> {

}
