package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.EstacionPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionPagoRepository extends JpaRepository<EstacionPagoEntity, Integer> {
    // Métodos personalizados si son necesarios
}
