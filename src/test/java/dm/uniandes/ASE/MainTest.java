package dm.uniandes.ASE;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
	
	/**
	 * Metodo Prueba 1 para veficiar el funcionamientod de la regrasion lineal.
	 */
	@Test
	public void test1() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 2 para veficiar el funcionamientod de la significance.
	 */
	@Test
	public void test2() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 3 para veficiar el funcionamientod el range.
	 */
	@Test
	public void test3() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 4 para veficiar el funcionamientod de UPI .
	 */
	@Test
	public void test4() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 5 para veficiar el funcionamientod de la regrasion lineal.
	 */
	@Test
	public void test5() {
		Double resultado = Main.myProbe("test2.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.933306898", 0.933306898, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 6 para veficiar el funcionamientod de la significance.
	 */
	@Test
	public void test6() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 7 para veficiar el funcionamientod el range.
	 */
	@Test
	public void test7() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}
	
	/**
	 * Metodo Prueba 8 para veficiar el funcionamientod de UPI .
	 */
	@Test
	public void test8() {
		Double resultado = Main.myProbe("test1.txt").get("rXY");
		assertEquals("Rxy deberia ser 0.954496574", 0.954496574, resultado, 1e-4);
	}


}
