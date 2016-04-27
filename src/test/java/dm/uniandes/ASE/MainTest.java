package dm.uniandes.ASE;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
	
	/**
	 * Metodo principal Prueba 1.
	 */
	@Test
	public void test1() {
		Double resultado = Main.algo("test1.txt").get("rXY");
		assertEquals("La Integral deberia ser 0.55338", 0.55338, resultado, 1e-2);
	}


}
