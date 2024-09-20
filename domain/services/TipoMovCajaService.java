package com.example.demo.domain.services;

import com.example.demo.domain.entities.TipoMovCajaEntity;
import com.example.demo.infrastructure.adapters.output.repositories.TipoMovCajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoMovCajaService {

    private final TipoMovCajaRepository tipoMovCajaRepository;

    public TipoMovCajaService(TipoMovCajaRepository tipoMovCajaRepository) {
        this.tipoMovCajaRepository = tipoMovCajaRepository;
    }

    public List<TipoMovCajaEntity> obtenerTodosLosTiposMovCaja() {
        return tipoMovCajaRepository.findAll();
    }

    public TipoMovCajaEntity guardarTipoMovCaja(TipoMovCajaEntity tipoMovCaja) {
        return tipoMovCajaRepository.save(tipoMovCaja);
    }

    public void eliminarTipoMovCaja(int id) {
        tipoMovCajaRepository.deleteById(id);
    }

    public TipoMovCajaEntity actualizarTipoMovCaja(TipoMovCajaEntity tipoMovCaja) {
        return tipoMovCajaRepository.save(tipoMovCaja);
    }
}
