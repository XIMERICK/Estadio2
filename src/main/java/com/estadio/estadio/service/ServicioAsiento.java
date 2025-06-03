package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ServicioAsiento {
    List<Asiento> obtenerTodosLosAsientos();
    List<Asiento> obtenerAsientosDisponibles(Funcion funcion);
    Asiento obtenerAsientoPorId(String idAsiento);
    Asiento guardarAsiento(Asiento asiento);
    void eliminarAsiento(String idAsiento);
    void marcarAsientoComoVendido(Asiento asiento);

    @Transactional
    void registrarAsiento(Asiento asiento);
}
