package ejemplo2.util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author octavio
 */
public class EncriptarPassword {
    public static void main(String[] args) {
        String password = "123"; 
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
    }
    
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
 
}
