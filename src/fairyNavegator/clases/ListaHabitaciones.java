package fairyNavegator.clases;

import java.util.List;

import fairyNavegator.clases.tiposDato.Habitacion;

public class ListaHabitaciones {

	public static void creaHabitaciones(List<Habitacion> hab, Mundo mundo) {
		hab.add(
				new Habitacion( 
				Constantes.HAB_ELAIA,
				"Esta es tu habitacion, hay una ventana muy linda, una cama cojonuda y un poster de Thamond el Grande",
				null, Constantes.HAB_PASILLO_1, null, null, mundo)
				);
		hab.add(
				new Habitacion(Constantes.HAB_PASILLO_1, "Estas en un pasillo normal y corriente",
				Constantes.HAB_ELAIA, null, Constantes.HAB_PASILLO_2, null, mundo)
				);
		hab.add (new Habitacion(
				Constantes.HAB_PASILLO_2,
				"Estas en un pasillo normal y corriente, pero huele a algo sexy",
				Constantes.HAB_NURGLE, Constantes.HAB_SALON, Constantes.HAB_PASILLO_3, Constantes.HAB_PASILLO_1, mundo)
				);;
		hab.add (new Habitacion(
				Constantes.HAB_NURGLE,
				"Estas en el cuarto de Nurgle Luzpodrida, la Afgana est�a aqui bailoteando y postureando frente a su espejo. Sera presumida!",
				null, Constantes.HAB_PASILLO_2, null, null, mundo)
				);
		hab.add (new Habitacion(
				Constantes.HAB_PASILLO_3,
				"Estas en un pasillo normal y corriente, suena musica, mucha musica",
				Constantes.HAB_KROSSY, null, null, Constantes.HAB_PASILLO_2, mundo)
				);
		hab.add (new Habitacion(
				Constantes.HAB_KROSSY,
				"Este es el cuarto de Krossy. Esta pirada esta ensayando con su guitarra, el transformer Soundwave, y un sintetizador ocho veces mas grande que ella. La rockera esta aqui",
				null, Constantes.HAB_PASILLO_3, null, null, mundo)
				);
		hab.add (new Habitacion(
				Constantes.HAB_SALON,
				"Este es el gran salon de Golden Horn. Esta hecho una mierda porque somos pobres. Hay una fuente que nunca da agua, y un limpiabotas que las ensucia. Aqui esta tu papi, Thamond el Grande",
				Constantes.HAB_PASILLO_2, Constantes.HAB_SALIDA, Constantes.HAB_COCINA, null, mundo)
				);
		hab.add(new Habitacion(
				Constantes.HAB_COCINA,
				"Estas en la cocina, el lugar que te corresponde como mujer. Los fogones, perolos y estropajos te dan la bienvenida. Enric Sigue el cocinero esta aqui",
				null, null, null, 7, mundo)
				);
		hab.add(new Habitacion(
				Constantes.HAB_SALIDA,
				"Esta es la salida del Gremio. En la puerta ves a Wynna, el Chicharo de Lis, y no puedes hacer nada con el. Que asco de Chicharo, de verdad",
				Constantes.HAB_SALON, null, null, null, mundo)
				);		
	}
}
