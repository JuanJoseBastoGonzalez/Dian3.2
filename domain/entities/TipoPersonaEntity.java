package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_persona")
public class TipoPersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_tipopersona")
    private int idTipoPersona;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    // Constructores
    public TipoPersonaEntity() {}

    public TipoPersonaEntity(String tipo) {
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
