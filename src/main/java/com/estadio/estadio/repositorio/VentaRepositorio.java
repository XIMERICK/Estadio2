package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaRepositorio extends JpaRepository<Venta, Long> {
    List<Venta> findByFuncion(Funcion funcion);
}
