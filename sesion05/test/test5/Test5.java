package test5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ejercicio5.Ejercicio5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test5 {

    @ParameterizedTest
    @MethodSource("conjuntosOrdenadosProvider")
    public void testCombinarConjuntosOrdenados(Set<Integer> conjunto1, Set<Integer> conjunto2, Set<Integer> expected) {
        Set<Integer> resultado = Ejercicio5.combinarConjuntosOrdenados(conjunto1, conjunto2);
        assertEquals(expected, resultado);
    }

    private static List<Arguments> conjuntosOrdenadosProvider() {
        List<Arguments> testCases = new ArrayList<>();

        // Caso de prueba 1
        Set<Integer> conjunto1 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> conjunto2 = new TreeSet<>(Arrays.asList(2, 4, 6, 8, 10));
        Set<Integer> expected = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        testCases.add(Arguments.of(conjunto1, conjunto2, expected));

        // Caso de prueba 2
        conjunto1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        conjunto2 = new TreeSet<>(Arrays.asList(4, 5, 6));
        expected = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        testCases.add(Arguments.of(conjunto1, conjunto2, expected));

        // Caso de prueba 3
        conjunto1 = new TreeSet<>(Arrays.asList(2, 4, 6));
        conjunto2 = new TreeSet<>(Arrays.asList(1, 3, 5));
        expected = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        testCases.add(Arguments.of(conjunto1, conjunto2, expected));

        // Caso de prueba 4
        conjunto1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        conjunto2 = new TreeSet<>(Arrays.asList(1, 2, 3));
        expected = new TreeSet<>(Arrays.asList(1, 2, 3));
        testCases.add(Arguments.of(conjunto1, conjunto2, expected));

        return testCases;
    }

    @Test
    public void testMain() {
        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream oldOut = System.out;
        System.setOut(printStream);

        // Ejecutar el método main
        Ejercicio5.main(new String[]{});

        // Restaurar la salida estándar
        System.out.flush();
        System.setOut(oldOut);

        // Verificar la salida esperada
        String expectedOutput = "Conjunto 1: [1, 3, 5, 7, 9]\n" +
                "Conjunto 2: [2, 4, 6, 8, 10]\n" +
                "Conjunto combinado: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}