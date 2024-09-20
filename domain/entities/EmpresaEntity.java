package com.example.demo.domain.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_empresa")
    private int idEmpresa;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "nit", nullable = false)
    private int nit;

    @Column(name = "cel", nullable = false)
    private int cel;

    // Constructores
    public EmpresaEntity() {}

    public EmpresaEntity(String nombre, int nit, int cel) {
        this.nombre = nombre;
        this.nit = nit;
        this.cel = cel;
    }

    // Getters y Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }
}
