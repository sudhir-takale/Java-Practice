package sudhir;

import java.security.SecureRandom;
import java.util.Arrays;

public class CryptoSecurityCode {

    public static void main(String[] args) {
        SecureRandom sng = new SecureRandom();

        byte [] randomBytes = new byte[16];
        sng.nextBytes(randomBytes);
        System.out.println(Arrays.toString(randomBytes));
    }

}
