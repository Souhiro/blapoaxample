package fairyNavegator.clases.tiposDato;

import fairyNavegator.clases.Constantes;

public class Inventario {
	public Objeto objeto1;
	public Objeto objeto2;
	public Objeto objeto3;
	public Objeto objeto4;
	public Objeto objeto5;
	
	public String listarInventario() {
		String salida = "";
		if (objeto1 != null) salida = salida + objeto1.nom + ", ";
		if (objeto2 != null) salida = salida + objeto2.nom + ", ";
		if (objeto3 != null) salida = salida + objeto3.nom + ", ";
		if (objeto4 != null) salida = salida + objeto4.nom + ", ";
		if (objeto5 != null) salida = salida + objeto5.nom + ", ";
		
		if (salida.equals("")) { 
			salida = "No tienes nada";
		} else {
			salida = "Tienes " + salida;
		}
		
		return salida;
	}
	
	public boolean inventarioLleno() {
		return (objeto1 != null && objeto2 != null && objeto3 != null && objeto4 != null && objeto5 != null);
	}
	
	public void coger(Objeto objeto, Habitacion habitacionActual) {
		if (!inventarioLleno()) {
			if (objeto.localizacion == habitacionActual.numHab) {
				objeto.localizacion = Constantes.LOCALIZACION_INVENTARIO;
				if(objeto1 == null) objeto1 = objeto; 
				else if(objeto2 == null) objeto2 = objeto;
				else if(objeto3 == null) objeto3 = objeto;
				else if(objeto4 == null) objeto4 = objeto;
				else if(objeto5 == null) objeto5 = objeto;
				System.out.println("Ahora soy el orgulloso propietario de un " + objeto.nom + ".");
			} else {
				System.out.println("No veo ningun " + objeto.nom + " por aqui.");
			}
		} else {
			System.out.println("No soy una mula! Llevo demasiadas cosas");
		}
	}
	
	public void dejar(Objeto objeto, Habitacion habitacionActual) {
		if(objeto.localizacion == Constantes.LOCALIZACION_INVENTARIO) {
				objeto.localizacion = habitacionActual.numHab;
				if(objeto1 == objeto) objeto1 = null; 
				else if(objeto2 == objeto) objeto2 = null;
				else if(objeto3 == objeto) objeto3 = null;
				else if(objeto4 == objeto) objeto4 = null;
				else if(objeto5 == objeto) objeto5 = null;
				System.out.println("He tirado al suelo mi " + objeto.nom + ".");
		} else {
			System.out.println("No llevo ningun " + objeto.nom);
		}
	}
	
	public boolean poseido(Objeto objeto) {
		if(objeto1 == objeto) return true; 
		if(objeto2 == objeto) return true;
		if(objeto3 == objeto) return true;
		if(objeto4 == objeto) return true;
		if(objeto5 == objeto) return true;
		return false;
	}
}
