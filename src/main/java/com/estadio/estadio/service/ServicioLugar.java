package com.estadio.estadio.service;

import com.estadio.estadio.model.Lugar;

import java.util.List;

public interface ServicioLugar {
    Lugar obtenerLugarPorId(Long idLugar);
    List<Lugar> obtenerTodosLosLugares();
    Lugar guardarLugar(Lugar lugar);
    void eliminarLugar(Long idLugar);
}