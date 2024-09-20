package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class RegionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_region")
    private int idRegion;

    @ManyToOne
    @JoinColumn(name = "ID_pais", nullable = false)
    private PaisEntity pais;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigo", nullable = false)
    private int codigo;

    // Constructores
    public RegionEntity() {}

    public RegionEntity(PaisEntity pais, String nombre, int codigo) {
        this.pais = pais;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Getters y Setters
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public PaisEntity getPais() {
        return pais;
    }

    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
