package fairyNavegator.clases.tiposDato;

public class Objeto {
	public int idObjeto;
	public String nomObjeto;
	public String descObjeto;
	
	public int localizacion;
	
	public int propiedad1;
	public int propiedad2;
	public int propiedad3;
	
	public Objeto(int idObjeto1, String nomObjeto1, String descObjeto1, int localizacion1) {
		this.idObjeto = idObjeto1;
		this.nomObjeto = nomObjeto1;
		this.descObjeto = descObjeto1;
		this.localizacion = localizacion1;
	}
}
