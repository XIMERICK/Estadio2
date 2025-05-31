package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AsientoRepositorio extends JpaRepository<Asiento, String> {
}
