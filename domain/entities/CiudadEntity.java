package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ciudad")
public class CiudadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ciudad")
    private int idCiudad;

    @ManyToOne
    @JoinColumn(name = "ID_region", nullable = false)
    private RegionEntity region;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigo", nullable = false)
    private int codigo;

    // Constructores
    public CiudadEntity() {}

    public CiudadEntity(RegionEntity region, String nombre, int codigo) {
        this.region = region;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Getters y Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public RegionEntity getRegion() {
        return region;
    }

    public void setRegion(RegionEntity region) {
        this.region = region;
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
