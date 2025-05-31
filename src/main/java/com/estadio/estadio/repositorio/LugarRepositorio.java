package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LugarRepositorio  extends JpaRepository<Lugar, Long> {
}
