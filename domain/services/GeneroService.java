package com.example.demo.domain.services;

import com.example.demo.domain.entities.GeneroEntity;
import com.example.demo.infrastructure.adapters.output.repositories.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    private final GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public List<GeneroEntity> obtenerTodosLosGeneros() {
        return generoRepository.findAll();
    }

    public GeneroEntity guardarGenero(GeneroEntity genero) {
        return generoRepository.save(genero);
    }

    public void eliminarGenero(int id) {
        generoRepository.deleteById(id);
    }

    public GeneroEntity actualizarGenero(GeneroEntity genero) {
        return generoRepository.save(genero);
    }
}
