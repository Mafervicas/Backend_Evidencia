package com.equipo02.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Doctores")

public class Doctores implements Serializable {
    //Inicializamos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Paciente;
    private String Especialidad;
    private String Contrasena;

    //Gets & Sets

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String paciente) {
        Paciente = paciente;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }
}
