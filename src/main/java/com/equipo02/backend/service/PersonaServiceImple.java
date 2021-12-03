package com.equipo02.backend.service;

import com.equipo02.backend.dao.PersonaDAO;
import com.equipo02.backend.dao.UsuarioDAO;
import com.equipo02.backend.model.Persona;
import com.equipo02.backend.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PersonaServiceImple implements PersonaService{

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = false)
    public Persona guardar(Persona persona) {
        return personaDAO.save(persona);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        personaDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Persona buscarPorId(Integer id) {
        return personaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Persona > buscar() {
        return (List<Persona>) personaDAO.findAll();
    }
}

