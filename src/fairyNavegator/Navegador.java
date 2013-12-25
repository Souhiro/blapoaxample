package fairyNavegator;

import java.util.Scanner;

import fairyNavegator.clases.Constantes;
import fairyNavegator.clases.Mundo;
import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Inventario;
import fairyNavegator.clases.tiposDato.Nombre;
import fairyNavegator.clases.tiposDato.Objeto;
import fairyNavegator.clases.tiposDato.Substancia;

public class Navegador {

	Habitacion habitacionActual;
	Inventario inventario = new Inventario();
	Mundo mundo = new Mundo();
	Scanner scanner1 = new Scanner(System.in);

	public Navegador() {
		String comando = ""; // Esta variable ser� lo que el usuario escriba

		habitacionActual = mundo.hab9; // Tienes que empezar en algun sitio
		// �No? La primera habitacion del
		// mundo
		inventario.objeto1 = mundo.objeto1;
		mundo.objeto1.localizacion = Constantes.LOCALIZACION_INVENTARIO;
		habitacionActual.describeHabitacion(); // Dale algo al jugador. Escribe
		// que ve en el primer cuarto
		do {
			comando = scanner1.nextLine();
			comando = comando.toUpperCase();
			interpretaComando(comando);
		} while (!comando.equals(Constantes.COMANDO_SALIR));

		System.out
				.println("Abandonas. Me esperaba esa clase de derrota por tu parte");

	}

	private void interpretaComando(String comando) {
		boolean accionTomada = false;

		if (esDireccion(comando)) {
			mueve(comando);
			accionTomada = true;
		}

		String[] lineaComando = comando.split(" ");
		if (lineaComando[0].equals("COGER")) {
			rutinaCoger(lineaComando, mundo);
			accionTomada = true;
		}

		if (lineaComando[0].equals("DEJAR")) {
			Objeto objetoBuscado = mundo.obtenObjeto(lineaComando[1]);
			if (objetoBuscado != null) {
				inventario.dejar(objetoBuscado, habitacionActual);
			} else {
				System.out.println("No se que es un " + lineaComando[1]);
			}
			accionTomada = true;
		}

		if (lineaComando[0].equals("INVENTARIO")) {
			System.out.println(inventario.listarInventario());
			accionTomada = true;
		}

		if (lineaComando[0].equals("EXAMINAR")) {
			rutinaExaminar(lineaComando, mundo);
			accionTomada = true;
		}

		if (lineaComando[0].equals("USAR")) {
			if (mundo.entidadDisponible(lineaComando[1], habitacionActual)) {

				if (mundo.entidadDisponible(lineaComando[3], habitacionActual)) {
					System.out.println("Usas " + lineaComando[1] + " con "
							+ lineaComando[3]);
					Substancia ent1 = mundo.obtenSubstancia(lineaComando[1]);
					Substancia ent2 = mundo.obtenSubstancia(lineaComando[3]);
					Accion accion = encuentraAccion(ent1, ent2);
					accion.resultado.ejecutar(mundo);
				} else {
					System.out.println("No hay " + lineaComando[3]
							+ " a la vista");
				}
			} else {
				System.out.println("No hay " + lineaComando[1] + " a la vista");
			}

			accionTomada = true;
		}

		if (lineaComando[0].equals("SALIR")) {
			accionTomada = true;
		}

		// Si no es ninguna de las acciones que el procesador conoce, ayudaremos
		// al Player y le daremos la lista de lo que SI puede hacer
		if (!accionTomada) {
			System.out
					.println("Los comandos son: NORTE, SUR, ESTE, OESTE, COGER, DEJAR, INVENTARIO, EXAMINAR, USAR y por supuesto SALIR");
		}

	}

	private Accion encuentraAccion(Substancia ent1, Substancia ent2) {
		Accion accion = null;
		if(mundo.accion1.ent1.id == ent1.id && mundo.accion1.ent2.id == ent2.id) {
			accion =  mundo.accion1;
		}
		if(mundo.accion2.ent1.id == ent1.id && mundo.accion2.ent2.id == ent2.id) {
			accion =  mundo.accion2;
		}
		if(mundo.accion3.ent1.id == ent1.id && mundo.accion3.ent2.id == ent2.id) {
			accion =  mundo.accion3;
		}
		return accion;
	}

