package fairyNavegator.clases;

import java.util.List;

import fairyNavegator.clases.tiposDato.Objeto;

public class ListaObjetos {

	public static void creaHabitaciones(List<Objeto> obj) {
		obj.add(new Objeto(
				Constantes.SUB_ESPADA,
				"Espada", 
				"Una espada de buen acero. De hecho, es tu espada, y estas jodidamente orgullosa de ella. Haces de todo con ella",
				Constantes.HAB_ELAIA)
				);
		obj.add(new Objeto(
					Constantes.SUB_POSTER,
					"Poster",
					"Un poster del grandioso heroe de Fiore, Thamond el Grande. Se parece a ti, posiblemente porque es tu padre",
					Constantes.HAB_ELAIA)
					);
		obj.add(new Objeto(
					Constantes.SUB_TACONES,
					"Tacones",
					"Unos zapatos de vertigo. Si te los pones seras casi medio metro mas alta. Y no podras andar, por supuesto. Solo Nurgle sabe llevar este tipo de cosas",
					Constantes.HAB_NURGLE)
					);
		obj.add(new Objeto(
					Constantes.SUB_BURHKA, 
					"Burhka", 
					"Sin comentarios", 
					Constantes.HAB_NURGLE)
					);
		obj.add(new Objeto(
					Constantes.SUB_LIBRO,
					"Libro",
					"Esta lleno de canciones y partituras de Krossy", 
					Constantes.HAB_KROSSY)
					);
		obj.add(new Objeto(
					Constantes.SUB_GUITARRA,
					"Guitarra",
					"Si necesitas que te diga que es una guitarra, no estoy seguro de que quiera que sigas jugando a este juego, de verdad", 
					Constantes.HAB_KROSSY)
					);
		obj.add(new Objeto(
					Constantes.SUB_SARTEN,
					"Sarten",
					"Hecha de Teflon-2. Un buen invento creado por Herry Sotters gracias a esta aleacion, hasta tu puedes cocinar",
					8)
					);
		obj.add(new Objeto(
					Constantes.SUB_ESTROPAJO, 
					"Estropajo", 
					"Para que LIMPIES, cochina", 
					Constantes.HAB_COCINA)
					);
		obj.add(new Objeto(
					Constantes.SUB_LLAVE, 
					"Llave", 
					"Abre una puerta cerrada",
					Constantes.LOCALIZACION_INVENTARIO)
					);
	}
}
