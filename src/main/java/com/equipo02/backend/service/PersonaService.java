package com.equipo02.backend.service;

import com.equipo02.backend.model.Persona;

import java.util.List;

public interface PersonaService {
    public Persona guardar (Persona persona);
    public void eliminar (Integer id);
    public Persona buscarPorId(Integer id);
    public List<Persona> buscar();
}
