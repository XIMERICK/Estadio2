package com.estadio.estadio.controller;

import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.service.ServicioFuncion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funciones")
public class FuncionController {

    @Autowired
    private ServicioFuncion servicioFuncion;

    @GetMapping
    public ResponseEntity<List<Funcion>> obtenerTodasLasFunciones() {
        return ResponseEntity.ok(servicioFuncion.obtenerTodasLasFunciones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcion> obtenerFuncionPorId(@PathVariable Long id) {
        Funcion funcion = servicioFuncion.obtenerFuncionPorId(id);
        if (funcion == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(funcion);
    }
}
