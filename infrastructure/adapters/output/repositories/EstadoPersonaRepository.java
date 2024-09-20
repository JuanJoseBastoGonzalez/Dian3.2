package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.EstadoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoPersonaRepository extends JpaRepository<EstadoPersonaEntity, Integer> {
    // Métodos personalizados si son necesarios
}
