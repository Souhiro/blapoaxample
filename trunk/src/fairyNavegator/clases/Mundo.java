package fairyNavegator.clases;

import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Habitacion;
import fairyNavegator.clases.tiposDato.Nombre;
import fairyNavegator.clases.tiposDato.Objeto;
import fairyNavegator.clases.tiposDato.Substancia;

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
	public Habitacion hab10;

	public Objeto sida;
	public Objeto objeto1;
	public Objeto objeto2;
	public Objeto objeto3;
	public Objeto objeto4;
	public Objeto objeto5;
	public Objeto objeto6;
	public Objeto objeto7;
	public Objeto objeto8;
	public Objeto objeto9;

	public Nombre goatse;
	public Nombre nombre1;
	public Nombre nombre2;
	public Nombre nombre3;
	public Nombre nombre4;
	public Nombre nombre5;
	public Nombre nombre6;
	public Nombre nombre7;
	public Nombre nombre8;
	public Nombre nombre9;

	public Accion accion1;
	public Accion accion2;
	public Accion accion3;

	public Mundo() {
		hab1 = new Habitacion(
				Constantes.HAB_ELAIA,
				"Esta es tu habitacion, hay una ventana muy linda, una cama cojonuda y un poster de Thamond el Grande",
				null, Constantes.HAB_PASILLO_1, null, null, this);
		hab2 = new Habitacion(Constantes.HAB_PASILLO_1, "Estas en un pasillo normal y corriente",
				Constantes.HAB_ELAIA, null, Constantes.HAB_PASILLO_2, null, this);
		hab3 = new Habitacion(
				Constantes.HAB_PASILLO_2,
				"Estas en un pasillo normal y corriente, pero huele a algo sexy",
				Constantes.HAB_NURGLE, Constantes.HAB_SALON, Constantes.HAB_PASILLO_3, Constantes.HAB_PASILLO_1, this);
		hab4 = new Habitacion(
				Constantes.HAB_NURGLE,
				"Estas en el cuarto de Nurgle Luzpodrida, la Afgana est�a aqui bailoteando y postureando frente a su espejo. Sera presumida!",
				null, Constantes.HAB_PASILLO_2, null, null, this);
		hab5 = new Habitacion(
				Constantes.HAB_PASILLO_3,
				"Estas en un pasillo normal y corriente, suena musica, mucha musica",
				Constantes.HAB_KROSSY, null, null, Constantes.HAB_PASILLO_2, this);
		hab6 = new Habitacion(
				Constantes.HAB_KROSSY,
				"Este es el cuarto de Krossy. Esta pirada esta ensayando con su guitarra, el transformer Soundwave, y un sintetizador ocho veces mas grande que ella. La rockera esta aqui",
				null, Constantes.HAB_PASILLO_3, null, null, this);
		hab7 = new Habitacion(
				Constantes.HAB_SALON,
				"Este es el gran salon de Golden Horn. Esta hecho una mierda porque somos pobres. Hay una fuente que nunca da agua, y un limpiabotas que las ensucia. Aqui esta tu papi, Thamond el Grande",
				Constantes.HAB_PASILLO_2, Constantes.HAB_SALIDA, Constantes.HAB_COCINA, null, this);
		hab8 = new Habitacion(
				Constantes.HAB_COCINA,
				"Estas en la cocina, el lugar que te corresponde como mujer. Los fogones, perolos y estropajos te dan la bienvenida. Enric Sigue el cocinero esta aqui",
				null, null, null, 7, this);
		hab9 = new Habitacion(
				Constantes.HAB_SALIDA,
				"Esta es la salida del Gremio. En la puerta ves a Wynna, el Chicharo de Lis, y no puedes hacer nada con el. Que asco de Chicharo, de verdad",
				Constantes.HAB_SALON, null, null, null, this);

		objeto1 = new Objeto(
					Constantes.SUB_ESPADA,
					"Espada",
					"Una espada de buen acero. De hecho, es tu espada, y estas jodidamente orgullosa de ella. Haces de todo con ella",
					Constantes.HAB_ELAIA);
		objeto2 = new Objeto(
					Constantes.SUB_POSTER,
					"Poster",
					"Un poster del grandioso heroe de Fiore, Thamond el Grande. Se parece a ti, posiblemente porque es tu padre",
					Constantes.HAB_ELAIA);
		objeto3 = new Objeto(
					Constantes.SUB_TACONES,
					"Tacones",
					"Unos zapatos de vertigo. Si te los pones seras casi medio metro mas alta. Y no podras andar, por supuesto. Solo Nurgle sabe llevar este tipo de cosas",
					Constantes.HAB_NURGLE);
		objeto4 = new Objeto(
					Constantes.SUB_BURHKA, 
					"Burhka", 
					"Sin comentarios", 
					Constantes.HAB_NURGLE);
		objeto5 = new Objeto(
					Constantes.SUB_LIBRO,
					"Libro",
					"Esta lleno de canciones y partituras de Krossy", 
					Constantes.HAB_KROSSY);
		objeto6 = new Objeto(
					Constantes.SUB_GUITARRA,
					"Guitarra",
					"Si necesitas que te diga que es una guitarra, no estoy seguro de que quiera que sigas jugando a este juego, de verdad", 
					Constantes.HAB_KROSSY);
		objeto7 = new Objeto(
				Constantes.SUB_SARTEN,
				"Sarten",
				"Hecha de Teflon-2. Un buen invento creado por Herry Sotters gracias a esta aleacion, hasta tu puedes cocinar",
				8);
		objeto8 = new Objeto(Constantes.SUB_ESTROPAJO, "Estropajo", "Para que LIMPIES, cochina", 8);
		objeto9 = new Objeto(Constantes.SUB_LLAVE, "Llave", "Abre una puerta cerrada",
				Constantes.LOCALIZACION_INVENTARIO);

		hell = new Habitacion(0, "Nunca deberias estar aqui", null, null, null,
				null, this);
		sida = new Objeto(0, "SIDA", "No deberias de tener esto", -1);
		goatse = new Nombre(0, "GOATSE", "No deberias de ver esto JAMAS", -1);

		nombre1 = new Nombre(
				Constantes.SUB_NURGLE,
				"Nurgle",
				"Esta es tu mascota, Nurgle Luzpodrida, una Afgana que utilizais para hacer fanservice",
				Constantes.HAB_NURGLE, Constantes.PERSONA);
		nombre2 = new Nombre(
				Constantes.SUB_KROSSY,
				"Krossy",
				"Krossy, la alegria de la huerta y la experta en mantener a tus amigos con vida porque es enfermera. Antes era un tio.",
				Constantes.HAB_KROSSY, Constantes.PERSONA);
		nombre3 = new Nombre(
				Constantes.SUB_THAMOND,
				"Thamond",
				"Thamond el Grande, el heroe mas reputado del reino, y tu padre. Por cosas de la magia, se ve mas joven y fuerte que tu",
				Constantes.HAB_SALON, Constantes.PERSONA);
		nombre4 = new Nombre(
				Constantes.SUB_ENRIC,
				"Enric",
				"Tu novio Enric Sigue. Antes era feote, pero cuando el autor decidi� que saliarais juntos lo hizo un chicarron",
				Constantes.HAB_COCINA, Constantes.PERSONA);
		nombre5 = new Nombre(
				Constantes.SUB_WYNNA,
				"Wynna",
				"Wynna Kesev, la hija de Thamond, tu medio-hermana, y la cosa mas asquerosa que existe, casi te sacrifica de ni�a, momifico a tu padre y torturo a tus amigos",
				Constantes.HAB_SALIDA, Constantes.PERSONA);
		nombre6 = new Nombre(
				Constantes.SUB_CAMA_ELAIA,
				"Cama",
				"Cuando el jugador deje de tocarme las narices, me voy a pegar una siesta de mil pares",
				Constantes.HAB_ELAIA, Constantes.ATREZZO);
		nombre7 = new Nombre(
				Constantes.SUB_VENTANA_ELAIA,
				"Ventana",
				"Espera, espera... No es una ventana. Es una PINTADA! Claro, como somos pobres.",
				Constantes.HAB_ELAIA, Constantes.ATREZZO);
		nombre8 = new Nombre(
				Constantes.SUB_SOUNDWAVE,
				"Soundwave",
				"Es un Decepticon, dice que nos va a conquistar a todos, pero primero tiene un concierto. No me preocupa.",
				Constantes.HAB_KROSSY, Constantes.ATREZZO);
		nombre9 = new Nombre(
				Constantes.SUB_PUERTA, 
				"Puerta", 
				"Una puerta cerrada.", 
				Constantes.HAB_SALON, Constantes.ATREZZO);
		
		ListaAcciones.creaAcciones(this);
	}

	public Habitacion getHabitacion(int idHabitacion) {
		Habitacion resultado = hell;
		if (idHabitacion == Constantes.HAB_NURGLE)
			resultado = hab1;
		if (idHabitacion == 2)
			resultado = hab2;
		if (idHabitacion == 3)
			resultado = hab3;
		if (idHabitacion == 4)
			resultado = hab4;
		if (idHabitacion == 5)
			resultado = hab5;
		if (idHabitacion == 6)
			resultado = hab6;
		if (idHabitacion == 7)
			resultado = hab7;
		if (idHabitacion == 8)
			resultado = hab8;
		if (idHabitacion == 9)
			resultado = hab9;

		return resultado;
	}

	public Objeto getObjeto(int idObjeto) {
		Objeto resultado = sida;
		if (idObjeto == 1)
			resultado = objeto1;
		if (idObjeto == 2)
			resultado = objeto2;
		if (idObjeto == 3)
			resultado = objeto3;
		if (idObjeto == 4)
			resultado = objeto4;
		if (idObjeto == 5)
			resultado = objeto5;
		if (idObjeto == 6)
			resultado = objeto6;
		if (idObjeto == 7)
			resultado = objeto7;
		if (idObjeto == 8)
			resultado = objeto8;

		return resultado;
	}

	public Nombre getNombre(int idNombre) {
		Nombre resultado = goatse;
		if (idNombre == 1)
			resultado = nombre1;
		if (idNombre == 2)
			resultado = nombre2;
		if (idNombre == 3)
			resultado = nombre3;
		if (idNombre == 4)
			resultado = nombre4;
		if (idNombre == 5)
			resultado = nombre5;
		if (idNombre == 6)
			resultado = nombre6;
		if (idNombre == 7)
			resultado = nombre7;
		if (idNombre == 8)
			resultado = nombre8;
		if (idNombre == 9)
			resultado = nombre9;

		return resultado;
	}

	public Objeto obtenObjeto(String nomObjeto) {
		Objeto resultado = null;

		if (objeto1.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto1;
		if (objeto2.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto2;
		if (objeto3.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto3;
		if (objeto4.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto4;
		if (objeto5.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto5;
		if (objeto6.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto6;
		if (objeto7.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto7;
		if (objeto8.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto8;
		if (objeto9.nom.toUpperCase().equals(nomObjeto.toUpperCase()))
			resultado = objeto9;

		return resultado;
	}

	public Nombre obtenNombre(String nomNombre) {
		Nombre resultado = null;

		if (nombre1.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre1;
		if (nombre2.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre2;
		if (nombre3.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre3;
		if (nombre4.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre4;
		if (nombre5.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre5;
		if (nombre6.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre6;
		if (nombre7.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre7;
		if (nombre8.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre8;
		if (nombre9.nom.toUpperCase().equals(nomNombre.toUpperCase()))
			resultado = nombre9;

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