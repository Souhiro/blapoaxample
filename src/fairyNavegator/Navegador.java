package fairyNavegator;

import java.util.Scanner;

import fairyNavegator.clases.Constantes;
import fairyNavegator.clases.Mundo;
import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Inventario;
import fairyNavegator.clases.tiposDato.Objeto;

public class Navegador {
	
	Habitacion habitacionActual;
	Inventario inventario = new Inventario();
	Mundo mundo = new Mundo();
    Scanner scanner1 = new Scanner( System.in );
	
    public Navegador() {
		String comando = "";	// Esta variable será lo que el usuario escriba
    	
    	habitacionActual = mundo.hab1;			// Tienes que empezar en algun sitio ¿No? La primera habitacion del mundo
		habitacionActual.describeHabitacion();	// Dale algo al jugador. Escribe que ve en el primer cuarto
		do {
			comando = scanner1.nextLine();	
			comando = comando.toUpperCase();
			interpretaComando (comando);
		} while (!comando.equals(Constantes.COMANDO_SALIR));
		
		System.out.println("Abandonas. Me esperaba esa clase de derrota por tu parte");
		
	}
	
	private void interpretaComando(String comando) {
		boolean accionTomada = false;
		
		if(esDireccion(comando)) {
			mueve(comando);
			accionTomada = true;
		}
		
		String[] lineaComando = comando.split(" ");
		if(lineaComando[0].equals("COGER")) {
			Objeto objetoBuscado = mundo.obtenObjeto(lineaComando[1]); 
			if (objetoBuscado != null) {
				inventario.coger(objetoBuscado, habitacionActual);
			} else {
				System.out.println("No se que es un " + lineaComando[1]);
			}
			accionTomada = true;
		}
		
		if(lineaComando[0].equals("DEJAR")) {
			Objeto objetoBuscado = mundo.obtenObjeto(lineaComando[1]); 
			if (objetoBuscado != null) {
				inventario.dejar(objetoBuscado, habitacionActual);
			} else {
				System.out.println("No se que es un " + lineaComando[1]);
			}
			accionTomada = true;
		}

		if(lineaComando[0].equals("INVENTARIO")) {
			System.out.println(inventario.listarInventario());
			accionTomada = true;
		}

		if(lineaComando[0].equals("EXAMINAR")) {
			Objeto objetoBuscado = mundo.obtenObjeto(lineaComando[1]);
			if (objetoBuscado != null) {
				if(inventario.poseido(objetoBuscado) || objetoBuscado.localizacion == habitacionActual.numHab) {
					System.out.println(objetoBuscado.descObjeto);
				} else {
					System.out.println("Aqui no hay ningun " + lineaComando[1]);
				}	
			} else {
				System.out.println("Aqui no hay ningun " + lineaComando[1]);
			}
			accionTomada = true;
		}

		if(lineaComando[0].equals("SALIR")) {
			accionTomada = true;
		}
		
			// Si no es ninguna de las acciones que el procesador conoce, ayudaremos al Player y le daremos la lista de lo que SI puede hacer
		if(!accionTomada) {
			System.out.println("Los comandos son: NORTE, SUR, ESTE, OESTE, COGER, DEJAR, INVENTARIO, EXAMINAR y por supuesto SALIR");
		}
		
	}
	
	private boolean esDireccion(String comando) {
			// Se usa en varios sitios y es una linea larga. Esta funcion ayuda
		if(comando.toUpperCase().equals(Constantes.NORTE) || comando.toUpperCase().equals(Constantes.SUR) ||
				comando.toUpperCase().equals(Constantes.ESTE) || comando.toUpperCase().equals(Constantes.OESTE)) {
			return true;
		} else{
			return false;
		}
	}
	
	private void mueve(String comando) {
		
		if(comando.equals(Constantes.NORTE)) {
			if(habitacionActual.salidaNorte != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Norte");
				habitacionActual = mundo.getHabitacion(habitacionActual.salidaNorte);
			}
			else {
				System.out.println("No puedes ir al Norte desde aqui");
			}
		}
		
		if(comando.equals(Constantes.SUR)) {
			if(habitacionActual.salidaSur != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Sur");
				habitacionActual = mundo.getHabitacion(habitacionActual.salidaSur);
			}
			else {
				System.out.println("No puedes ir al Sur desde aqui");
			}
		}
		
		if(comando.equals(Constantes.ESTE)) {
			if(habitacionActual.salidaEste != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Este");
				habitacionActual = mundo.getHabitacion(habitacionActual.salidaEste);
			}
			else {
				System.out.println("No puedes ir al Este desde aqui");
			}
		}
		
		if(comando.equals(Constantes.OESTE)) {
			if(habitacionActual.salidaOeste != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Oeste");
				habitacionActual = mundo.getHabitacion(habitacionActual.salidaOeste);
			}
			else {
				System.out.println("No puedes ir al Oeste desde aqui");
			}
		}
		
		habitacionActual.describeHabitacion();
	}
}
