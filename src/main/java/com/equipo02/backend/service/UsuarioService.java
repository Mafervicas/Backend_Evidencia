package com.equipo02.backend.service;

import com.equipo02.backend.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario guardar (Usuario usuario);
    public void eliminar (Integer id);
    public Usuario buscarPorId(Integer id);
    public List<Usuario> buscar();


}
