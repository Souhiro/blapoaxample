package blapoGame.clases.tiposDato;

public class Hechizo {
	private int idHechizo;
	private String nombreHechizo;
	
	private Integer efecto1;
	private Integer efecto2;
	private Integer efecto3;
	
	private Integer danyo;
	private Integer gasto;
	private Integer tipo;

		// Constructores
	public Hechizo(int idHechizo, String nombreHechizo, Integer tipo, Integer danyo, Integer gasto) {
		this(idHechizo, nombreHechizo, tipo, danyo, gasto, null, null, null);
	}

	public Hechizo(int idHechizo, String nombreHechizo, Integer tipo, Integer danyo, Integer gasto, Integer efecto1) {
		this(idHechizo, nombreHechizo, tipo, danyo, gasto, efecto1, null, null);
	}
	
	public Hechizo(int idHechizo, String nombreHechizo, Integer tipo, Integer danyo, Integer gasto, Integer efecto1, Integer efecto2) {
		this(idHechizo, nombreHechizo, tipo, danyo, gasto, efecto1, efecto2, null);
	}
	
	public Hechizo(int idHechizo, String nombreHechizo, Integer tipo, Integer danyo, Integer gasto, Integer efecto1, Integer efecto2, Integer efecto3) {
		this.idHechizo = idHechizo;
		this.nombreHechizo = nombreHechizo;
		this.tipo = tipo;
		this.danyo = danyo;
		this.gasto = gasto;
		this.efecto1 = efecto1;
		this.efecto2 = efecto2;
		this.efecto3 = efecto3;
	}
	
		// Getters & Setters
	public int getIdHechizo() {
		return idHechizo;
	}

	public void setIdHechizo(int idHechizo) {
		this.idHechizo = idHechizo;
	}

	public String getNombreHechizo() {
		return nombreHechizo;
	}

	public void setNombreHechizo(String nombreHechizo) {
		this.nombreHechizo = nombreHechizo;
	}

	public Integer getEfecto1() {
		return efecto1;
	}

	public void setEfecto1(Integer efecto1) {
		this.efecto1 = efecto1;
	}

	public Integer getEfecto2() {
		return efecto2;
	}

	public void setEfecto2(Integer efecto2) {
		this.efecto2 = efecto2;
	}

	public Integer getEfecto3() {
		return efecto3;
	}

	public void setEfecto3(Integer efecto3) {
		this.efecto3 = efecto3;
	}

	public Integer getDanyo() {
		return danyo;
	}

	public void setDanyo(Integer danyo) {
		this.danyo = danyo;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

		// Metodos
	public boolean contieneEfecto(int efecto) {
		if (this.efecto1.intValue() == efecto || this.efecto2.intValue() == efecto || this.efecto3.intValue() == efecto)
			return true;
		else
			return false;
	}
}
