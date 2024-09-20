package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.CiudadEntity;
import com.example.demo.domain.services.CiudadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    private final CiudadService ciudadService;

    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping
    public List<CiudadEntity> obtenerCiudades() {
        return ciudadService.obtenerTodasLasCiudades();
    }

    @PostMapping
    public CiudadEntity guardarCiudad(@RequestBody CiudadEntity ciudad) {
        return ciudadService.guardarCiudad(ciudad);
    }

    @PutMapping
    public CiudadEntity actualizarCiudad(@RequestBody CiudadEntity ciudad) {
        return ciudadService.actualizarCiudad(ciudad);
    }

    @DeleteMapping("/{id}")
    public void eliminarCiudad(@PathVariable int id) {
        ciudadService.eliminarCiudad(id);
    }
}
