package eu.stiekema.jeroen.archetypes.springmvc.security;

import java.util.Date;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Jeroen Stiekema
 */
public class PasswordEncoderTest {

    @Test
    public void bCryptPasswordEncoderTest() {
        for (int rounds = 10; rounds < 31; rounds++) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(rounds);
            long start = new Date().getTime();
            String password = encoder.encode("bob123");
            long end = new Date().getTime();
            System.out.println("encoding password with " + rounds +" rounds: " + (end - start));
            System.out.println(password);
        }
    }
}
