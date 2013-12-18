package fairyNavegator.clases.tiposDato;

public class Nombre extends Substancia {
	public int idObjeto;
	public String nom;
	public String desc;
	
	public int propiedad1;
	public int propiedad2;
	public int propiedad3;
	
	public Nombre(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1) {
		this.idObjeto = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
	}
	
	public Nombre(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1, int propiedad1) {
		this.idObjeto = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
		
		this.propiedad1 = propiedad1;
	}
	
	public boolean incluyePropiedad(int propiedad) {
		return (this.propiedad1 == propiedad || this.propiedad2 == propiedad || this.propiedad3 == propiedad);
	}
}
