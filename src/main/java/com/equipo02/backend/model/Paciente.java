package com.equipo02.backend.model;

import javax.persistence.*;

@Entity
@Table(name="Persona")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String HistorialClinico;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHistorialClinico() {
        return HistorialClinico;
    }
    public void setHistorialClinico(String historialClinico) {
        HistorialClinico = historialClinico;
    }
}
