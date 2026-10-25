package mx.edu.utez.crudoswaldo.repository;

import mx.edu.utez.crudoswaldo.model.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepository extends JpaRepository<Platillo, Integer> {
}
