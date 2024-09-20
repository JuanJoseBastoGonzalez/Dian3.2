package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.TipoTransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoTransaccionRepository extends JpaRepository<TipoTransaccionEntity, Integer> {
    // Métodos personalizados si son necesarios
}
