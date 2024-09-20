package com.example.demo.domain.services;

import com.example.demo.domain.entities.EstacionPagoEntity;
import com.example.demo.infrastructure.adapters.output.repositories.EstacionPagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionPagoService {

    private final EstacionPagoRepository estacionPagoRepository;

    public EstacionPagoService(EstacionPagoRepository estacionPagoRepository) {
        this.estacionPagoRepository = estacionPagoRepository;
    }

    public List<EstacionPagoEntity> obtenerTodasLasEstaciones() {
        return estacionPagoRepository.findAll();
    }

    public EstacionPagoEntity guardarEstacionPago(EstacionPagoEntity estacionPago) {
        return estacionPagoRepository.save(estacionPago);
    }

    public void eliminarEstacionPago(int id) {
        estacionPagoRepository.deleteById(id);
    }

    public EstacionPagoEntity actualizarEstacionPago(EstacionPagoEntity estacionPago) {
        return estacionPagoRepository.save(estacionPago);
    }
}
