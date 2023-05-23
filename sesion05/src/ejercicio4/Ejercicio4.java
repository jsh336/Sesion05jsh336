package ejercicio4;

public class Ejercicio4 {
	public static class TestDiagonales {
	    public static int[][] obtenerDiagonales(int[][] matriz) {
	        int n = matriz.length;
	        int[][] diagonales = new int[2][n];

	        for (int i = 0; i < n; i++) {
	            diagonales[0][i] = matriz[i][i]; // Diagonal principal
	            diagonales[1][i] = matriz[i][n - 1 - i]; // Diagonal secundaria
	        }

	        return diagonales;
	    }

	    public static double[] sumarColumnas(double[][] matriz) {
	        int n = matriz.length;
	        double[] sumas = new double[n];

	        for (int columna = 0; columna < n; columna++) {
	            double suma = 0.0;
	            for (int fila = 0; fila < n; fila++) {
	                suma += matriz[fila][columna];
	            }
	            sumas[columna] = suma;
	        }

	        return sumas;
	    }
}
}