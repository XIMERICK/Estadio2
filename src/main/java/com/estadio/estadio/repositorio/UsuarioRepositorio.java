package com.estadio.estadio.repositorio;

import com.estadio.estadio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByDocumento(String documento);
}
