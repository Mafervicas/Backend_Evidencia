package com.equipo02.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Paciente")
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String HistorialClinico;


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
