package com.example.demo.domain.services;

import com.example.demo.domain.entities.EmpresaEntity;
import com.example.demo.infrastructure.adapters.output.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<EmpresaEntity> obtenerTodasLasEmpresas() {
        return empresaRepository.findAll();
    }

    public EmpresaEntity guardarEmpresa(EmpresaEntity empresa) {
        return empresaRepository.save(empresa);
    }

    public void eliminarEmpresa(int id) {
        empresaRepository.deleteById(id);
    }

    public EmpresaEntity actualizarEmpresa(EmpresaEntity empresa) {
        return empresaRepository.save(empresa);
    }
}
