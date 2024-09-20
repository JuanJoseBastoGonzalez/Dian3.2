package com.example.demo.domain.services;

import com.example.demo.domain.entities.DespachosEntity;
import com.example.demo.infrastructure.adapters.output.repositories.DespachosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespachosService {

    private final DespachosRepository despachosRepository;

    public DespachosService(DespachosRepository despachosRepository) {
        this.despachosRepository = despachosRepository;
    }

    public List<DespachosEntity> obtenerTodosLosDespachos() {
        return despachosRepository.findAll();
    }

    public DespachosEntity guardarDespacho(DespachosEntity despacho) {
        return despachosRepository.save(despacho);
    }

    public void eliminarDespacho(int id) {
        despachosRepository.deleteById(id);
    }

    public DespachosEntity actualizarDespacho(DespachosEntity despacho) {
        return despachosRepository.save(despacho);
    }
}
