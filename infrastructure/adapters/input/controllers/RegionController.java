package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.RegionEntity;
import com.example.demo.domain.services.RegionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regiones")
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public List<RegionEntity> obtenerRegiones() {
        return regionService.obtenerTodasLasRegiones();
    }

    @PostMapping
    public RegionEntity guardarRegion(@RequestBody RegionEntity region) {
        return regionService.guardarRegion(region);
    }

    @PutMapping
    public RegionEntity actualizarRegion(@RequestBody RegionEntity region) {
        return regionService.actualizarRegion(region);
    }

    @DeleteMapping("/{id}")
    public void eliminarRegion(@PathVariable int id) {
        regionService.eliminarRegion(id);
    }
}
