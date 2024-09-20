package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Integer> {
    // Métodos personalizados si son necesarios
}
