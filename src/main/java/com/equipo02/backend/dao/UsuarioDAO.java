package com.equipo02.backend.dao;

import com.equipo02.backend.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
}
