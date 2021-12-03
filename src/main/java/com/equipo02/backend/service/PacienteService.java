package com.equipo02.backend.service;

import com.equipo02.backend.model.Paciente;
import com.equipo02.backend.model.Persona;

import java.util.List;

public interface PacienteService {
    public Paciente guardar (Paciente paciente);
    public void eliminar (Integer id);
    public Paciente buscarPorId(Integer id);
    public List<Paciente> buscar();
}
