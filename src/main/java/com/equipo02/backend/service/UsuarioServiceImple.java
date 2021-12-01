package com.equipo02.backend.service;

import com.equipo02.backend.dao.UsuarioDAO;
import com.equipo02.backend.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UsuarioServiceImple implements UsuarioService{

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly = false)
    public Usuario guardar(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        usuarioDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Usuario buscarPorId(Integer id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Usuario> buscar() {
        return (List<Usuario>) usuarioDAO.findAll();
    }
}
