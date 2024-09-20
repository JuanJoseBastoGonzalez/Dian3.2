package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.PersonaTipoPersonaEntity;
import com.example.demo.domain.services.PersonaTipoPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas-tipo")
public class PersonaTipoPersonaController {

    private final PersonaTipoPersonaService personaTipoPersonaService;

    public PersonaTipoPersonaController(PersonaTipoPersonaService personaTipoPersonaService) {
        this.personaTipoPersonaService = personaTipoPersonaService;
    }

    @GetMapping
    public List<PersonaTipoPersonaEntity> obtenerPersonasTipoPersona() {
        return personaTipoPersonaService.obtenerTodosLosPersonasTipoPersona();
    }

    @PostMapping
    public PersonaTipoPersonaEntity guardarPersonaTipoPersona(@RequestBody PersonaTipoPersonaEntity personaTipoPersona) {
        return personaTipoPersonaService.guardarPersonaTipoPersona(personaTipoPersona);
    }

    @PutMapping
    public PersonaTipoPersonaEntity actualizarPersonaTipoPersona(@RequestBody PersonaTipoPersonaEntity personaTipoPersona) {
        return personaTipoPersonaService.actualizarPersonaTipoPersona(personaTipoPersona);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersonaTipoPersona(@PathVariable int id) {
        personaTipoPersonaService.eliminarPersonaTipoPersona(id);
    }
}
