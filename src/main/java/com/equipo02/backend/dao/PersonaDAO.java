package com.equipo02.backend.dao;

import com.equipo02.backend.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Integer> {
}
