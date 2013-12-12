package fairyNavegator.clases.tiposDato;

import fairyNavegator.clases.Constantes;
import fairyNavegator.clases.Mundo;

public class Habitacion {
	public int numHab;
	String defHab;
	public int salidaNorte;
	public int salidaSur;
	public int salidaEste;
	public int salidaOeste;
	Mundo mundo;
	
	public Habitacion(int numHab, String defHab, Integer salidaNorte1, Integer salidaSur1, Integer salidaEste1, Integer salidaOeste1, Mundo mundo1) {
		this.numHab = numHab;
		this.defHab = defHab;
		
		if (salidaNorte1 != null)	this.salidaNorte = salidaNorte1; 	else this.salidaNorte = Constantes.SIN_SALIDA;
		if (salidaSur1 != null) 	this.salidaSur = salidaSur1; 		else this.salidaSur = 	Constantes.SIN_SALIDA;
		if (salidaEste1 != null) 	this.salidaEste = salidaEste1; 		else this.salidaEste = 	Constantes.SIN_SALIDA;
		if (salidaOeste1 != null) 	this.salidaOeste = salidaOeste1; 	else this.salidaOeste = Constantes.SIN_SALIDA;
		
		this.mundo = mundo1;
	}
	
	public String describeHabitacion() {
		String textoSalida = "";
		textoSalida = defHab + "\nLas salidas son: ";
		if (this.salidaNorte != Constantes.SIN_SALIDA) textoSalida = textoSalida + "Norte, ";
		if (this.salidaSur != Constantes.SIN_SALIDA) textoSalida = textoSalida + "Sur, ";
		if (this.salidaEste != Constantes.SIN_SALIDA) textoSalida = textoSalida + "Este, ";
		if (this.salidaOeste != Constantes.SIN_SALIDA) textoSalida = textoSalida + "Oeste, ";
		
		if(this.salidaNorte == Constantes.SIN_SALIDA && this.salidaSur == Constantes.SIN_SALIDA
				&& this.salidaOeste == Constantes.SIN_SALIDA && this.salidaEste == Constantes.SIN_SALIDA) { 
			textoSalida = textoSalida + "Ninguna. Estas prisionero en esta sala y aqui te pudridas."; 
		}
		
		textoSalida = textoSalida + "\n" + consigueListaObjetos();
		
		System.out.println(textoSalida);
		return textoSalida;
	}

	private String consigueListaObjetos() {
		String textoObjetos = "Aqui hay ";
		boolean noHayNada = true;

		if(mundo.objeto1.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto1.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto2.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto2.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto3.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto3.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto4.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto4.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto5.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto5.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto6.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto6.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto7.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto7.nomObjeto + ", " ; noHayNada = false;} 
		if(mundo.objeto8.localizacion == this.numHab) { textoObjetos = textoObjetos + mundo.objeto8.nomObjeto + ", " ; noHayNada = false;}
		
		if(noHayNada == true) textoObjetos = "Aqui no hay ningun objeto interesante";
		
		return textoObjetos;
	}
}