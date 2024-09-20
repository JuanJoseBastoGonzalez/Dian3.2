package  com.example.demo.infrastructure.adapters.output.repositories;

import com.example.demo.domain.entities.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<GeneroEntity, Integer> {
    // Métodos personalizados si son necesarios
}
