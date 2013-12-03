package blapoGame.clases;

import blapoGame.clases.tiposDato.Atributos;
import blapoGame.clases.tiposDato.GameConst;
import blapoGame.clases.tiposDato.Hechizo;
import blapoGame.clases.tiposDato.ListaHechizos;
import blapoGame.clases.tiposDato.Personaje;

public class CreadorPersonajes {

	public static Personaje creaElaia() {
		Hechizo powerArmor = new Hechizo(1, "Power Armor", GameConst.MELEE, 0, 4, GameConst.EFECTO_ARMADURA);
		Hechizo thamondBlade = new Hechizo(2, "Espada de Thamond", GameConst.MELEE, 30, 2);
		Hechizo thamondBladeTurbo = new Hechizo(3, "Espada de Thamond Turbo", GameConst.MELEE, 60, 4);
		Hechizo wingedArmor = new Hechizo(4, "Armadura Alada", GameConst.MELEE, 30, 8, GameConst.EFECTO_ARMADURA,
				GameConst.EFECTO_VUELO);
		
		return new Personaje("Elaia Kessev", false, 8, new Atributos(10, 9, 8, 7, 6), 
				new ListaHechizos(powerArmor, thamondBlade, thamondBladeTurbo, wingedArmor));
	}
	
	public static Personaje creaHerry() {
		Hechizo bowsie = new Hechizo(5, "Bowsie", GameConst.DIST, 30, 4);
		Hechizo geodude = new Hechizo(6, "Geodude", GameConst.MELEE, 50, 4);
		Hechizo yashichi = new Hechizo(7, "Yashichi", GameConst.DIST, 80, 6);
		Hechizo archer = new Hechizo(8, "Archer", GameConst.DIST, 100, 8);
		Hechizo nimbus = new Hechizo(9, "Nimbus 2000", GameConst.DIST, 0, 10, GameConst.EFECTO_VUELO);
		
		return new Personaje("Herry Sotter", true, 8, new Atributos(7, 6, 8, 9, 10), 
				new ListaHechizos(bowsie, geodude, yashichi, archer, nimbus));
	}
	
	public static Personaje creaNurgle() {
		Hechizo lightKick = new Hechizo(10, "Light Kick", GameConst.MELEE, 6, 2, GameConst.EFECTO_ATURDIR);
		Hechizo glimmerWing = new Hechizo(11, "Glimmer Wing", GameConst.MELEE, 0, 3, GameConst.EFECTO_VUELO, 
				GameConst.EFECTO_VELOCIDAD);
		Hechizo dazzleBlade = new Hechizo(12, "Dazzle Blade", GameConst.MELEE, 40, 4);
		Hechizo swordRevealer = new Hechizo(13, "Sword of Revealing Light", GameConst.MELEE, 0, 5, 
				GameConst.EFECTO_ANTIILUSIONES, GameConst.EFECTO_RETURNER);
		Hechizo pudreMentes = new Hechizo(14, "Flashing Panty", GameConst.MENTAL, 30, 6, GameConst.EFECTO_SILENCIAR);
		
		return new Personaje("Nurgle Luzpodrida", false, 8, new Atributos(8, 9, 7, 10, 6), 
				new ListaHechizos(lightKick, glimmerWing, dazzleBlade, swordRevealer, pudreMentes));
	}
}
