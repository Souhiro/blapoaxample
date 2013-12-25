package fairyNavegator.clases;

import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Substancia;
import fairyNavegator.clases.tiposDato.Accion.Resultado;

public class ListaAcciones {

	public static void creaAcciones(Mundo mundo) {
		mundo.accion1 = creaAccionMatarWynna(mundo);
		mundo.accion2 = creaAccionMatarKrossy(mundo);
		mundo.accion3 = creaAccionMatarNurgle(mundo);
		
	}

	private static Accion creaAccionMatarWynna(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.objeto1, (Substancia)mundo.nombre5, new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.nombre5.incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("No puedo matarla OTRA VEZ. Aunque ganas no me faltan");
				} else {
					System.out.println("Vale, me cargo al jodio Chicharo de Lis con mi espada");
					mundo.nombre5.desc = "El cadaver putrefacto de Wynna Kessev, el ex-chicharo de Lis";
					mundo.nombre5.propiedad2 = Constantes.MUERTO;
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarKrossy(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.objeto1, (Substancia)mundo.nombre2, new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.nombre2.incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("No puedo matarla OTRA VEZ. De hecho, quiero cargarme al que la haya matado");
				} else {
					System.out.println("No, que me cae bien");
				}
			}
		});
		
		return accion1;
	}

	private static Accion creaAccionMatarNurgle(Mundo mundo) {
		Accion accion1 = new Accion(1, (Substancia)mundo.objeto1, (Substancia)mundo.nombre1, new Resultado() {
			@Override
			public void ejecutar(Mundo mundo) {
				if(mundo.nombre1.incluyePropiedad(Constantes.MUERTO)) {
					System.out.println("Tampoco es para cebarse con la pobre");
				} else {
					System.out.println("Vale, asesinare a la hermosa, simpatica y agradable de Nurgle con mi fria y cruel espada");
					System.out.println("No se como podre mirarme luego en el espejo, esta tia ha hecho de todo por mi.");
					System.out.println("Hijaputa, si hasta muerta es increiblemente sexy");
					mundo.nombre1.desc = "El sexy cadaver de Nurgle Luzpodrida, mi Ex-Mascota";
					mundo.nombre1.propiedad2 = Constantes.MUERTO;
				}
			}
		});
		
		return accion1;
	}
	
	
}
