package com.equipo02.backend.controller;

import com.equipo02.backend.model.Administrador;
import com.equipo02.backend.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class AdministradorController {
    @Autowired
    private AdministradorService administradorService;

    @PostMapping("/guardarAdministrador")
    public Administrador guardar(@RequestBody Administrador usuario){
        return administradorService.guardar(usuario);
    }

    @GetMapping("/mostrarAdministrador")
    public List<Administrador> mostrarAdministrador(){
        return administradorService.buscar();
    }

    @GetMapping("/buscarAdministrador/{id}")
    public Administrador buscarAdministrador(@PathVariable Integer id){
        return administradorService.buscarPorId(id);
    }
}
