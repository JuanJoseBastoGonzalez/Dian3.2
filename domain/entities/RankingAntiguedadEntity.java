package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "rankingantiguedad")
public class RankingAntiguedadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ranking")
    private int idRanking;

    @Column(name = "posicion", nullable = false)
    private int posicion;

    // Constructores
    public RankingAntiguedadEntity() {}

    public RankingAntiguedadEntity(int posicion) {
        this.posicion = posicion;
    }

    // Getters y Setters
    public int getIdRanking() {
        return idRanking;
    }

    public void setIdRanking(int idRanking) {
        this.idRanking = idRanking;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
