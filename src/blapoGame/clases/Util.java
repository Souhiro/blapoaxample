package blapoGame.clases;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
	
	public static int preguntaHastaCorrecto(Console console, String pregunta, int minimo, int maximo) {
		int resultado;
		String cadenaResultado = "";
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.println(pregunta);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			cadenaResultado = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!isNumeric(cadenaResultado)) {
				// Si no es un numero, REPETIMOS LA PREGUNTA HASTA QUE FUNCIONE
			return preguntaHastaCorrecto(console, pregunta, minimo, maximo);
		}
		
		resultado = Integer.parseInt(cadenaResultado);
		if(resultado < minimo || resultado > maximo) {
				// Si no esta dentro del parametro REPETIMOS LA PREGUNTA HASTA QUE FUNCIONE
			return preguntaHastaCorrecto(console, pregunta, minimo, maximo);
		}
		
			// Si ES un numero, si esta dentro de los valores, entonces SI lo devolvemos
		return resultado;
		
	}
		
		
		// Este no es necesario que lo comprendas... AUN
	public static boolean isNumeric(String cadena) {
		try {
			Integer.valueOf(cadena) ;
				// Hemos logrado convertir "X" en un valor numerico
			return true; 
		} catch (NumberFormatException e) {
				// NO hemos logrado convertir X en un numero
			return false;
		}
	}
}
