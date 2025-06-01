package com.estadio.estadio.controller;

import com.estadio.estadio.model.Venta;
import com.estadio.estadio.service.ServicioVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private ServicioVenta servicioVenta;

    @PostMapping("/realizar")
    public ResponseEntity<Venta> realizarVenta(@RequestParam String asientoId,
                                               @RequestParam Long funcionId,
                                               @RequestParam(required = false) Long usuarioId) {
        try {
            Venta venta = servicioVenta.realizarVenta(asientoId, funcionId, usuarioId);
            return new ResponseEntity<>(venta, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            // Podríamos tener manejo de excepciones más específico
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerVentaPorId(@PathVariable Long id) {
        Venta venta = servicioVenta.obtenerVentaPorId(id);
        if (venta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(venta);
    }
}
