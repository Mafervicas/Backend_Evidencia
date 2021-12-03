package com.equipo02.backend.service;

import com.equipo02.backend.dao.PacienteDAO;
import com.equipo02.backend.dao.PersonaDAO;
import com.equipo02.backend.model.Paciente;
import com.equipo02.backend.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PacienteServiceImple implements PacienteService{
    @Autowired
    private PacienteDAO pacienteDAO;

    @Override
    @Transactional(readOnly = false)
    public Paciente guardar(Paciente paciente) {
        return pacienteDAO.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        pacienteDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Paciente buscarPorId(Integer id) {
        return pacienteDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Paciente> buscar() {
        return (List<Paciente>) pacienteDAO.findAll();
    }
}
