package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.PaisEntity;
import com.example.demo.domain.services.PaisService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public List<PaisEntity> obtenerPaises() {
        return paisService.obtenerTodosLosPaises();
    }

    @PostMapping
    public PaisEntity guardarPais(@RequestBody PaisEntity pais) {
        return paisService.guardarPais(pais);
    }

    @PutMapping
    public PaisEntity actualizarPais(@RequestBody PaisEntity pais) {
        return paisService.actualizarPais(pais);
    }

    @DeleteMapping("/{id}")
    public void eliminarPais(@PathVariable int id) {
        paisService.eliminarPais(id);
    }
}
