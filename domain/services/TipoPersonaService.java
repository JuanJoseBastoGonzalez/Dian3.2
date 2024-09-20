package com.example.demo.domain.services;
import com.example.demo.domain.entities.TipoPersonaEntity;
import com.example.demo.infrastructure.adapters.output.repositories.TipoPersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPersonaService {

    private final TipoPersonaRepository tipoPersonaRepository;

    public TipoPersonaService(TipoPersonaRepository tipoPersonaRepository) {
        this.tipoPersonaRepository = tipoPersonaRepository;
    }

    public List<TipoPersonaEntity> obtenerTodosLosTiposPersona() {
        return tipoPersonaRepository.findAll();
    }

    public TipoPersonaEntity guardarTipoPersona(TipoPersonaEntity tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }

    public void eliminarTipoPersona(int id) {
        tipoPersonaRepository.deleteById(id);
    }

    public TipoPersonaEntity actualizarTipoPersona(TipoPersonaEntity tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }
}
