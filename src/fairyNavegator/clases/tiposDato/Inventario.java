package fairyNavegator.clases.tiposDato;

import java.util.ArrayList;
import java.util.List;

import fairyNavegator.clases.Constantes;
import fairyNavegator.clases.Mundo;

public class Inventario {
	public List<Objeto> lObjetos;
	public static final int MAX_OBJETOS = 5;
	public Mundo mundo;
	
	public Inventario(Mundo mundo) {
		this.mundo = mundo;
		this.lObjetos = new ArrayList<Objeto>();
	}
	
	public String listarInventario() {
		String salida = "";
		for(Objeto objeto : lObjetos) {
			if (objeto != null) {
				salida = salida + objeto.nom + ", ";
			}
		}
		
		if (salida.equals("")) { 
			salida = "No tengo na de na. Soy pobre cual rata de cloaca.";
		} else {
			salida = "Tengo " + salida + ".";
		}
		
		return salida;
	}
	
	public boolean inventarioLleno() {
		return (lObjetos.size() >= Inventario.MAX_OBJETOS);
	}
	
	public void coger(Objeto objeto, Habitacion habitacionActual) {
		if (!inventarioLleno()) {
			if (objeto.localizacion == habitacionActual.numHab) {
				tomar(objeto);
				System.out.println("Ahora soy el orgulloso propietario de un " + objeto.nom + ".");
			} else {
				System.out.println("No veo ningun " + objeto.nom + " por aqui.");
			}
		} else {
			System.out.println("No soy una mula! Llevo demasiadas cosas");
		}
	}
	
	/**
	 * Tomar puede usarse para forzar un objeto en el inventario, aunque no este "Disponible"
	 * en la misma sala en que estas. No es un comando accesible al usuario
	 * @param objeto
	 */
	public void tomar(Objeto objeto) {
		if (!inventarioLleno()) {
			objeto.localizacion = Constantes.LOCALIZACION_INVENTARIO;
			lObjetos.add(objeto);
		}
	}
	
	/**
	 * Tomar puede usarse para forzar un objeto en el inventario, aunque no este "Disponible"
	 * en la misma sala en que estas. No es un comando accesible al usuario
	 * @param idObjeto
	 */
	public void tomar(int idObjeto) {
		Objeto objeto = mundo.getObjeto(idObjeto);
		tomar(objeto);
	}
	
	public void dejar(Objeto objeto, Habitacion habitacionActual) {
		if(objeto.localizacion == Constantes.LOCALIZACION_INVENTARIO) {
				objeto.localizacion = habitacionActual.numHab;
				lObjetos.remove(objeto);
				System.out.println("He tirado al suelo mi " + objeto.nom + ".");
		} else {
			System.out.println("No llevo ningun " + objeto.nom);
		}
	}

	
	public void perder(Objeto objeto) {
		if(objeto.localizacion == Constantes.LOCALIZACION_INVENTARIO) {
			lObjetos.remove(objeto);
		}
	}
	
	public boolean poseido(Objeto objeto) {
		if(lObjetos.contains(objeto));
		return false;
	}
}
