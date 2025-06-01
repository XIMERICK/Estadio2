package com.estadio.estadio.controller;

import com.estadio.estadio.model.Lugar;
import com.estadio.estadio.service.ServicioLugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lugares")
public class LugarController {

    @Autowired
    private ServicioLugar servicioLugar;

    @GetMapping
    public ResponseEntity<List<Lugar>> obtenerTodosLosLugares() {
        return ResponseEntity.ok(servicioLugar.obtenerTodosLosLugares());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lugar> obtenerLugarPorId(@PathVariable Long id) {
        Lugar lugar = servicioLugar.obtenerLugarPorId(id);
        if (lugar == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lugar);
    }
}
