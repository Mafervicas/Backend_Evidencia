package com.equipo02.backend.service;

import com.equipo02.backend.model.Cita;


import java.util.List;

public interface CitaService {
    public Cita guardar (Cita cita);
    public void eliminar (Integer id);
    public Cita buscarPorId(Integer id);
    public List<Cita> buscar();
}
