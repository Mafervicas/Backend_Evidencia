package com.equipo02.backend.service;

import com.equipo02.backend.dao.ConsultorioDAO;
import com.equipo02.backend.model.Consultorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConsultorioServiceImple implements ConsultorioService{
    @Autowired
    private ConsultorioDAO consultorioDAO;

    @Override
    @Transactional(readOnly = false)
    public Consultorio guardar(Consultorio consultorio) {
        return consultorioDAO.save(consultorio);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        consultorioDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Consultorio buscarPorId(Integer id) {
        return consultorioDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Consultorio> buscar() {
        return (List<Consultorio>) consultorioDAO.findAll();
    }
}
