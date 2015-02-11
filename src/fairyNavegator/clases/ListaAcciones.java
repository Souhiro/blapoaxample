package fairyNavegator.clases;

import java.util.List;

import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Substancia;
import fairyNavegator.clases.tiposDato.Accion.Resultado;

public class ListaAcciones {

	public static void creaAcciones(List<Accion> acciones, Mundo mundo) {
		acciones.add(creaAccionMatarWynna(mundo));
		acciones.add(creaAccionMatarKrossy(mundo));
		acciones.add(creaAccionMatarNurgle(mundo));
		acciones.add(creaAccionMatarThamond(mundo));
		acciones.add(creaAccionMatarEnric(mundo));
		acciones.add(creaAccionMatarCama(mundo));
		acciones.add(creaAccionMatarPoster(mundo));
		acciones.add(creaAccionMatarSoundwave(mundo));
		
	}

	private static Accion creaAccionMatarWynna(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_WYNNA), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.getNombre(Constantes.SUB_WYNNA).incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("No puedo matarla OTRA VEZ. Aunque ganas no me faltan");
				} else {
					System.out.println("Vale, me cargo al jodio Chicharo de Lis con mi espada");
					mundo.getNombre(Constantes.SUB_WYNNA).desc = "El cadaver putrefacto de Wynna Kessev, el ex-chicharo de Lis";
					mundo.getNombre(Constantes.SUB_WYNNA).ponPropiedad(Constantes.MUERTO);
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarKrossy(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_KROSSY), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.getNombre(Constantes.SUB_KROSSY).incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("No puedo matarla OTRA VEZ. De hecho, quiero cargarme al que la haya matado");
				} else {
					System.out.println("No, que me cae bien");
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarNurgle(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_NURGLE), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.getNombre(Constantes.SUB_NURGLE).incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("Tampoco es para cebarse con la pobre");
				} else {
					System.out.println("Vale, asesinare a la hermosa, simpatica y agradable de Nurgle con mi fria y cruel espada");
					System.out.println("No se como podre mirarme luego en el espejo, esta tia ha hecho de todo por mi.");
					System.out.println("Hijaputa, si hasta muerta es increiblemente sexy");
					mundo.getNombre(Constantes.SUB_NURGLE).desc = "El sexy cadaver de Nurgle Luzpodrida, mi Ex-Mascota";
					mundo.getNombre(Constantes.SUB_NURGLE).ponPropiedad(Constantes.MUERTO);
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarThamond(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_THAMOND), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
					System.out.println("Tia, que es mi PADRE.");
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarEnric(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_ENRIC), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
					System.out.println("Con lo que me ha costado echarme novio, no me lo voy a cargar aqui mismo");
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarCama(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_CAMA_ELAIA), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.getNombre(Constantes.SUB_CAMA_ELAIA).incluyePropiedad(Constantes.ROTO)) {
					System.out.println("Destrozo AUN MAS mi pobre cama");
				} else {
					System.out.println("En un arrebato de idiotez, me cargo mi cama");
					mundo.getNombre(Constantes.SUB_CAMA_ELAIA).desc = "Gracias, jugador. Ahora tendré que dormir en el puto suelo";
					mundo.getNombre(Constantes.SUB_CAMA_ELAIA).ponPropiedad(Constantes.ROTO);
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarPoster(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_VENTANA_ELAIA), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				System.out.println("Le pego a la pared de la ventana... y no consigo un pimiento, claro");
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarSoundwave(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.getObjeto(Constantes.SUB_ESPADA), (Substancia)mundo.getNombre(Constantes.SUB_SOUNDWAVE), new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				System.out.println("Le pego a Soundwave");
				System.out.println("El chaval es un puñetero MECHA. Una de las creaciones supremas. El muy bestia saca un fusil de positrones y me mata, MUCHO");
				System.out.println("Ahora estoy muerta, gracias a ti, jugador. Muchas gracias.");
				mundo.estoyVivo = false;
				
			}
		});
		
		return accion1;
	}
	
	
}
