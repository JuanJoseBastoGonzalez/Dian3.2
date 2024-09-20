package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.GeneroEntity;
import com.example.demo.domain.services.GeneroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    private final GeneroService generoService;

    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping
    public List<GeneroEntity> obtenerGeneros() {
        return generoService.obtenerTodosLosGeneros();
    }

    @PostMapping
    public GeneroEntity guardarGenero(@RequestBody GeneroEntity genero) {
        return generoService.guardarGenero(genero);
    }

    @PutMapping
    public GeneroEntity actualizarGenero(@RequestBody GeneroEntity genero) {
        return generoService.actualizarGenero(genero);
    }

    @DeleteMapping("/{id}")
    public void eliminarGenero(@PathVariable int id) {
        generoService.eliminarGenero(id);
    }
}
