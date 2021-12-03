package com.equipo02.backend.controller;

import com.equipo02.backend.model.Persona;
import com.equipo02.backend.model.Usuario;
import com.equipo02.backend.service.PersonaService;
import com.equipo02.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/guardarPersona")
    public Persona guardar(@RequestBody Persona persona){
        return personaService.guardar(persona);
    }

    @GetMapping("/mostrarPersona")
    public List<Persona> mostrarPersona(){
        return personaService.buscar();
    }

    @GetMapping("/buscarPersona/{id}")
    public Persona buscarPersona(@PathVariable Integer id){
        return personaService.buscarPorId(id);
    }
}
