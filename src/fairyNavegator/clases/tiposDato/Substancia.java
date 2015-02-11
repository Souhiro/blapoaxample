package fairyNavegator.clases.tiposDato;

import java.util.ArrayList;
import java.util.List;

public class Substancia {
	public int id;

	public String nom;
	public String desc;
	public int localizacion;
	
	public List<Integer> propiedades = new ArrayList<Integer>();
	
	public boolean incluyePropiedad(int propiedad) {
		return this.propiedades.contains(propiedad);
	}
	
	public void ponPropiedad(int propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void quitaPropiedad(int propiedad) {
		this.propiedades.remove(propiedad);
	}
}