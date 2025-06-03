package com.estadio.estadio.service;

import com.estadio.estadio.model.Asiento;
import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.repositorio.AsientoRepositorio;
import com.estadio.estadio.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioAsientoImpl implements ServicioAsiento {

    @Autowired
    private AsientoRepositorio asientoRepositorio;

    @Autowired
    private VentaRepositorio ventaRepositorio;


    @Override
    public List<Asiento> obtenerTodosLosAsientos() {
        return asientoRepositorio.findAll();
    }

    // Este método necesita implementación real para buscar asientos disponibles
    @Override
    public List<Asiento> obtenerAsientosDisponibles(Funcion funcion) {
        return List.of();
    }

    @Override
    public Asiento obtenerAsientoPorId(String idAsiento) {
        Optional<Asiento> asientoOptional = asientoRepositorio.findById(idAsiento);
        return asientoOptional.orElse(null);
    }

    @Override
    @Transactional
    public Asiento guardarAsiento(Asiento asiento) {
        return asientoRepositorio.save(asiento);
    }

    @Override
    @Transactional
    public void eliminarAsiento(String idAsiento) {
        asientoRepositorio.deleteById(idAsiento);
    }

    @Override
    @Transactional
    public void marcarAsientoComoVendido(Asiento asiento) {
        asiento.setEstado(com.estadio.estadio.enums.EstadoAsiento.VENDIDO);
        asientoRepositorio.save(asiento);
    }

    @Override
    @Transactional
    public void registrarAsiento(Asiento asiento) {
        asientoRepositorio.save(asiento);
    }
}