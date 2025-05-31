package com.estadio.estadio.service;

import com.estadio.estadio.model.Venta;

public interface ServicioCentralizado {
    void validarDisponibilidadAsiento(String idAsiento, Long idFuncion);
    void enviarInformacionVenta(Venta venta);
}
