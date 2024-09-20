package com.example.demo.domain.services;

import com.example.demo.domain.entities.EpocaAntiguedadEntity;
import com.example.demo.infrastructure.adapters.output.repositories.EpocaAntiguedadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpocaAntiguedadService {

    private final EpocaAntiguedadRepository epocaAntiguedadRepository;

    public EpocaAntiguedadService(EpocaAntiguedadRepository epocaAntiguedadRepository) {
        this.epocaAntiguedadRepository = epocaAntiguedadRepository;
    }

    public List<EpocaAntiguedadEntity> obtenerTodasLasEpocas() {
        return epocaAntiguedadRepository.findAll();
    }

    public EpocaAntiguedadEntity guardarEpoca(EpocaAntiguedadEntity epoca) {
        return epocaAntiguedadRepository.save(epoca);
    }

    public void eliminarEpoca(int id) {
        epocaAntiguedadRepository.deleteById(id);
    }

    public EpocaAntiguedadEntity actualizarEpoca(EpocaAntiguedadEntity epoca) {
        return epocaAntiguedadRepository.save(epoca);
    }
}
