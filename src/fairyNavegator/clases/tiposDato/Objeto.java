package fairyNavegator.clases.tiposDato;

public class Objeto extends Substancia{
	public int idObjeto;
	public String nom;
	public String desc;
	
	public int propiedad1;
	public int propiedad2;
	public int propiedad3;
	
	public Objeto(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1) {
		this.idObjeto = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
	}
}
