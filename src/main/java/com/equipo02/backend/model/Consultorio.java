package com.equipo02.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Consultorio")
public class Consultorio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username ;
    private String pwd;
    private String token;
    private String Paciente;
    private String Doctor;
    private String Fecha;
    private String Hora;

    //Gets & Sets
    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String paciente) {
        Paciente = paciente;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }
}
