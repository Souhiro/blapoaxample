package blapoGame;

import java.io.Console;

import blapoGame.clases.Game;

public class mainGame {
	
	public static void main(String[] args) {
		Console console = System.console();
		Game juego = new Game(console);
		juego.kickOff();
	}
	// GREM
}
