package ejemplo2.dao;

import ejemplo2.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author octavio
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
    
}
