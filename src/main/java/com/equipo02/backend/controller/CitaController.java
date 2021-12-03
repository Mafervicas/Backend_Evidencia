package com.equipo02.backend.controller;


import com.equipo02.backend.model.Cita;
import com.equipo02.backend.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @PostMapping("/guardarCita")
    public Cita guardar(@RequestBody Cita cita){
        return citaService.guardar(cita);
    }

    @GetMapping("/mostrarCitas")
    public List<Cita> mostrarCita(){
        return citaService.buscar();
    }

    @GetMapping("/buscarCita/{id}")
    public Cita buscarCita(@PathVariable Integer id){
        return citaService.buscarPorId(id);
    }

}
