package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.repositorio.AsientoRepositorio;
import com.estadio.estadio.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicioAsientoImpl implements ServicioAsiento {

    @Autowired
    private AsientoRepositorio asientoRepositorio;

    @Autowired
    private VentaRepositorio ventaRepositorio;

    @Override
    public List<Asiento> obtenerAsientosDisponibles(Funcion funcion) {
        // Obtener todos los asientos
        List<Asiento> todosLosAsientos = asientoRepositorio.findAll();

        // Obtener los asientos que ya han sido vendidos para esta función
        List<String> asientosVendidosIds = ventaRepositorio.findByFuncion(funcion).stream()
                .map(venta -> venta.getAsiento().getIdAsiento())
                .collect(Collectors.toList());

        // Filtrar los asientos que no están en la lista de vendidos y están disponibles
        return todosLosAsientos.stream()
                .filter(asiento -> !asientosVendidosIds.contains(asiento.getIdAsiento()) &&
                        asiento.getEstado() == asiento.getEstado().DISPONIBLE)
                .collect(Collectors.toList());
    }

    @Override
    public Asiento obtenerAsientoPorId(String idAsiento) {
        return asientoRepositorio.findById(idAsiento).orElse(null);
    }

    @Override
    public void marcarAsientoComoVendido(Asiento asiento) {
        asiento.setEstado(asiento.getEstado().VENDIDO);
        asientoRepositorio.save(asiento);
    }
}