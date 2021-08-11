package exemplo.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void test3And5Dot2() {
		Triangulo t1 = new Triangulo(3.0, 5.2);
		double expected = 7.8;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void test12Dot7And15Dot2() {
		Triangulo t1 = new Triangulo(12.7, 15.2);
		double expected = 96.52;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}	

}
