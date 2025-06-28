package blapoGame.clases.tiposDato;

import java.util.ArrayList;
import java.util.List;

public class ListaHechizos {

	private List<Hechizo> lHechizos;
	
	public ListaHechizos() {
		this.lHechizos = new ArrayList<>();
	}
	
	public ListaHechizos(Hechizo ...hechizos ) {
		this.lHechizos = new ArrayList<>();
		for(Hechizo hechizo : hechizos) {
			lHechizos.add(hechizo);
		}
	}
	
	public Hechizo getHechizo1() {
		return getHechizo(1);
	}
	public void setHechizo1(Hechizo hechizo1) {
		this.lHechizos.set(0, hechizo1);
	}
	public Hechizo getHechizo2() {
		return getHechizo(2);
	}
	public void setHechizo2(Hechizo hechizo2) {
		this.lHechizos.set(1, hechizo2);
	}
	public Hechizo getHechizo3() {
		return getHechizo(3);
	}
	public void setHechizo3(Hechizo hechizo3) {
		this.lHechizos.set(2, hechizo3);
	}
	public Hechizo getHechizo4() {
		return getHechizo(4);
	}
	public void setHechizo4(Hechizo hechizo4) {
		this.lHechizos.set(3, hechizo4);
	}
	public Hechizo getHechizo5() {
		return getHechizo(5);
	}
	public void setHechizo5(Hechizo hechizo5) {
		this.lHechizos.set(4, hechizo5);
	}
	public Hechizo getHechizo(int numHechizo) {
		Hechizo result = null;
		try {
			result = this.lHechizos.get(numHechizo-1);
		} catch (IndexOutOfBoundsException e) {}
		return result;
	}
	public void setHechizo(int numHechizo, Hechizo hechizo) {
		this.lHechizos.set(numHechizo-1, hechizo);
	}
	
	public int numHechizos() {
		return this.lHechizos.size();
	}
}
