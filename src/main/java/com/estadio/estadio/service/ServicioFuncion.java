package com.estadio.estadio.service;

import com.estadio.estadio.model.Funcion;

import java.util.List;

public interface ServicioFuncion {
    Funcion obtenerFuncionPorId(Long idFuncion);
    List<Funcion> obtenerTodasLasFunciones();
    Funcion guardarFuncion(Funcion funcion);
    void eliminarFuncion(Long idFuncion);

    Funcion obtenerFuncionPorDia(String viernes);
}
