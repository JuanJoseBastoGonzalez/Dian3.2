package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.DespachosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespachosRepository extends JpaRepository<DespachosEntity, Integer> {
    // Métodos personalizados si son necesarios
}
