package com.example.demo.domain.services;

import com.example.demo.domain.entities.RankingAntiguedadEntity;
import com.example.demo.infrastructure.adapters.output.repositories.RankingAntiguedadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingAntiguedadService {

    private final RankingAntiguedadRepository rankingAntiguedadRepository;

    public RankingAntiguedadService(RankingAntiguedadRepository rankingAntiguedadRepository) {
        this.rankingAntiguedadRepository = rankingAntiguedadRepository;
    }

    public List<RankingAntiguedadEntity> obtenerTodosLosRankings() {
        return rankingAntiguedadRepository.findAll();
    }

    public RankingAntiguedadEntity guardarRanking(RankingAntiguedadEntity rankingAntiguedad) {
        return rankingAntiguedadRepository.save(rankingAntiguedad);
    }

    public void eliminarRanking(int id) {
        rankingAntiguedadRepository.deleteById(id);
    }

    public RankingAntiguedadEntity actualizarRanking(RankingAntiguedadEntity rankingAntiguedad) {
        return rankingAntiguedadRepository.save(rankingAntiguedad);
    }
}
