package com.estadio.estadio.service;

import com.estadio.estadio.model.Funcion;
import com.estadio.estadio.repositorio.FuncionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Importa esta anotación si aún no la tienes

import java.util.List;
import java.util.Optional;

@Service
public class ServicioFuncionImpl implements ServicioFuncion {

    @Autowired
    private FuncionRepositorio funcionRepositorio;

    @Override
    public Funcion obtenerFuncionPorId(Long idFuncion) {
        return funcionRepositorio.findById(idFuncion).orElse(null);
    }

    @Override
    public List<Funcion> obtenerTodasLasFunciones() {
        return funcionRepositorio.findAll();
    }

    @Override
    @Transactional
    public Funcion guardarFuncion(Funcion funcion) {
        return funcionRepositorio.save(funcion);
    }

    @Override
    @Transactional
    public void eliminarFuncion(Long idFuncion) {
        funcionRepositorio.deleteById(idFuncion);
    }

    public Funcion obtenerFuncionPorDia(String dia) {
        return funcionRepositorio.findByDia(dia).orElse(null);
    }
}