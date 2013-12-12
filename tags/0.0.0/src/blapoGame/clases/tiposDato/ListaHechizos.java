package blapoGame.clases.tiposDato;

public class ListaHechizos {

	private Hechizo hechizo1;
	private Hechizo hechizo2;
	private Hechizo hechizo3;
	private Hechizo hechizo4;
	private Hechizo hechizo5;
	
	public ListaHechizos() {
		this(null, null, null, null, null);
	}
	
	public ListaHechizos(Hechizo hechizo1) {
		this(hechizo1, null, null, null, null);
	}
	
	public ListaHechizos(Hechizo hechizo1,  Hechizo hechizo2) {
		this(hechizo1, hechizo2, null, null, null);
	}
	
	public ListaHechizos(Hechizo hechizo1,  Hechizo hechizo2, Hechizo hechizo3) {
		this(hechizo1, hechizo2, hechizo3, null, null);
	}
	
	public ListaHechizos(Hechizo hechizo1,  Hechizo hechizo2, Hechizo hechizo3, Hechizo hechizo4) {
		this(hechizo1, hechizo2, hechizo3, hechizo4, null);
	}
	
	public ListaHechizos(Hechizo hechizo1,  Hechizo hechizo2, Hechizo hechizo3, Hechizo hechizo4, Hechizo hechizo5) {
		this.hechizo1 = hechizo1;
		this.hechizo2 = hechizo2;
		this.hechizo3 = hechizo3;
		this.hechizo4 = hechizo4;
		this.hechizo5 = hechizo5;
	}
	
	public Hechizo getHechizo1() {
		return hechizo1;
	}
	public void setHechizo1(Hechizo hechizo1) {
		this.hechizo1 = hechizo1;
	}
	public Hechizo getHechizo2() {
		return hechizo2;
	}
	public void setHechizo2(Hechizo hechizo2) {
		this.hechizo2 = hechizo2;
	}
	public Hechizo getHechizo3() {
		return hechizo3;
	}
	public void setHechizo3(Hechizo hechizo3) {
		this.hechizo3 = hechizo3;
	}
	public Hechizo getHechizo4() {
		return hechizo4;
	}
	public void setHechizo4(Hechizo hechizo4) {
		this.hechizo4 = hechizo4;
	}
	public Hechizo getHechizo5() {
		return hechizo5;
	}
	public void setHechizo5(Hechizo hechizo5) {
		this.hechizo5 = hechizo5;
	}
}
