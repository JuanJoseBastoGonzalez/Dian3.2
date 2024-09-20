package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.TipoTransaccionEntity;
import com.example.demo.domain.services.TipoTransaccionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipotransacciones")
public class TipoTransaccionController {

    private final TipoTransaccionService tipoTransaccionService;

    public TipoTransaccionController(TipoTransaccionService tipoTransaccionService) {
        this.tipoTransaccionService = tipoTransaccionService;
    }

    @GetMapping
    public List<TipoTransaccionEntity> obtenerTiposTransaccion() {
        return tipoTransaccionService.obtenerTodasLasTiposTransaccion();
    }

    @PostMapping
    public TipoTransaccionEntity guardarTipoTransaccion(@RequestBody TipoTransaccionEntity tipoTransaccion) {
        return tipoTransaccionService.guardarTipoTransaccion(tipoTransaccion);
    }

    @PutMapping
    public TipoTransaccionEntity actualizarTipoTransaccion(@RequestBody TipoTransaccionEntity tipoTransaccion) {
        return tipoTransaccionService.actualizarTipoTransaccion(tipoTransaccion);
    }

    @DeleteMapping("/{id}")
    public void eliminarTipoTransaccion(@PathVariable int id) {
        tipoTransaccionService.eliminarTipoTransaccion(id);
    }
}
