package com.example.demo.domain.services;

import com.example.demo.domain.entities.PaisEntity;
import com.example.demo.infrastructure.adapters.output.repositories.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public List<PaisEntity> obtenerTodosLosPaises() {
        return paisRepository.findAll();
    }

    public PaisEntity guardarPais(PaisEntity pais) {
        return paisRepository.save(pais);
    }

    public void eliminarPais(int id) {
        paisRepository.deleteById(id);
    }

    public PaisEntity actualizarPais(PaisEntity pais) {
        return paisRepository.save(pais);
    }
}
