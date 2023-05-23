package ejercicio5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio5 {
	  public static <T extends Comparable<T>> Set<T> combinarConjuntosOrdenados(Set<T> conjunto1, Set<T> conjunto2) {
	        Set<T> conjuntoCombinado = new TreeSet<>();
	        Iterator<T> iterator1 = conjunto1.iterator();
	        Iterator<T> iterator2 = conjunto2.iterator();
	        T elemento1 = null;
	        T elemento2 = null;

	        if (iterator1.hasNext()) {
	            elemento1 = iterator1.next();
	        }

	        if (iterator2.hasNext()) {
	            elemento2 = iterator2.next();
	        }

	        while (elemento1 != null && elemento2 != null) {
	            int comparacion = elemento1.compareTo(elemento2);

	            if (comparacion < 0) {
	                conjuntoCombinado.add(elemento1);
	                if (iterator1.hasNext()) {
	                    elemento1 = iterator1.next();
	                } else {
	                    elemento1 = null;
	                }
	            } else if (comparacion > 0) {
	                conjuntoCombinado.add(elemento2);
	                if (iterator2.hasNext()) {
	                    elemento2 = iterator2.next();
	                } else {
	                    elemento2 = null;
	                }
	            } else {
	                conjuntoCombinado.add(elemento1);
	                conjuntoCombinado.add(elemento2);
	                if (iterator1.hasNext()) {
	                    elemento1 = iterator1.next();
	                } else {
	                    elemento1 = null;
	                }
	                if (iterator2.hasNext()) {
	                    elemento2 = iterator2.next();
	                } else {
	                    elemento2 = null;
	                }
	            }
	        }

	        while (elemento1 != null) {
	            conjuntoCombinado.add(elemento1);
	            if (iterator1.hasNext()) {
	                elemento1 = iterator1.next();
	            } else {
	                elemento1 = null;
	            }
	        }

	        while (elemento2 != null) {
	            conjuntoCombinado.add(elemento2);
	            if (iterator2.hasNext()) {
	                elemento2 = iterator2.next();
	            } else {
	                elemento2 = null;
	            }
	        }

	        return conjuntoCombinado;
	    }

	    public static void main(String[] args) {
	        Set<Integer> conjunto1 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
	        Set<Integer> conjunto2 = new TreeSet<>(Arrays.asList(2, 4, 6, 8, 10));

	        Set<Integer> conjuntoCombinado = combinarConjuntosOrdenados(conjunto1, conjunto2);

	        System.out.println("Conjunto 1: " + conjunto1);
	        System.out.println("Conjunto 2: " + conjunto2);
	        System.out.println("Conjunto combinado: " + conjuntoCombinado);
	    }
	}
