package com.equipo02.backend.dao;

import com.equipo02.backend.model.Cita;
import org.springframework.data.repository.CrudRepository;
public interface CitaDAO extends CrudRepository<Cita, Integer> {
}
