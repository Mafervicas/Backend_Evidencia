package com.equipo02.backend.service;

import com.equipo02.backend.dao.DoctoresDAO;
import com.equipo02.backend.dao.UsuarioDAO;
import com.equipo02.backend.model.Doctores;
import com.equipo02.backend.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;
import java.util.List;

public class DoctoresServiceImple implements DoctoresService{

    @Autowired
    private DoctoresDAO doctoresDAO;

    @Override
    @Transactional(readOnly = false)
    public Doctores guardar(Doctores doctores) {
        return doctoresDAO.save(doctores);
    }


    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        doctoresDAO.deleteById(id);
    }


    /*
    @Override
    @Transactional(readOnly= true)
    public Usuario buscarPorId(Integer id) {
        return doctoresDAO.findById(id).orElse(null);
    } */

    @Override
    @Transactional(readOnly= true)
    public List<Doctores> buscarDoctores() {
        return (List<Doctores>) doctoresDAO.findAll();
    }
}
