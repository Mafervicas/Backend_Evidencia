package com.equipo02.backend.service;

import com.equipo02.backend.model.Administrador;

import java.util.List;

public interface AdministradorService {
    public Administrador guardar (Administrador administrador);
    public void eliminar (Integer id);
    public Administrador buscarPorId(Integer id);
    public List<Administrador> buscar();
}
