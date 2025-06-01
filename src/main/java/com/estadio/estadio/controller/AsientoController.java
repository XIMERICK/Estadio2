package com.estadio.estadio.controller;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.service.ServicioAsiento;
import com.estadio.estadio.service.ServicioFuncion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asientos")
public class AsientoController {

    @Autowired
    private ServicioAsiento servicioAsiento;

    @Autowired
    private ServicioFuncion servicioFuncion;

    @GetMapping("/disponible")
    public ResponseEntity<List<Asiento>> obtenerAsientosDisponibles(@RequestParam Long funcionId) {
        Funcion funcion = servicioFuncion.obtenerFuncionPorId(funcionId);
        if (funcion == null) {
            return ResponseEntity.notFound().build();
        }
        List<Asiento> asientosDisponibles = servicioAsiento.obtenerAsientosDisponibles(funcion);
        return ResponseEntity.ok(asientosDisponibles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asiento> obtenerAsientoPorId(@PathVariable String id) {
        Asiento asiento = servicioAsiento.obtenerAsientoPorId(id);
        if (asiento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(asiento);
    }
}