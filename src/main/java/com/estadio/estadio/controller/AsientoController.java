package com.estadio.estadio.controller;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.service.ServicioAsiento;
import com.estadio.estadio.service.ServicioFuncion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; // Importar HttpStatus para respuestas más específicas
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

    // GET: Obtener todos los asientos
    @GetMapping
    public ResponseEntity<List<Asiento>> obtenerTodosLosAsientos() {
        List<Asiento> asientos = servicioAsiento.obtenerTodosLosAsientos();
        if (asientos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(asientos);
    }

    @GetMapping("/disponible")
    public ResponseEntity<List<Asiento>> obtenerAsientosDisponiblesPorFuncion(@RequestParam Long funcionId) {
        Funcion funcion = servicioFuncion.obtenerFuncionPorId(funcionId);
        if (funcion == null) {
            return ResponseEntity.notFound().build();
        }
        List<Asiento> asientosDisponibles = servicioAsiento.obtenerAsientosDisponibles(funcion);
        if (asientosDisponibles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
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

    @PostMapping
    public ResponseEntity<Asiento> crearAsiento(@RequestBody Asiento asiento) {
        // Asumiendo que el ID del asiento se genera automáticamente o se valida en el servicio
        Asiento nuevoAsiento = servicioAsiento.guardarAsiento(asiento);
        return new ResponseEntity<>(nuevoAsiento, HttpStatus.CREATED); // Retorna 201 Created
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asiento> actualizarAsiento(@PathVariable String id, @RequestBody Asiento asientoDetalles) {
        Asiento asientoExistente = servicioAsiento.obtenerAsientoPorId(id);
        if (asientoExistente == null) {
            return ResponseEntity.notFound().build();
        }

        asientoExistente.setLocalidad(asientoDetalles.getLocalidad());
        asientoExistente.setPrecio(asientoDetalles.getPrecio());

        Asiento asientoActualizado = servicioAsiento.guardarAsiento(asientoExistente);
        return ResponseEntity.ok(asientoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAsiento(@PathVariable String id) {
        Asiento asientoExistente = servicioAsiento.obtenerAsientoPorId(id);
        if (asientoExistente == null) {
            return ResponseEntity.notFound().build();
        }
        servicioAsiento.eliminarAsiento(id);
        return ResponseEntity.noContent().build();
    }
}