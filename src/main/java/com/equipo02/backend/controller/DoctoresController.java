package com.equipo02.backend.controller;

import com.equipo02.backend.model.Doctores;
import com.equipo02.backend.model.Paciente;
import com.equipo02.backend.model.Usuario;
import com.equipo02.backend.service.DoctoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

//Api Rest
@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class DoctoresController {

    @Autowired
    private DoctoresService DoctoresService;

    @PostMapping("/guardarDoctores")
    public Doctores guardar(@RequestBody Doctores doctores){
        return DoctoresService.guardar(doctores);
    }

    @GetMapping("/mostrarDoctores")
    public List<Doctores> mostrarUsuario(){
        return DoctoresService.buscarDoctores();
    }

    @GetMapping("/buscarDoctores/{id}")
    public Doctores buscarDoctores(@PathVariable Integer id){
        return DoctoresService.buscarPorId(id);
    }
    /*
    @GetMapping("/buscarUsuario/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return DoctoresService.buscarPorId(id);
       }
     */

}
