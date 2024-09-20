package com.example.demo.domain.services;

import com.example.demo.domain.entities.SucursalEntity;
import com.example.demo.infrastructure.adapters.output.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService {

    private final SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public List<SucursalEntity> obtenerTodasLasSucursales() {
        return sucursalRepository.findAll();
    }

    public SucursalEntity guardarSucursal(SucursalEntity sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public void eliminarSucursal(int id) {
        sucursalRepository.deleteById(id);
    }

    public SucursalEntity actualizarSucursal(SucursalEntity sucursal) {
        return sucursalRepository.save(sucursal);
    }
}
