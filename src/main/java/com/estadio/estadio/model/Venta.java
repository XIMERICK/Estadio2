package com.estadio.estadio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Venta {
    private Long id;
    private Asiento asiento;
    private Funcion funcion;
    private Usuario usuario;
    private Double precioFinal;

}
