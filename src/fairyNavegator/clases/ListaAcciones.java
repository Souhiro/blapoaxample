package fairyNavegator.clases;

import java.util.List;

import fairyNavegator.clases.tiposDato.Accion;
import fairyNavegator.clases.tiposDato.Substancia;
import fairyNavegator.clases.tiposDato.Accion.Resultado;

public class ListaAcciones {

	public static void creaAcciones(List<Accion> acciones, Mundo mundo) {
		Accion mataWynna = creaAccionMatarWynna(mundo);
		acciones.add(mataWynna);
		acciones.add(creaAccionMatarKrossy(mundo));
		acciones.add(creaAccionMatarNurgle(mundo));
		
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
					mundo.getNombre(Constantes.SUB_WYNNA).propiedad2 = Constantes.MUERTO;
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
					mundo.getNombre(Constantes.SUB_NURGLE).propiedad2 = Constantes.MUERTO;
				}
			}
		});
		
		return accion1;
	}
	
	
}
