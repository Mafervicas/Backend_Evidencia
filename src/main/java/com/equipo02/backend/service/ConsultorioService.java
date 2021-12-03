package com.equipo02.backend.service;

import com.equipo02.backend.model.Consultorio;

import java.util.List;

public interface ConsultorioService {
    public Consultorio guardar (Consultorio consultorio);
    public void eliminar (Integer id);
    public Consultorio buscarPorId(Integer id);
    public List<Consultorio> buscar();

}
