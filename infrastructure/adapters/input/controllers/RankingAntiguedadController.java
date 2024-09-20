package com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.RankingAntiguedadEntity;
import com.example.demo.domain.services.RankingAntiguedadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rankings")
public class RankingAntiguedadController {

    private final RankingAntiguedadService rankingAntiguedadService;

    public RankingAntiguedadController(RankingAntiguedadService rankingAntiguedadService) {
        this.rankingAntiguedadService = rankingAntiguedadService;
    }

    @GetMapping
    public List<RankingAntiguedadEntity> obtenerRankings() {
        return rankingAntiguedadService.obtenerTodosLosRankings();
    }

    @PostMapping
    public RankingAntiguedadEntity guardarRanking(@RequestBody RankingAntiguedadEntity rankingAntiguedad) {
        return rankingAntiguedadService.guardarRanking(rankingAntiguedad);
    }

    @PutMapping
    public RankingAntiguedadEntity actualizarRanking(@RequestBody RankingAntiguedadEntity rankingAntiguedad) {
        return rankingAntiguedadService.actualizarRanking(rankingAntiguedad);
    }

    @DeleteMapping("/{id}")
    public void eliminarRanking(@PathVariable int id) {
        rankingAntiguedadService.eliminarRanking(id);
    }
}
