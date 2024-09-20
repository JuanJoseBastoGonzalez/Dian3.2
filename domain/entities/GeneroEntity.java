package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "genero")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_genero")
    private int idGenero;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    // Constructores
    public GeneroEntity() {}

    public GeneroEntity(String tipo) {
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
