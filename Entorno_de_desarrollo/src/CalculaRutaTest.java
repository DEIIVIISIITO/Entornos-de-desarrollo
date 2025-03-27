import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculaRutaTest {

	@Test
	void testRutaMasRapida() {
		assertTrue(CalculaRuta.rutaMasRapida("Tetuan" , "Barrio del pilar").contains(null));
	}

}
