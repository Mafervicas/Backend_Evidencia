package com.equipo02.backend.dao;

import com.equipo02.backend.model.Consultorio;
import com.equipo02.backend.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface ConsultorioDAO extends CrudRepository<Consultorio, Integer> {
}
