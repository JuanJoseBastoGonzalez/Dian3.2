package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.PersonaTipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaTipoPersonaRepository extends JpaRepository<PersonaTipoPersonaEntity, Integer> {
    // Métodos personalizados si son necesarios
}
