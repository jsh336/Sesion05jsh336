package test4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio4.Ejercicio4.TestDiagonales;

public class Test4 {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3; 4, 5, 6; 7, 8, 9; 1, 5, 9; 7, 5, 3",
            "10, 20, 30, 40; 50, 60, 70, 80; 90, 100, 110, 120; 10, 60, 110, 120; 40, 70, 100, 90",
            "2; 1, 2; 3, 4; 2, 4",
            "100, 200, 300; 400, 500, 600; 700, 800, 900; 100, 500, 900; 700, 500, 300"
    })
    public void testObtenerDiagonales(String input, String expected) {
        int[][] matriz = parseMatrix(input);
        int[][] diagonales = TestDiagonales.obtenerDiagonales(matriz);

        int[][] expectedDiagonales = parseMatrix(expected);
        Assertions.assertArrayEquals(expectedDiagonales, diagonales);
    }

    @ParameterizedTest
    @CsvSource({
            "1.5, 2.5, 3.5; 4.5, 5.5, 6.5; 7.5, 8.5, 9.5; 13.5, 17.5, 21.5",
            "10.5, 20.5, 30.5, 40.5; 50.5, 60.5, 70.5, 80.5; 90.5, 100.5, 110.5, 120.5; 151.5, 181.5, 211.5, 241.5",
            "2.5; 1.5, 2.5; 3.5, 4.5; 5.0, 7.0",
            "100.5, 200.5, 300.5; 400.5, 500.5, 600.5; 700.5, 800.5, 900.5; 1201.5, 1501.5, 1801.5"
    })
    public void testSumarColumnas(double[][] input, double[] expected) {
        double[] sumasColumnas = TestDiagonales.sumarColumnas(input);
        Assertions.assertArrayEquals(expected, sumasColumnas);
    }

    private int[][] parseMatrix(String input) {
        String[] rows = input.split(";");
        int numRows = rows.length;
        int numCols = rows[0].split(",").length;
        int[][] matrix = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            String[] elements = rows[i].split(",");
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j].trim());
            }
        }

        return matrix;
    }
}

