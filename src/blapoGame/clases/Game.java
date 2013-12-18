package blapoGame.clases;

import java.io.Console;

import blapoGame.clases.tiposDato.Personaje;

public class Game {

	private Personaje personaje;
	private Console console;
	
	public Game(Console console) {
		this.console = console;
	}
	
	public void kickOff() {
		int idPersonajeElegido;
		
		System.out.println("Bienvenido al juego de BLAPO");
		idPersonajeElegido = Util.preguntaHastaCorrecto(console, "Elige un personaje:\n 1: Elaia, la Luchadora, \n 2: Herry el tirador o \n 3: Nurgle la tia Sexy", 1, 3);
		
		if(idPersonajeElegido == 1) 
			personaje = CreadorPersonajes.creaElaia();
		if(idPersonajeElegido == 2) 
			personaje = CreadorPersonajes.creaHerry();
		if(idPersonajeElegido == 3) 
			personaje = CreadorPersonajes.creaNurgle();
		
		System.out.println("Has elegido ser " + personaje.getNombre() + " de nivel " + personaje.getNivel());
		System.out.println(personaje.listaHechizos());
	}
}
