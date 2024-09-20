package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipotransaccion")
public class TipoTransaccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_tipotransaccion")
    private int idTipoTransaccion;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    // Constructores
    public TipoTransaccionEntity() {}

    public TipoTransaccionEntity(String tipo) {
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getIdTipoTransaccion() {
        return idTipoTransaccion;
    }

    public void setIdTipoTransaccion(int idTipoTransaccion) {
        this.idTipoTransaccion = idTipoTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
