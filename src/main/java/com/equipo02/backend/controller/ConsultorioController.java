package com.equipo02.backend.controller;

import com.equipo02.backend.model.Consultorio;
import com.equipo02.backend.service.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class ConsultorioController {
    @Autowired
    private ConsultorioService consultorioService;

    @PostMapping("/guardarConsultorio")
    public Consultorio guardar(@RequestBody Consultorio usuario){
        return consultorioService.guardar(usuario);
    }

    @GetMapping("/mostrarConsultorios")
    public List<Consultorio> mostrarConsultorio(){
        return consultorioService.buscar();
    }

    @GetMapping("/buscarConsultorio/{id}")
    public Consultorio buscarConsultorio(@PathVariable Integer id){
        return consultorioService.buscarPorId(id);
    }


}
