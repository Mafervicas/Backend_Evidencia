package com.equipo02.backend.controller;


import com.equipo02.backend.model.Usuario;
import com.equipo02.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Api Rest
@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/guardarUsuario")
    public Usuario guardar(@RequestBody Usuario usuario){
        return usuarioService.guardar(usuario);
    }

    @GetMapping("/mostrarUsuarios")
    public List<Usuario> mostrarUsuario(){
        return usuarioService.buscar();
    }

    @GetMapping("/buscarUsuario/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarPorId(id);
    }


}
