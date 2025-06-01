package com.estadio.estadio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.estadio.estadio.enums.EstadoAsiento;

@Data
@AllArgsConstructor
@Entity

public class Asiento {
    @Id
    private String idAsiento;
    private String localidad;
    private Double precio;
    private EstadoAsiento estado;

public Asiento(String idAsiento, String localidad, Double precio) {
    this.idAsiento = idAsiento;
    this.localidad = localidad;
    this.precio = precio;
    this.estado = EstadoAsiento.DISPONIBLE;
}
public Asiento() {
    this.estado = EstadoAsiento.DISPONIBLE;
    }
}

