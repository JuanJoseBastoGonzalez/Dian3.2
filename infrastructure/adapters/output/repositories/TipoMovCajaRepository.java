package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.TipoMovCajaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoMovCajaRepository extends JpaRepository<TipoMovCajaEntity, Integer> {
    // Métodos personalizados si son necesarios
}
