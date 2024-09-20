package  com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.EmpresaEntity;
import com.example.demo.domain.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<EmpresaEntity> obtenerEmpresas() {
        return empresaService.obtenerTodasLasEmpresas();
    }

    @PostMapping
    public EmpresaEntity guardarEmpresa(@RequestBody EmpresaEntity empresa) {
        return empresaService.guardarEmpresa(empresa);
    }

    @PutMapping
    public EmpresaEntity actualizarEmpresa(@RequestBody EmpresaEntity empresa) {
        return empresaService.actualizarEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpresa(@PathVariable int id) {
        empresaService.eliminarEmpresa(id);
    }
}
