package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.SucursalEntity;
import com.example.demo.domain.services.SucursalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping
    public List<SucursalEntity> obtenerSucursales() {
        return sucursalService.obtenerTodasLasSucursales();
    }

    @PostMapping
    public SucursalEntity guardarSucursal(@RequestBody SucursalEntity sucursal) {
        return sucursalService.guardarSucursal(sucursal);
    }

    @PutMapping
    public SucursalEntity actualizarSucursal(@RequestBody SucursalEntity sucursal) {
        return sucursalService.actualizarSucursal(sucursal);
    }

    @DeleteMapping("/{id}")
    public void eliminarSucursal(@PathVariable int id) {
        sucursalService.eliminarSucursal(id);
    }
}
