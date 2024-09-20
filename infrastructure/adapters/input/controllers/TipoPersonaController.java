package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.TipoPersonaEntity;
import com.example.demo.domain.services.TipoPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos-persona")
public class TipoPersonaController {

    private final TipoPersonaService tipoPersonaService;

    public TipoPersonaController(TipoPersonaService tipoPersonaService) {
        this.tipoPersonaService = tipoPersonaService;
    }

    @GetMapping
    public List<TipoPersonaEntity> obtenerTiposPersona() {
        return tipoPersonaService.obtenerTodosLosTiposPersona();
    }

    @PostMapping
    public TipoPersonaEntity guardarTipoPersona(@RequestBody TipoPersonaEntity tipoPersona) {
        return tipoPersonaService.guardarTipoPersona(tipoPersona);
    }

    @PutMapping
    public TipoPersonaEntity actualizarTipoPersona(@RequestBody TipoPersonaEntity tipoPersona) {
        return tipoPersonaService.actualizarTipoPersona(tipoPersona);
    }

    @DeleteMapping("/{id}")
    public void eliminarTipoPersona(@PathVariable int id) {
        tipoPersonaService.eliminarTipoPersona(id);
    }
}