	private void rutinaCoger(String[] lineaComando, Mundo mundo2) {
		Objeto objetoBuscado = mundo.obtenObjeto(lineaComando[1]);
		// Debido a que se ha alargado, ante la posibilidad de querer coger una
		// persona o una ventana, la funcion crece.
		if (objetoBuscado != null) {
			inventario.coger(objetoBuscado, habitacionActual);
		} else {
			Nombre nombreBuscado = mundo.obtenNombre(lineaComando[1]);
			if (nombreBuscado != null) {
				if (nombreBuscado.localizacion == habitacionActual.numHab) {
					if (nombreBuscado.incluyePropiedad(Constantes.PERSONA)) {
						System.out
								.println("No estoy a favor del esclavismo, ni de secuestrar a "
										+ lineaComando[1] + ".");
					} else {
						System.out
								.println("Soy fuerte, pero no voy a coger este "
										+ lineaComando[1] + ".");
					}
				} else {
					System.out.println("Si acaso pudiera ver por aqui ese "
							+ lineaComando[1] + " que tu dices...");
				}
			} else {
				System.out.println("No se que es un " + lineaComando[1]);
			}
		}
	}

	private void rutinaExaminar(String[] lineaComando, Mundo mundo2) {
		Substancia objetoBuscado = mundo.obtenObjeto(lineaComando[1]);
		if (objetoBuscado == null) {
			objetoBuscado = mundo.obtenNombre(lineaComando[1]);
		}
		if (objetoBuscado != null) {
			if (isObjecto(objetoBuscado)) {
				if (inventario.poseido((Objeto) objetoBuscado)
						|| ((Objeto) objetoBuscado).localizacion == habitacionActual.numHab) {
					System.out.println(((Objeto) objetoBuscado).desc);
				} else {
					System.out.println("Aqui no hay ningun " + lineaComando[1]);
				}
			} else if (isNombre(objetoBuscado)) {
				if (((Nombre) objetoBuscado).localizacion == habitacionActual.numHab) {
					System.out.println(((Nombre) objetoBuscado).desc);
				} else {
					System.out.println("No veo " + lineaComando[1]
							+ " por aqui.");
				}
			}
		} else {
			System.out.println("Acaso crees que se yo lo que es \""
					+ lineaComando[1] + "\", chaval?");
		}
	}

	private boolean esDireccion(String comando) {
		// Se usa en varios sitios y es una linea larga. Esta funcion ayuda
		if (comando.toUpperCase().equals(Constantes.NORTE)
				|| comando.toUpperCase().equals(Constantes.SUR)
				|| comando.toUpperCase().equals(Constantes.ESTE)
				|| comando.toUpperCase().equals(Constantes.OESTE)) {
			return true;
		} else {
			return false;
		}
	}

	private void mueve(String comando) {

		if (comando.equals(Constantes.NORTE)) {
			if (habitacionActual.salidaNorte != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Norte");
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaNorte);
			} else {
				System.out.println("No puedes ir al Norte desde aqui");
			}
		}

		if (comando.equals(Constantes.SUR)) {
			if (habitacionActual.salidaSur != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Sur");
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaSur);
			} else {
				System.out.println("No puedes ir al Sur desde aqui");
			}
		}

		if (comando.equals(Constantes.ESTE)) {
			if (habitacionActual.salidaEste != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Este");
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaEste);
			} else {
				System.out.println("No puedes ir al Este desde aqui");
			}
		}

		if (comando.equals(Constantes.OESTE)) {
			if (habitacionActual.salidaOeste != Constantes.SIN_SALIDA) {
				System.out.println("Vas al Oeste");
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaOeste);
			} else {
				System.out.println("No puedes ir al Oeste desde aqui");
			}
		}

		habitacionActual.describeHabitacion();
	}

	public static boolean isObjecto(Substancia s) {
		return (s instanceof Objeto);
	}

	public static boolean isNombre(Substancia s) {
		return (s instanceof Nombre);
	}
}