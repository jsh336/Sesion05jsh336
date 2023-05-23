package test1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio1.Ejercicio1;


class Ejercicio1Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"10, 1",
				"6, 1",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		Ejercicio1 ex1 = new Ejercicio1();
		assertEquals(expected, ex1.transformar(input));
	}

}