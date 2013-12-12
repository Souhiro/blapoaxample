package fairyNavegator.clases;

import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Objeto;

public class Mundo {
	
	public Habitacion hell;
	public Habitacion hab1;
	public Habitacion hab2;
	public Habitacion hab3;
	public Habitacion hab4;
	public Habitacion hab5;
	public Habitacion hab6;
	public Habitacion hab7;
	public Habitacion hab8;
	public Habitacion hab9;
	
	public Objeto sida;
	public Objeto objeto1;
	public Objeto objeto2;
	public Objeto objeto3;
	public Objeto objeto4;
	public Objeto objeto5;
	public Objeto objeto6;
	public Objeto objeto7;
	public Objeto objeto8;
	
	public Mundo() {
		hab1 = new Habitacion(1, "Esta es tu habitación, hay una ventana muy linda, una cama cojonuda y un poster de Thamond el Grande", null, 2, null, null, this);
		hab2 = new Habitacion(2, "Estas en un pasillo normal y corriente", 1, null, 3, null, this);
		hab3 = new Habitacion(3, "Estas en un pasillo normal y corriente, pero huele a algo sexy", 4, 7, 5, 2, this);
		hab4 = new Habitacion(4, "Estas en el cuarto de Nurgle Luzpodrida, la Afgana está aqui bailoteando y postureando frente a su espejo ¡Será presumida!", null, 3, null, null, this);
		hab5 = new Habitacion(5, "Estas en un pasillo normal y corriente, suena musica, mucha musica", 6, null, null, 3, this);
		hab6 = new Habitacion(6, "Este es el cuarto de Krossy. Esta pirada está ensayando con su guitarra, el transformer Soundwave, y un sintetizador ocho veces mas grande que ella. La rockera está aqui", null, 5, null, null, this);
		hab7 = new Habitacion(7, "Este es el gran salon de Golden Horn. Está hecho una mierda porque somos pobres. Hay una fuente que nunca da agua, y un limpiabotas que las ensucia. Aqui está tu papi, Thamond el Grande", 3, 9, 8, null, this);
		hab8 = new Habitacion(8, "Estas en la cocina, el lugar que te corresponde como mujer. Los fogones, perolos y estropajos te dan la bienvenida. Enric Sigue el cocinero está aqui", null, null, null, 7, this);
		hab9 = new Habitacion(9, "Esta es la salida del Gremio. En la puerta ves a Wynna, el Chicharo de Lis, y no puedes hacer nada con el. Que asco de Chicharo, de verdad", 8, null, null, null, this);
		
		objeto1 = new Objeto(1, "Espada", "Una espada de buen acero. De hecho, es tu espada, y estas jodidamente orgullosa de ella. Haces de todo con ella", 1);
		objeto2 = new Objeto(2, "Poster", "Un poster del grandioso héroe de Fiore, Thamond el Grande. Se parece a ti, posiblemente porque es tu padre", 1);
		objeto3 = new Objeto(3, "Tacones", "Unos zapatos de vertigo. Si te los pones serás casi medio metro más alta. Y no podrás andar, por supuesto. Sólo Nurgle sabe llevar este tipo de cosas", 4);
		objeto4 = new Objeto(4, "Burhka", "Sin comentarios", 4);
		objeto5 = new Objeto(5, "Libro", "Esta lleno de canciones y partituras de Krossy", 6);
		objeto6 = new Objeto(6, "Guitarra", "Si necesitas que te diga que es una guitarra, no estoy seguro de que quiera que sigas jugando a este juego, de verdad", 6);
		objeto7 = new Objeto(7, "Sarten", "Hecha de Teflon-2. Un buen invento creado por Herry Sotters gracias a esta aleacion, hasta tu puedes cocinar", 8);
		objeto8 = new Objeto(8, "Estropajo", "Para que LIMPIES, cochina", 8);
		
		hell = new Habitacion(0, "Nunca deberias estar aqui", null, null, null, null, this);
		sida = new Objeto(0, "SIDA", "No deberias de tener esto", -1);
	}
	
	public Habitacion getHabitacion(int idHabitacion) {
		Habitacion resultado = hell;
		if(idHabitacion == 1) resultado = hab1;
		if(idHabitacion == 2) resultado = hab2;
		if(idHabitacion == 3) resultado = hab3;
		if(idHabitacion == 4) resultado = hab4;
		if(idHabitacion == 5) resultado = hab5;
		if(idHabitacion == 6) resultado = hab6;
		if(idHabitacion == 7) resultado = hab7;
		if(idHabitacion == 8) resultado = hab8;
		if(idHabitacion == 9) resultado = hab9;
		
		return resultado;
	}

	public Objeto getObjeto(int idObjeto) {
		Objeto resultado = sida;
		if(idObjeto == 1) resultado = objeto1;
		if(idObjeto == 2) resultado = objeto2;
		if(idObjeto == 3) resultado = objeto3;
		if(idObjeto == 4) resultado = objeto4;
		if(idObjeto == 5) resultado = objeto5;
		if(idObjeto == 6) resultado = objeto6;
		if(idObjeto == 7) resultado = objeto7;
		if(idObjeto == 8) resultado = objeto8;
		
		return resultado;
	}

	public Objeto obtenObjeto(String nomObjeto) {
		Objeto resultado = null;
		
		if(objeto1.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto1;
		if(objeto2.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto2;
		if(objeto3.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto3;
		if(objeto4.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto4;
		if(objeto5.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto5;
		if(objeto6.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto6;
		if(objeto7.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto7;
		if(objeto8.nomObjeto.toUpperCase().equals(nomObjeto.toUpperCase())) resultado = objeto8;
		
		return resultado;
	}
	
}
