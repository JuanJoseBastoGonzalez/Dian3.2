package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<PaisEntity, Integer> {
    // Métodos personalizados, si es necesario
}
