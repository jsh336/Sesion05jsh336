package testcoches;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejerciciocoches.Coche;
import ejerciciocoches.JsonReader;

class JsonReaderTest {

	  @ParameterizedTest
	    @CsvSource({
	            "data/coches.json, 4",
	            "data/otros_coches.json, 2",
	            "data/vacio.json, 0"
	    })
	    void testLeerCochesJSON(String ruta, int cantidadEsperada) {
	        Coche[] coches = JsonReader.leerCochesJSON(ruta);
	        assertEquals(cantidadEsperada, coches.length);
	    }

	    @ParameterizedTest
	    @CsvSource({
	            "data/coches.json, Toyota, Corolla, 2022, 22000",
	            "data/otros_coches.json, Ford, Mustang, 2021, 45000",
	            "data/vacio.json, , , 0, 0"
	    })
	    void testLeerCochesJSONprimero(String ruta, String marcaEsperada, String modeloEsperado, int anioEsperado, int precioEsperado) {
	        Coche primero = new Coche(marcaEsperada, modeloEsperado, anioEsperado, precioEsperado);
	        Coche[] coches = JsonReader.leerCochesJSON(ruta);
	        assertEquals(primero, coches[0]);
	        assertEquals(primero.hashCode(), coches[0].hashCode());
	        assertEquals(primero.toString(), coches[0].toString());
	    }
	}
