package com.equipo02.backend.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="Administradores")
public class Administrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Especialidad;

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
