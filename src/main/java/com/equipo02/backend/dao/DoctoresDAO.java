package com.equipo02.backend.dao;

import com.equipo02.backend.model.Doctores;
import com.equipo02.backend.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface DoctoresDAO extends CrudRepository<Doctores, Integer> {
}
