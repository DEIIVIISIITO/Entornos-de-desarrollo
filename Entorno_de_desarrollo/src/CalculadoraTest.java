import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		assertEquals(11, calculadora.sumar(5, 6));
	}

	@Test
	void testRestar() {
	Calculadora calculadora = new Calculadora();
	assertEquals(6, calculadora.restar(12, 6));
	}

	@Test
	void testMultiplicar() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0, calculadora.multiplicar(null, 6));
	}

	void testDividir() {
		Calculadora calculadora = new Calculadora();
		assertEquals(1, calculadora.dividir(6, 6));
	}
}
