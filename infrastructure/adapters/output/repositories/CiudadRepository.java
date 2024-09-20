package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.CiudadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<CiudadEntity, Integer> {
    // Métodos personalizados, si es necesario
}
