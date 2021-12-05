package com.equipo02.backend.service;

import com.equipo02.backend.dao.CitaDAO;
import com.equipo02.backend.model.Cita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CitaServiceImple implements CitaService{
    @Autowired
    private CitaDAO citaDAO;

    @Override
    @Transactional(readOnly = false)
    public Cita guardar(Cita cita) {
        return citaDAO.save(cita);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        citaDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Cita buscarPorId(Integer id) {
        return citaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Cita> buscar() {
        return (List<Cita>) citaDAO.findAll();
    }
}
