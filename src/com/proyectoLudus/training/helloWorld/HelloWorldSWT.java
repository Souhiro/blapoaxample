package com.proyectoLudus.training.helloWorld;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import fairyNavegator.clases.Constantes;
import fairyNavegator.clases.Mundo;
import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Inventario;
import fairyNavegator.clases.tiposDato.Nombre;
import fairyNavegator.clases.tiposDato.Objeto;
import fairyNavegator.clases.tiposDato.Substancia;

public class HelloWorldSWT {
	
	Habitacion habitacionActual;
	Mundo mundo = new Mundo();
	Inventario inventario = new Inventario(mundo);
	Scanner scanner1 = new Scanner(System.in);
	JTextArea mid;
	
	Map<String, JButton> mButtons = new HashMap<String, JButton>();

	public HelloWorldSWT() {
		String comando = ""; // Esta variable ser� lo que el usuario escriba
		createAndShowGUI();

		habitacionActual = mundo.getHabitacion(Constantes.HAB_ELAIA); // Tienes que empezar en algun sitio
		// No? La primera habitacion del mundo
		inventario.tomar(Constantes.SUB_ESPADA);
		describeHabitacion(habitacionActual.describeHabitacion()); // Dale algo al jugador. Escribe
		// que ve en el primer cuarto
//		do {
//			comando = scanner1.nextLine();
//			comando = comando.toUpperCase();
//			interpretaComando(comando);
//		} while (!comando.equals(Constantes.COMANDO_SALIR) && mundo.estoyVivo);

	}

	private void describeHabitacion(String describeHabitacion) {
		if(mid != null) {
			mid.setText(describeHabitacion);
		} else {
			mid = new JTextArea(describeHabitacion);
		}

		if(this.habitacionActual.salidaNorte != Constantes.SIN_SALIDA) {mButtons.get("N").setEnabled(true);} else {mButtons.get("N").setEnabled(false);} 
		if(this.habitacionActual.salidaSur != Constantes.SIN_SALIDA) {mButtons.get("S").setEnabled(true);} else {mButtons.get("S").setEnabled(false);} 
		if(this.habitacionActual.salidaEste != Constantes.SIN_SALIDA) {mButtons.get("E").setEnabled(true);} else {mButtons.get("E").setEnabled(false);} 
		if(this.habitacionActual.salidaOeste != Constantes.SIN_SALIDA) {mButtons.get("O").setEnabled(true);} else {mButtons.get("O").setEnabled(false);} 
		
	}

	private void interpretaComando(String comando) {
		boolean accionTomada = false;

		if (esDireccion(comando)) {
			mueve(comando);
			accionTomada = true;
		}

		String[] lineaComando = comando.split(" ");
		if (lineaComando[0].equals(Constantes.COMANDO_COGER)) {
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
			rutinaUsar(lineaComando, mundo);
			accionTomada = true;
		}

		if (lineaComando[0].equals("SALIR")) {
			System.out
					.println("Abandonas. Me esperaba esa clase de derrota por tu parte");
			accionTomada = true;
		}

		// Si no es ninguna de las acciones que el procesador conoce, ayudaremos
		// al Player y le daremos la lista de lo que SI puede hacer
		if (!accionTomada) {
			System.out
					.println("Los comandos son: NORTE, SUR, ESTE, OESTE, COGER, DEJAR, INVENTARIO, EXAMINAR, USAR y por supuesto SALIR");
		}

	}

	private void rutinaUsar(String[] lineaComando, Mundo mundo2) {
		if(lineaComando.length > 1) {
			if(lineaComando.length > 2 ) {
				if (mundo.entidadDisponible(lineaComando[1], habitacionActual)) {

					if(lineaComando.length > 3 ) {
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
						System.out.println("Que haga LO QUE?");
					}
				} else {
					System.out.println("No hay " + lineaComando[1] + " a la vista");
				}
			} else {
				System.out.println("Usar, el que? y como? con que?");
			}
		} else {
			System.out.println("Usar, el que? y como? y con que? a ver, que no soy adivina, joder.");
		}
	}

	private Accion encuentraAccion(Substancia ent1, Substancia ent2) {
		Accion accion = null;
		Iterator<Accion> iAccion = mundo.acciones.iterator();
		
		while (iAccion.hasNext()) {
			Accion itAccion = iAccion.next();
			if(itAccion.ent1.id == ent1.id && itAccion.ent2.id == ent2.id) {
				accion = itAccion;
				break;
			}
				
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
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaNorte);
			} else {
				System.out.println("No puedes ir al Norte desde aqui");
			}
		}

		if (comando.equals(Constantes.SUR)) {
			if (habitacionActual.salidaSur != Constantes.SIN_SALIDA) {
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaSur);
			} else {
				System.out.println("No puedes ir al Sur desde aqui");
			}
		}

		if (comando.equals(Constantes.ESTE)) {
			if (habitacionActual.salidaEste != Constantes.SIN_SALIDA) {
				habitacionActual = mundo
						.getHabitacion(habitacionActual.salidaEste);
			} else {
				System.out.println("No puedes ir al Este desde aqui");
			}
		}

		if (comando.equals(Constantes.OESTE)) {
			if (habitacionActual.salidaOeste != Constantes.SIN_SALIDA) {
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
	
	

    public void createAndShowGUI() {
        //Crear la ventana
        JFrame frame = new JFrame("Golden Horn RULES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        
        mainPanel.setLayout(new GridLayout(3,1));
        JPanel topPanel = new JPanel();
        mainPanel.add(topPanel);
        JPanel midPanel = new JPanel();
        mainPanel.add(midPanel);
        JPanel botPanel = new JPanel();
        botPanel.setLayout(new GridLayout(3,3));
        botPanel.add(new JPanel());
        JButton butNorte = new JButton();
        botPanel.add(butNorte);
        botPanel.add(new JPanel());
        botPanel.add(new JPanel());
        JButton butOeste = new JButton();
        botPanel.add(butOeste);
        botPanel.add(new JPanel());
        JButton butEste = new JButton();
        botPanel.add(butEste);
        botPanel.add(new JPanel());
        botPanel.add(new JPanel());
        JButton butSur = new JButton();
        botPanel.add(butSur);
        mainPanel.add(botPanel);
        
        butNorte.setText("N");
        butOeste.setText("O");
        butEste.setText("E");
        butSur.setText("S");

        butNorte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            { mueve("NORTE"); describeHabitacion(habitacionActual.describeHabitacion());}
        });
        butOeste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            { mueve("OESTE"); describeHabitacion(habitacionActual.describeHabitacion());}
        });
        butEste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            { mueve("ESTE"); describeHabitacion(habitacionActual.describeHabitacion());}
        });
        butSur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            { mueve("SUR"); describeHabitacion(habitacionActual.describeHabitacion());}
        });
        
        mButtons.put("N", butNorte);
        mButtons.put("S", butSur);
        mButtons.put("E", butEste);
        mButtons.put("O", butOeste);
        
        topPanel.add(new JLabel("Top"));
        mid = new JTextArea("Mid");
        midPanel.add(mid);
        frame.add(mainPanel);

        //Lo apretujamos todo en una ventana del minimo tamaño, y lo mostramos por pantalla
        frame.pack();
        frame.setVisible(true);
    }
}