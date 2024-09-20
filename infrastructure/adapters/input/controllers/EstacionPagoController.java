package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.EstacionPagoEntity;
import com.example.demo.domain.services.EstacionPagoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estaciones_pago")
public class EstacionPagoController {

    private final EstacionPagoService estacionPagoService;

    public EstacionPagoController(EstacionPagoService estacionPagoService) {
        this.estacionPagoService = estacionPagoService;
    }

    @GetMapping
    public List<EstacionPagoEntity> obtenerEstacionesPago() {
        return estacionPagoService.obtenerTodasLasEstaciones();
    }

    @PostMapping
    public EstacionPagoEntity guardarEstacionPago(@RequestBody EstacionPagoEntity estacionPago) {
        return estacionPagoService.guardarEstacionPago(estacionPago);
    }

    @PutMapping
    public EstacionPagoEntity actualizarEstacionPago(@RequestBody EstacionPagoEntity estacionPago) {
        return estacionPagoService.actualizarEstacionPago(estacionPago);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstacionPago(@PathVariable int id) {
        estacionPagoService.eliminarEstacionPago(id);
    }
}
