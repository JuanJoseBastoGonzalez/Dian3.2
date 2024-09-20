package com.example.demo.infrastructure.adapters.output.repositories;
import com.example.demo.domain.entities.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<SucursalEntity, Integer> {
    // Métodos personalizados si son necesarios
}
