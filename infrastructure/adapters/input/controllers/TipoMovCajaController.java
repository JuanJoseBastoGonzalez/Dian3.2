package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.TipoMovCajaEntity;
import com.example.demo.domain.services.TipoMovCajaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos_mov_caja")
public class TipoMovCajaController {

    private final TipoMovCajaService tipoMovCajaService;

    public TipoMovCajaController(TipoMovCajaService tipoMovCajaService) {
        this.tipoMovCajaService = tipoMovCajaService;
    }

    @GetMapping
    public List<TipoMovCajaEntity> obtenerTiposMovCaja() {
        return tipoMovCajaService.obtenerTodosLosTiposMovCaja();
    }

    @PostMapping
    public TipoMovCajaEntity guardarTipoMovCaja(@RequestBody TipoMovCajaEntity tipoMovCaja) {
        return tipoMovCajaService.guardarTipoMovCaja(tipoMovCaja);
    }

    @PutMapping
    public TipoMovCajaEntity actualizarTipoMovCaja(@RequestBody TipoMovCajaEntity tipoMovCaja) {
        return tipoMovCajaService.actualizarTipoMovCaja(tipoMovCaja);
    }

    @DeleteMapping("/{id}")
    public void eliminarTipoMovCaja(@PathVariable int id) {
        tipoMovCajaService.eliminarTipoMovCaja(id);
    }
}
