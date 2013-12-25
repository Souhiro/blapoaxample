package fairyNavegator.clases.tiposDato;

public class Objeto extends Substancia{
	public String nom;
	public String desc;
	
	public Objeto(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1) {
		this.id = idObjeto1;
		this.nom = nomObjeto1;
		this.desc = descObjeto1;
		this.localizacion = localizacion1;
	}
}
