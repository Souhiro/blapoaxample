package fairyNavegator.clases.tiposDato;

import fairyNavegator.clases.Mundo;

public class Accion {
	public int idAccion;
	public Substancia ent1;
	public Substancia ent2;
	public Resultado resultado;
	
	public Accion(int id_accion, Substancia objeto1, Substancia nombre5,
			Resultado resultado2) {
		this.idAccion = id_accion;
		this.ent1 = objeto1;
		this.ent2 = nombre5;
		this.resultado = resultado2; 
	}
	
	public Accion(int id_accion, Substancia objeto1, Resultado resultado2) {
		this.idAccion = id_accion;
		this.ent1 = objeto1;
		this.resultado = resultado2; 
	}

	public interface Resultado {
		public void ejecutar(Mundo mundo);
	}
	
	public String toString() {
		return ent1.nom + " " + ent2.nom;
	}
}
