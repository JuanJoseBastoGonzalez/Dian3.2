package com.example.demo.domain.services;

import com.example.demo.domain.entities.RegionEntity;
import com.example.demo.infrastructure.adapters.output.repositories.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public List<RegionEntity> obtenerTodasLasRegiones() {
        return regionRepository.findAll();
    }

    public RegionEntity guardarRegion(RegionEntity region) {
        return regionRepository.save(region);
    }

    public void eliminarRegion(int id) {
        regionRepository.deleteById(id);
    }

    public RegionEntity actualizarRegion(RegionEntity region) {
        return regionRepository.save(region);
    }
}
