package com.example.demo.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sucursal")
public class SucursalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_sucursal")
    private int idSucursal;

    @Column(name = "ID_ciudad", nullable = false)
    private int idCiudad;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "cod_sucursal", nullable = false)
    private int codSucursal;

    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "ID_empresa", nullable = false)
    private int idEmpresa;

    @Column(name = "ID_persona", nullable = false)
    private int idPersona;

    // Constructores
    public SucursalEntity() {}

    public SucursalEntity(int idCiudad, String nombre, int codSucursal, String direccion, int idEmpresa, int idPersona) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.codSucursal = codSucursal;
        this.direccion = direccion;
        this.idEmpresa = idEmpresa;
        this.idPersona = idPersona;
    }

    // Getters y Setters
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}
