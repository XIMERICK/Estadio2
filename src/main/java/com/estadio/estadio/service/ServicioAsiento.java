package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;

import java.util.List;

public interface ServicioAsiento {
    List<Asiento> obtenerTodosLosAsientos();
    List<Asiento> obtenerAsientosDisponibles(Funcion funcion);
    Asiento obtenerAsientoPorId(String idAsiento);
    Asiento guardarAsiento(Asiento asiento); // Añade esta línea para POST y PUT
    void eliminarAsiento(String idAsiento); // Añade esta línea para DELETE
    void marcarAsientoComoVendido(Asiento asiento); // Esta ya la tenías, se mantiene
}
