package fairyNavegator.clases.tiposDato;

public class Nombre extends Substancia {

	public Nombre(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1) {
		this.id = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
	}
	
	public Nombre(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1, int ... propiedades) {
		this.id = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
		
		for(int propiedad : propiedades) {
			this.propiedades.add(propiedad);
		}
	}
}
