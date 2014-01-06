package fairyNavegator.clases;

import java.util.List;

import fairyNavegator.clases.tiposDato.Nombre;

public class ListaNombres {

	public static void creaNombres(List<Nombre> nom) {
		nom.add(new Nombre(
				Constantes.SUB_NURGLE,
				"Nurgle", 
				"Esta es tu mascota, Nurgle Luzpodrida, una Afgana que utilizais para hacer fanservice",
				Constantes.HAB_NURGLE, Constantes.PERSONA)
				);
		nom.add(new Nombre(
				Constantes.SUB_KROSSY,
				"Krossy",
				"Krossy, la alegria de la huerta y la experta en mantener a tus amigos con vida porque es enfermera. Antes era un tio.",
				Constantes.HAB_KROSSY, Constantes.PERSONA)
				);
		nom.add(new Nombre(
				Constantes.SUB_THAMOND,
				"Thamond",
				"Thamond el Grande, el heroe mas reputado del reino, y tu padre. Por cosas de la magia, se ve mas joven y fuerte que tu",
				Constantes.HAB_SALON, Constantes.PERSONA)
				);
		nom.add(new Nombre(
				Constantes.SUB_ENRIC,
				"Enric",
				"Tu novio Enric Sigue. Antes era feote, pero cuando el autor decidi� que saliarais juntos lo hizo un chicarron",
				Constantes.HAB_COCINA, Constantes.PERSONA)
				);
		nom.add(new Nombre(
				Constantes.SUB_WYNNA,
				"Wynna",
				"Wynna Kesev, la hija de Thamond, tu medio-hermana, y la cosa mas asquerosa que existe, casi te sacrifica de ni�a, momifico a tu padre y torturo a tus amigos",
				Constantes.HAB_SALIDA, Constantes.PERSONA)
				);
		nom.add(new Nombre(
				Constantes.SUB_CAMA_ELAIA,
				"Cama",
				"Cuando el jugador deje de tocarme las narices, me voy a pegar una siesta de mil pares",
				Constantes.HAB_ELAIA, Constantes.ATREZZO)
				);
		nom.add(new Nombre(
				Constantes.SUB_VENTANA_ELAIA,
				"Ventana",
				"Espera, espera... No es una ventana. Es una PINTADA! Claro, como somos pobres.",
				Constantes.HAB_ELAIA, Constantes.ATREZZO)
				);
		nom.add(new Nombre(
				Constantes.SUB_SOUNDWAVE,
				"Soundwave",
				"Es un Decepticon, dice que nos va a conquistar a todos, pero primero tiene un concierto. No me preocupa.",
				Constantes.HAB_KROSSY, Constantes.ATREZZO)
				);
		nom.add(new Nombre(
				Constantes.SUB_PUERTA, 
				"Puerta", 
				"Una puerta cerrada.", 
				Constantes.HAB_SALON, Constantes.ATREZZO)
				);
	}

}
