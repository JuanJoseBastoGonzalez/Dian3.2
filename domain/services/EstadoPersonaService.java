package com.example.demo.domain.services;
import com.example.demo.domain.entities.EstadoPersonaEntity;
import com.example.demo.infrastructure.adapters.output.repositories.EstadoPersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoPersonaService {

    private final EstadoPersonaRepository estadoPersonaRepository;

    public EstadoPersonaService(EstadoPersonaRepository estadoPersonaRepository) {
        this.estadoPersonaRepository = estadoPersonaRepository;
    }

    public List<EstadoPersonaEntity> obtenerTodosLosEstadosPersona() {
        return estadoPersonaRepository.findAll();
    }

    public EstadoPersonaEntity guardarEstadoPersona(EstadoPersonaEntity estadoPersona) {
        return estadoPersonaRepository.save(estadoPersona);
    }

    public void eliminarEstadoPersona(int id) {
        estadoPersonaRepository.deleteById(id);
    }

    public EstadoPersonaEntity actualizarEstadoPersona(EstadoPersonaEntity estadoPersona) {
        return estadoPersonaRepository.save(estadoPersona);
    }
}
