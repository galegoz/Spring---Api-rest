package medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
