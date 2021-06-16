package ejemplo2.service;

import ejemplo2.domain.Persona;
import java.util.List;

/**
 *
 * @author octavio
 */
public interface PersonaService {

    /**
     *
     * @return
     */
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
}
