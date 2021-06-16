package ejemplo2.dao;

import ejemplo2.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author octavio
 */

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
