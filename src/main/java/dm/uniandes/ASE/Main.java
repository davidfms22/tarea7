package dm.uniandes.ASE;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

import java.io.File;
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
		result1 = algo(filePath1);
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
		
		
		get("/result2", (request, response) -> {
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
			return new ModelAndView(attributes, "result2.ftl");
		}, new FreeMarkerEngine());
		
		get("/result3", (request, response) -> {
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
			return new ModelAndView(attributes, "result3.ftl");
		}, new FreeMarkerEngine());
		
		get("/result4", (request, response) -> {
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
			return new ModelAndView(attributes, "result4.ftl");
		}, new FreeMarkerEngine());

	}
	
	/**
	 * Realiza la integral, por medio de instancias de la 
	 * clase Integral
	 * 
	 * @param pX:
	 *            limite superior.
	 * @param pDof:
	 *            funcion a intengrar.
	 * @return result: resultado de la integral.
	 */
	public static Double doIntegral (Double pX, Integer pDof){
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
	public static Double getUpperLimit (Double pP, Integer pDof){
		Integral integral = new Integral(1.0, pDof);
		return integral.findUpperLimit( pP);
	}
	
	public static HashMap<String, Double> algo (String filePath){
		
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
		result=Statistics.linearRegression(data.get("x"), data.get("y"));
		
		return result;
	}

}
