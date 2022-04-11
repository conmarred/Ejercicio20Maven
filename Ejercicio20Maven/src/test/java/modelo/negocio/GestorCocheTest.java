package modelo.negocio;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import modelo.entidad.Coche;

public class GestorCocheTest {
	
	@Test
	void obtenerCocheTestValido() {
		
		GestorCoche gc = new GestorCoche();
		Coche cocheId1 = new Coche(1, "1234567", "Citroen", "C4", 4000);
		
		assertTrue((cocheId1.toString().equals(gc.obtener(1).toString())));
	}
	
	@Test
	void obtenerCocheTestIncorrecto() {
			
			GestorCoche gc = new GestorCoche();
			Coche cocheId19 = new Coche(19, "1234599", "Kia", "xceed", 405000);
		
			assertFalse((cocheId19.toString().equals(gc.obtener(1).toString())));
	}	

}
