package com.example.demo.domain.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "epocaantiguedad")
public class EpocaAntiguedadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_epocaantiguedad")
    private int idEpocaAntiguedad;

    @Column(name = "epoca", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date epoca;

    // Constructores
    public EpocaAntiguedadEntity() {}

    public EpocaAntiguedadEntity(Date epoca) {
        this.epoca = epoca;
    }

    // Getters y Setters
    public int getIdEpocaAntiguedad() {
        return idEpocaAntiguedad;
    }

    public void setIdEpocaAntiguedad(int idEpocaAntiguedad) {
        this.idEpocaAntiguedad = idEpocaAntiguedad;
    }

    public Date getEpoca() {
        return epoca;
    }

    public void setEpoca(Date epoca) {
        this.epoca = epoca;
    }
}
