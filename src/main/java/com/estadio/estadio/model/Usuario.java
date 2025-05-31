package com.estadio.estadio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    private String descuento;
}
