package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.EpocaAntiguedadEntity;
import com.example.demo.domain.services.EpocaAntiguedadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/epocas")
public class EpocaAntiguedadController {

    private final EpocaAntiguedadService epocaAntiguedadService;

    public EpocaAntiguedadController(EpocaAntiguedadService epocaAntiguedadService) {
        this.epocaAntiguedadService = epocaAntiguedadService;
    }

    @GetMapping
    public List<EpocaAntiguedadEntity> obtenerEpocas() {
        return epocaAntiguedadService.obtenerTodasLasEpocas();
    }

    @PostMapping
    public EpocaAntiguedadEntity guardarEpoca(@RequestBody EpocaAntiguedadEntity epoca) {
        return epocaAntiguedadService.guardarEpoca(epoca);
    }

    @PutMapping
    public EpocaAntiguedadEntity actualizarEpoca(@RequestBody EpocaAntiguedadEntity epoca) {
        return epocaAntiguedadService.actualizarEpoca(epoca);
    }

    @DeleteMapping("/{id}")
    public void eliminarEpoca(@PathVariable int id) {
        epocaAntiguedadService.eliminarEpoca(id);
    }
}
