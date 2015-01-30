package fairyNavegator.clases.tiposDato;

public class Substancia {
	public int id;

	public String nom;
	public String desc;
	public int localizacion;
	
	public int propiedad1;
	public int propiedad2;
	public int propiedad3;
	
	public boolean incluyePropiedad(int propiedad) {
		return (this.propiedad1 == propiedad || this.propiedad2 == propiedad || this.propiedad3 == propiedad);
	}
}