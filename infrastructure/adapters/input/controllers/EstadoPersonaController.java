package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.EstadoPersonaEntity;
import com.example.demo.domain.services.EstadoPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados-persona")
public class EstadoPersonaController {

    private final EstadoPersonaService estadoPersonaService;

    public EstadoPersonaController(EstadoPersonaService estadoPersonaService) {
        this.estadoPersonaService = estadoPersonaService;
    }

    @GetMapping
    public List<EstadoPersonaEntity> obtenerEstadosPersona() {
        return estadoPersonaService.obtenerTodosLosEstadosPersona();
    }

    @PostMapping
    public EstadoPersonaEntity guardarEstadoPersona(@RequestBody EstadoPersonaEntity estadoPersona) {
        return estadoPersonaService.guardarEstadoPersona(estadoPersona);
    }

    @PutMapping
    public EstadoPersonaEntity actualizarEstadoPersona(@RequestBody EstadoPersonaEntity estadoPersona) {
        return estadoPersonaService.actualizarEstadoPersona(estadoPersona);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstadoPersona(@PathVariable int id) {
        estadoPersonaService.eliminarEstadoPersona(id);
    }
}
