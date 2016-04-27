package dm.uniandes.ASE;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

/***********************************************************************************/
/*                                                                                 */
/* Nombre:         David Francisco Martinez Salcedo                                */
/* Fecha:          13/04/2016                                                      */
/* Descripción:    Programa final de conceptos avanzados de ingenieria             */
/*                                                                                 */
/***********************************************************************************/

/**
 * Esta clase es la principal o raiz del programa, y desde esta se reliza toda
 * la logica en general por medio de las demas clases
 * 
 * @author David Martinez
 *
 */

public class Main {

	private static String filePath1 = "test1.txt";
	private static String filePath2 = "test2.txt";
	private static String filePath3 = "test3.txt";
	private static String filePath4 = "test4.txt";

	// Metodos

	/**
	 * Metodo principal del programa.
	 * 
	 * @param args:
	 *            lista de argumentos.
	 */
	public static void main(String[] args) {

		port(Integer.valueOf(System.getenv("PORT")));
		staticFileLocation("/public");

		get("/", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();

			return new ModelAndView(attributes, "index.ftl");
		}, new FreeMarkerEngine());

		post("/toTest1", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("A1", "");
			attributes.put("A2", "");
			attributes.put("A3", "");
			attributes.put("A4", "");
			attributes.put("A5", "");
			attributes.put("A6", "");
			attributes.put("A7", "");
			attributes.put("A8", "");
			attributes.put("A9", "");
			return new ModelAndView(attributes, "test1.ftl");
		}, new FreeMarkerEngine());

		post("/toTest2", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("B1", "");
			attributes.put("B2", "");
			attributes.put("B3", "");
			attributes.put("B4", "");
			attributes.put("B5", "");
			attributes.put("B6", "");
			attributes.put("B7", "");
			attributes.put("B8", "");
			attributes.put("B9", "");
			return new ModelAndView(attributes, "test2.ftl");
		}, new FreeMarkerEngine());

		post("/toTest3", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("C1", "");
			attributes.put("C2", "");
			attributes.put("C3", "");
			attributes.put("C4", "");
			attributes.put("C5", "");
			attributes.put("C6", "");
			attributes.put("C7", "");
			attributes.put("C8", "");
			attributes.put("C9", "");
			return new ModelAndView(attributes, "test3.ftl");
		}, new FreeMarkerEngine());

		post("/toTest4", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("D1", "");
			attributes.put("D2", "");
			attributes.put("D3", "");
			attributes.put("D4", "");
			attributes.put("D5", "");
			attributes.put("D6", "");
			attributes.put("D7", "");
			attributes.put("D8", "");
			attributes.put("D9", "");
			return new ModelAndView(attributes, "test4.ftl");
		}, new FreeMarkerEngine());

		HashMap<String, Double> result1 = new HashMap<String, Double>();
		result1 = myProbe(filePath1);
		String a1 = result1.get("rXY").toString();
		String a2 = result1.get("r2").toString();
		String a3 = "";
		String a4 = result1.get("beta0").toString();
		String a5 = result1.get("beta1").toString();
		String a6 = result1.get("yK").toString();
		String a7 = "";
		String a8 = "";
		String a9 = "";

		get("/result1", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("A1", a1);
			attributes.put("A2", a2);
			attributes.put("A3", a3);
			attributes.put("A4", a4);
			attributes.put("A5", a5);
			attributes.put("A6", a6);
			attributes.put("A7", a7);
			attributes.put("A8", a8);
			attributes.put("A9", a9);
			return new ModelAndView(attributes, "result1.ftl");
		}, new FreeMarkerEngine());

		HashMap<String, Double> result2 = new HashMap<String, Double>();
		result2 = myProbe(filePath2);
		String b1 = result2.get("rXY").toString();
		String b2 = result2.get("r2").toString();
		String b3 = "";
		String b4 = result2.get("beta0").toString();
		String b5 = result2.get("beta1").toString();
		String b6 = result2.get("yK").toString();
		String b7 = "";
		String b8 = "";
		String b9 = "";

		get("/result2", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("B1", b1);
			attributes.put("B2", b2);
			attributes.put("B3", b3);
			attributes.put("B4", b4);
			attributes.put("B5", b5);
			attributes.put("B6", b6);
			attributes.put("B7", b7);
			attributes.put("B8", b8);
			attributes.put("B9", b9);
			return new ModelAndView(attributes, "result2.ftl");
		}, new FreeMarkerEngine());

		HashMap<String, Double> result3 = new HashMap<String, Double>();
		result3 = myProbe(filePath3);
		String c1 = result3.get("rXY").toString();
		String c2 = result3.get("r2").toString();
		String c3 = "";
		String c4 = result3.get("beta0").toString();
		String c5 = result3.get("beta1").toString();
		String c6 = result3.get("yK").toString();
		String c7 = "";
		String c8 = "";
		String c9 = "";

		get("/result3", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("C1", c1);
			attributes.put("C2", c2);
			attributes.put("C3", c3);
			attributes.put("C4", c4);
			attributes.put("C5", c5);
			attributes.put("C6", c6);
			attributes.put("C7", c7);
			attributes.put("C8", c8);
			attributes.put("C9", c9);
			return new ModelAndView(attributes, "result3.ftl");
		}, new FreeMarkerEngine());

		HashMap<String, Double> result4 = new HashMap<String, Double>();
		result4 = myProbe(filePath4);
		String d1 = result4.get("rXY").toString();
		String d2 = result4.get("r2").toString();
		String d3 = "";
		String d4 = result4.get("beta0").toString();
		String d5 = result4.get("beta1").toString();
		String d6 = result4.get("yK").toString();
		String d7 = "";
		String d8 = "";
		String d9 = "";

		get("/result4", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("D1", d1);
			attributes.put("D2", d2);
			attributes.put("D3", d3);
			attributes.put("D4", d4);
			attributes.put("D5", d5);
			attributes.put("D6", d6);
			attributes.put("D7", d7);
			attributes.put("D8", d8);
			attributes.put("D9", d9);
			return new ModelAndView(attributes, "result4.ftl");
		}, new FreeMarkerEngine());

	}

	/**
	 * Realiza la integral, por medio de instancias de la clase Integral
	 * 
	 * @param pX:
	 *            limite superior.
	 * @param pDof:
	 *            funcion a intengrar.
	 * @return result: resultado de la integral.
	 */
	public static Double doIntegral(Double pX, Integer pDof) {
		Integral integral = new Integral(pX, pDof);
		return integral.calculate();
	}

	/**
	 * Encuentra el valor de x para un valor p dado y un dof
	 * 
	 * @param pX:
	 *            limite superior.
	 * @param pDof:
	 *            funcion a intengrar.
	 * @return result: resultado de la integral.
	 */
	public static Double getUpperLimit(Double pP, Integer pDof) {
		Integral integral = new Integral(1.0, pDof);
		return integral.findUpperLimit(pP);
	}

	/**
	 * Metodo que raliza todos los calculos del dasboard Ecos
	 * 
	 * @param filePath:
	 *            ruta del archivo que contiene los datos.
	 * @return result: lista de valores calculados.
	 */
	public static HashMap<String, Double> myProbe(String filePath) {

		HashMap<String, List<Double>> data = new HashMap<String, List<Double>>();
		try {
			data = FileFinder.getPairData(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMap<String, Double> result = new HashMap<String, Double>();
		result = Statistics.linearRegression(data.get("x"), data.get("y"));

		return result;
	}

}
