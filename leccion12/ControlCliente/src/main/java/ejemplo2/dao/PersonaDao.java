package ejemplo2.dao;

import ejemplo2.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author octavio
 */

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
