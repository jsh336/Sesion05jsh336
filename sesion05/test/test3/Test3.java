package test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio3.Ejercicio3;

public class Test3 {
	Ejercicio3 ej3 = new Ejercicio3();
    @ParameterizedTest
    @CsvSource({
            "abc, password demasiado corto",
            "1234, password demasiado corto",
            "12345, ********",
            "1234567, ********",
            "password123, ************",
            "thisIsAVeryLongPasswordThatExceedsTheMaximumAllowedLength, password demasiado largo",
            "abcdefghijklmnopqrstuvwxyz, password demasiado largo",
            "12345678901234567890123456789012345678901234567890, password demasiado largo"
    })
    public void testMaskPassword(String password, String expected) {
        Assertions.assertEquals(expected, Ejercicio3.Contrasenia(password));
    }
}
