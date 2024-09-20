package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "despachos")
public class DespachosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_despacho")
    private int idDespacho;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    // Constructores
    public DespachosEntity() {}

    public DespachosEntity(String estado) {
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
