package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_mov_caja")
public class TipoMovCajaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_tipomovcaja")
    private int idTipoMovCaja;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    // Constructores
    public TipoMovCajaEntity() {}

    public TipoMovCajaEntity(String tipo) {
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getIdTipoMovCaja() {
        return idTipoMovCaja;
    }

    public void setIdTipoMovCaja(int idTipoMovCaja) {
        this.idTipoMovCaja = idTipoMovCaja;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
