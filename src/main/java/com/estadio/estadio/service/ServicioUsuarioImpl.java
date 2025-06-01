package com.estadio.estadio.service;

import com.estadio.estadio.model.Usuario;
import com.estadio.estadio.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {

    // Opción 1: Inyección por campo (la que tienes ahora, con un cambio)
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    // Opción 2: Inyección por constructor (RECOMENDADA)
    /*
    private final UsuarioRepositorio usuarioRepositorio;

    public ServicioUsuarioImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }
    */

    @Override
    public Usuario obtenerUsuarioPorId(Long idUsuario) {
        // Usa .orElse(null) para manejar el Optional
        return usuarioRepositorio.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario verificarUsuario(String documento) {
        // Aquí es donde está el cambio principal:
        // Usa .orElse(null) para obtener el Usuario del Optional, o null si no se encuentra.
        return usuarioRepositorio.findByDocumento(documento).orElse(null);
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public void eliminarUsuario(Long idUsuario) {
        usuarioRepositorio.deleteById(idUsuario);
    }
}
