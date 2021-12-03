package com.equipo02.backend.service;

import com.equipo02.backend.model.Doctores;
import com.equipo02.backend.model.Usuario;

import java.util.List;

public interface DoctoresService {
    public Doctores guardar (Doctores doctores);
    public void eliminar (Integer id);
    //public Usuario buscarPorId(Integer id);
    public List<Doctores> buscarDoctores();
}
