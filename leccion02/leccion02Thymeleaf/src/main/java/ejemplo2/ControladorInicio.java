package ejemplo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author octavio
 */
@Slf4j
@RestController
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador");
        log.debug("mas detalle del controlador");
        return "Hola Mundo con spring 2";
    }
    
}
