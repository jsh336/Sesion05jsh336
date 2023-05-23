package test2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio2.Ejercicio2;


class Ejercicio2Test {
		Ejercicio2 ej2= new Ejercicio2();
		@CsvSource({
		    "user, Pass1, true",
		    "'', pass, false",
		    "log, '', false",
		    "login, pass1, false",
		    "si, Pass, false",
		    "ewa, PASS4, false",
		    "log, pASS1,",
		    "err, 5478221, false",
		    "buennombre23, contraseni3, false"
		})
			@ParameterizedTest
		void testTransformar(String inputE, String inputV, Boolean expected2) {
			assertEquals(expected2, ej2.login(inputE, inputV));
		}
}	