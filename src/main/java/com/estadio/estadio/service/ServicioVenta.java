package com.estadio.estadio.service;

import com.estadio.estadio.model.Venta;

public interface ServicioVenta {
    Venta realizarVenta(String idAsiento, Long idFuncion, Long idUsuario);
    Venta obtenerVentaPorId(Long idVenta);
}
