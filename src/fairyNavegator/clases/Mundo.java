package fairyNavegator.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Nombre;
import fairyNavegator.clases.tiposDato.Objeto;
import fairyNavegator.clases.tiposDato.Substancia;

public class Mundo {

	public Habitacion hell;
	public List<Habitacion> hab = new ArrayList<Habitacion>();

	public Objeto sida;
	public List<Objeto> obj = new ArrayList<Objeto>();

	public Nombre goatse;
	public List<Nombre> nom = new ArrayList<Nombre>();

	public List<Accion> acciones = new ArrayList<Accion>();

	public Mundo() {
		ListaHabitaciones.creaHabitaciones(this.hab, this);
		hell = new Habitacion(0, "Nunca deberias estar aqui", null, null, null,
				null, this);
		
		ListaObjetos.creaHabitaciones(this.obj);
		sida = new Objeto(0, "SIDA", "No deberias de tener esto", -1);

		ListaNombres.creaNombres(this.nom);
		goatse = new Nombre(0, "GOATSE", "No deberias de ver esto JAMAS", -1);
		
		ListaAcciones.creaAcciones(acciones, this);
	}

	public Habitacion getHabitacion(int idHabitacion) {
		Habitacion resultado = hell;
		//Recorremos la lista usando el operador Iterator
		Iterator<Habitacion> iHabitacion = hab.iterator();
		while(iHabitacion.hasNext()) {
			Habitacion itHabitacion = iHabitacion.next();
			if (itHabitacion.numHab == idHabitacion) {
				//Si la habitacion tiene el ID que buscamos, lo devolvemos, y listo
				resultado = itHabitacion;
				break;
			}
		}

		return resultado;
	}

	public Objeto getObjeto(int idObjeto) {
		Objeto resultado = sida;

		//Recorremos la lista usando el operador Iterator
		Iterator<Objeto> iObjeto = obj.iterator();
		while(iObjeto.hasNext()) {
			Objeto itObjeto = iObjeto.next();
			if (itObjeto.id == idObjeto) {
				resultado = itObjeto;
				break;
			}
		}
		return resultado;
	}

	public Nombre getNombre(int idNombre) {
		Nombre resultado = goatse;
		
		//Recorremos la lista usando el operador Iterator
		Iterator<Nombre> iNombre = nom.iterator();
		while(iNombre.hasNext()) {
			Nombre itNombre = iNombre.next();
			if (itNombre.id == idNombre) {
				resultado = itNombre;
				break;
			}
		}

		return resultado;
	}

	public Objeto obtenObjeto(String nomObjeto) {
		Objeto resultado = null;
		//Recorremos la lista usando el operador Iterator
		Iterator<Objeto> iObjeto = obj.iterator();
		while(iObjeto.hasNext()) {
			Objeto itObjeto = iObjeto.next();
			if (itObjeto.nom.toUpperCase().equals(nomObjeto.toUpperCase())) {
				resultado = itObjeto;
				break;
			}
		}

		return resultado;
	}

	public Nombre obtenNombre(String nomNombre) {
		Nombre resultado = null;

		//Recorremos la lista usando el operador Iterator
		Iterator<Nombre> iNombre = nom.iterator();
		while(iNombre.hasNext()) {
			Nombre itNombre = iNombre.next();
			if (itNombre.nom.toUpperCase().equals(nomNombre.toUpperCase())) {
				resultado = itNombre;
				break;
			}
		}
		return resultado;
	}
	
	public Substancia obtenSubstancia(String nomSubstancia) {
		Substancia substancia = null;
		substancia = obtenNombre(nomSubstancia);
		if (substancia == null) {
			substancia = obtenObjeto(nomSubstancia);
		}
		return substancia;
	}
	
	

	public boolean objetoDisponible(String nomObjeto, Habitacion hab) {
		Objeto obj = obtenObjeto(nomObjeto);
		boolean resultado = false;
		if (obj != null) {
			if (obj.localizacion == hab.numHab
					|| obj.localizacion == Constantes.LOCALIZACION_INVENTARIO) {
				resultado = true;
			}
		}
		return resultado;
	}

	public boolean entidadDisponible(String nomEntidad, Habitacion hab) {
		boolean resultado = false;
		Substancia sub = obtenObjeto(nomEntidad);
		if (sub == null) {
			sub = obtenNombre(nomEntidad);
		}
		if (sub != null) {
			if (sub.localizacion == hab.numHab
					|| sub.localizacion == Constantes.LOCALIZACION_INVENTARIO) {
				resultado = true;
			}
		}
		return resultado;
	}

}