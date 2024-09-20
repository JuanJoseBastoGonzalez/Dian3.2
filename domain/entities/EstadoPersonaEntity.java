package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_persona")
public class EstadoPersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_estadopersona")
    private int idEstadoPersona;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    // Constructores
    public EstadoPersonaEntity() {}

    public EstadoPersonaEntity(String estado) {
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdEstadoPersona() {
        return idEstadoPersona;
    }

    public void setIdEstadoPersona(int idEstadoPersona) {
        this.idEstadoPersona = idEstadoPersona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
