package com.example.demo.domain.services;

import com.example.demo.domain.entities.TipoTransaccionEntity;
import com.example.demo.infrastructure.adapters.output.repositories.TipoTransaccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoTransaccionService {

    private final TipoTransaccionRepository tipoTransaccionRepository;

    public TipoTransaccionService(TipoTransaccionRepository tipoTransaccionRepository) {
        this.tipoTransaccionRepository = tipoTransaccionRepository;
    }

    public List<TipoTransaccionEntity> obtenerTodasLasTiposTransaccion() {
        return tipoTransaccionRepository.findAll();
    }

    public TipoTransaccionEntity guardarTipoTransaccion(TipoTransaccionEntity tipoTransaccion) {
        return tipoTransaccionRepository.save(tipoTransaccion);
    }

    public void eliminarTipoTransaccion(int id) {
        tipoTransaccionRepository.deleteById(id);
    }

    public TipoTransaccionEntity actualizarTipoTransaccion(TipoTransaccionEntity tipoTransaccion) {
        return tipoTransaccionRepository.save(tipoTransaccion);
    }
}
