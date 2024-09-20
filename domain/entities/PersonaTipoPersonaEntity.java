package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "persona_tipo_persona")
public class PersonaTipoPersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_personatipopersona")
    private int idPersonaTipoPersona;

    @Column(name = "ID_tipopersona", nullable = false)
    private int idTipoPersona;

    // Constructores
    public PersonaTipoPersonaEntity() {}

    public PersonaTipoPersonaEntity(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    // Getters y Setters
    public int getIdPersonaTipoPersona() {
        return idPersonaTipoPersona;
    }

    public void setIdPersonaTipoPersona(int idPersonaTipoPersona) {
        this.idPersonaTipoPersona = idPersonaTipoPersona;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
}
