package com.estadio.estadio.service;

import com.estadio.estadio.model.Usuario;

import java.util.List;

public interface ServicioUsuario {
    Usuario obtenerUsuarioPorId(Long idUsuario);
    Usuario verificarUsuario(String cedula);
    Usuario registrarUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
    void eliminarUsuario(Long idUsuario);
}
