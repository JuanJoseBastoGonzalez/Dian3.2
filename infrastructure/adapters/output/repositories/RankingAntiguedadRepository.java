package com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.RankingAntiguedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingAntiguedadRepository extends JpaRepository<RankingAntiguedadEntity, Integer> {
    // Métodos personalizados si son necesarios
}
