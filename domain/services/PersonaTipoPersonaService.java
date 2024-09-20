package com.example.demo.domain.services;
import com.example.demo.domain.entities.PersonaTipoPersonaEntity;
import com.example.demo.infrastructure.adapters.output.repositories.PersonaTipoPersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaTipoPersonaService {

    private final PersonaTipoPersonaRepository personaTipoPersonaRepository;

    public PersonaTipoPersonaService(PersonaTipoPersonaRepository personaTipoPersonaRepository) {
        this.personaTipoPersonaRepository = personaTipoPersonaRepository;
    }

    public List<PersonaTipoPersonaEntity> obtenerTodosLosPersonasTipoPersona() {
        return personaTipoPersonaRepository.findAll();
    }

    public PersonaTipoPersonaEntity guardarPersonaTipoPersona(PersonaTipoPersonaEntity personaTipoPersona) {
        return personaTipoPersonaRepository.save(personaTipoPersona);
    }

    public void eliminarPersonaTipoPersona(int id) {
        personaTipoPersonaRepository.deleteById(id);
    }

    public PersonaTipoPersonaEntity actualizarPersonaTipoPersona(PersonaTipoPersonaEntity personaTipoPersona) {
        return personaTipoPersonaRepository.save(personaTipoPersona);
    }
}
