package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<RegionEntity, Integer> {
    // Métodos personalizados, si es necesario
}
