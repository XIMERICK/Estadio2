package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;

import java.util.List;

public interface ServicioAsiento {
    List<Asiento> obtenerAsientosDisponibles(Funcion funcion);
    Asiento obtenerAsientoPorId(String idAsiento);
    void marcarAsientoComoVendido(Asiento asiento);
}
