package com.equipo02.backend.service;

import com.equipo02.backend.dao.AdministradorDAO;
import com.equipo02.backend.model.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AdministradorServiceImple implements AdministradorService {
    @Autowired
    private AdministradorDAO administradorDAO;

    @Override
    @Transactional(readOnly = false)
    public Administrador guardar(Administrador administrador) {
        return administradorDAO.save(administrador);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Integer id) {
        administradorDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly= true)
    public Administrador buscarPorId(Integer id) {
        return administradorDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<Administrador> buscar() {
        return (List<Administrador>) administradorDAO.findAll();
    }
}
