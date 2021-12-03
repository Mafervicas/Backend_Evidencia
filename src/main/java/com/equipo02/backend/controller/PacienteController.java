package com.equipo02.backend.controller;

import com.equipo02.backend.model.Paciente;
import com.equipo02.backend.model.Persona;
import com.equipo02.backend.service.PacienteService;
import com.equipo02.backend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/guardarPaciente")
    public Paciente guardar(@RequestBody Paciente paciente){
        return pacienteService.guardar(paciente);
    }

    @GetMapping("/mostrarPaciente")
    public List<Paciente> mostrarPaciente(){
        return pacienteService.buscar();
    }

    @GetMapping("/buscarPaciente/{id}")
    public Paciente buscarPaciente(@PathVariable Integer id){
        return pacienteService.buscarPorId(id);
    }
}
