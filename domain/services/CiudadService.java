package com.example.demo.domain.services;

import com.example.demo.domain.entities.CiudadEntity;
import com.example.demo.infrastructure.adapters.output.repositories.CiudadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {

    private final CiudadRepository ciudadRepository;

    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public List<CiudadEntity> obtenerTodasLasCiudades() {
        return ciudadRepository.findAll();
    }

    public CiudadEntity guardarCiudad(CiudadEntity ciudad) {
        return ciudadRepository.save(ciudad);
    }

    public void eliminarCiudad(int id) {
        ciudadRepository.deleteById(id);
    }

    public CiudadEntity actualizarCiudad(CiudadEntity ciudad) {
        return ciudadRepository.save(ciudad);
    }
}
