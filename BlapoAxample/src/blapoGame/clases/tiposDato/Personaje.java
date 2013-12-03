package blapoGame.clases.tiposDato;

public class Personaje {
	private int CON;
	private int DEX;
	private int INT;
	private int CHA;
	private int PER;
	
	private String nombre;
	private boolean sexo;
	private int nivel;
	
	private int HP;
	private int EN;
	
	private Hechizo hechizo1;
	private Hechizo hechizo2;
	private Hechizo hechizo3;
	private Hechizo hechizo4;
	private Hechizo hechizo5;
	
	public Personaje() {
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, int PER) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel, INT * nivel, null, null, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, HP, EN, null, null, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN, Hechizo hechizo1) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, HP, EN, hechizo1, null, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, Hechizo hechizo1) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel,  INT * nivel, hechizo1, null, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN, Hechizo hechizo1, Hechizo hechizo2) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, HP, EN, hechizo1, hechizo2, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, Hechizo hechizo1, Hechizo hechizo2) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel,  INT * nivel, hechizo1, hechizo2, null, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, HP, EN, hechizo1, hechizo2, hechizo3, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel,  INT * nivel, hechizo1, hechizo2, hechizo3, null, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3, Hechizo hechizo4) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, HP, EN, hechizo1, hechizo2, hechizo3, hechizo4, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3, Hechizo hechizo4) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel, INT * nivel, hechizo1, hechizo2, hechizo3, hechizo4, null);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3, Hechizo hechizo4, Hechizo hechizo5) {
		this(nombre, sexo, nivel, CON, DEX, INT, CHA, PER, CON* nivel, INT * nivel, hechizo1, hechizo2, hechizo3, hechizo4, hechizo5);
	}
	
	public Personaje(String nombre, boolean sexo, int nivel, int CON, int DEX, int INT, int CHA, 
			int PER, int HP, int EN, Hechizo hechizo1, Hechizo hechizo2, Hechizo hechizo3, 
			Hechizo hechizo4, Hechizo hechizo5) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.nivel = nivel;
		this.CON = CON;
		this.DEX = DEX;
		this.INT = INT;
		this.CHA = CHA;
		this.PER = PER;

		this.HP = HP;
		this.EN = EN;
		
		this.hechizo1 = hechizo1;
		this.hechizo2 = hechizo2;
		this.hechizo3 = hechizo3;
		this.hechizo4 = hechizo4;
		this.hechizo5 = hechizo5;
	}
	
	public int getENMax() {
		return this.INT * this.nivel;
	}
	
	public int getHPMax() {
		return this.CON * this.nivel;
	}

	public int getCON() {
		return CON;
	}

	public void setCON(int cON) {
		CON = cON;
	}

	public int getDEX() {
		return DEX;
	}

	public void setDEX(int dEX) {
		DEX = dEX;
	}

	public int getINT() {
		return INT;
	}

	public void setINT(int iNT) {
		INT = iNT;
	}

	public int getCHA() {
		return CHA;
	}

	public void setCHA(int cHA) {
		CHA = cHA;
	}

	public int getPER() {
		return PER;
	}

	public void setPER(int pER) {
		PER = pER;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getEN() {
		return EN;
	}

	public void setEN(int eN) {
		EN = eN;
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
	
	public String listaHechizos() {
		String resultadoBuf = "";
		if (hechizo5 != null) resultadoBuf = "Tus hechizos son: " + hechizo1.getNombreHechizo() + ", " +hechizo2.getNombreHechizo() + ", " +
				hechizo3.getNombreHechizo() + ", " +hechizo4.getNombreHechizo() + " y " +hechizo5.getNombreHechizo();
		else if (hechizo4 != null) resultadoBuf = "Tus hechizos son: " + hechizo1.getNombreHechizo() + ", " +hechizo2.getNombreHechizo() + ", " +
				hechizo3.getNombreHechizo() + " y " +hechizo4.getNombreHechizo();
		else if (hechizo3 != null) resultadoBuf = "Tus hechizos son: " + hechizo1.getNombreHechizo() + ", " +hechizo2.getNombreHechizo() + " y " +
				hechizo3.getNombreHechizo();
		else if (hechizo2 != null) resultadoBuf = "Tus hechizos son: " + hechizo1.getNombreHechizo() + " y " +hechizo2.getNombreHechizo();
		else if (hechizo1 != null) resultadoBuf = "Tu único hechizo es: " + hechizo1.getNombreHechizo();
		else if (hechizo1 == null) resultadoBuf = "No tienes hechizos, pringao";
		
		return resultadoBuf;
	}
	
}
