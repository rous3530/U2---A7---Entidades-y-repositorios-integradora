package mx.edu.utez.crudoswaldo.repository;

import mx.edu.utez.crudoswaldo.model.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Integer> {
}
