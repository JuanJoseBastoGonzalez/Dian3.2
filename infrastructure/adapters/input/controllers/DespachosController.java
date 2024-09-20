package  com.example.demo.infrastructure.adapters.input.controllers;

import com.example.demo.domain.entities.DespachosEntity;
import com.example.demo.domain.services.DespachosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despachos")
public class DespachosController {

    private final DespachosService despachosService;

    public DespachosController(DespachosService despachosService) {
        this.despachosService = despachosService;
    }

    @GetMapping
    public List<DespachosEntity> obtenerDespachos() {
        return despachosService.obtenerTodosLosDespachos();
    }

    @PostMapping
    public DespachosEntity guardarDespacho(@RequestBody DespachosEntity despacho) {
        return despachosService.guardarDespacho(despacho);
    }

    @PutMapping
    public DespachosEntity actualizarDespacho(@RequestBody DespachosEntity despacho) {
        return despachosService.actualizarDespacho(despacho);
    }

    @DeleteMapping("/{id}")
    public void eliminarDespacho(@PathVariable int id) {
        despachosService.eliminarDespacho(id);
    }
}
