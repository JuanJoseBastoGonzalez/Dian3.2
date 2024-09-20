package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.EpocaAntiguedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpocaAntiguedadRepository extends JpaRepository<EpocaAntiguedadEntity, Integer> {
    // Métodos personalizados si son necesarios
}
