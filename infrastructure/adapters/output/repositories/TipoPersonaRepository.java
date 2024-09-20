package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.TipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Integer> {
    // Métodos personalizados si son necesarios
}
