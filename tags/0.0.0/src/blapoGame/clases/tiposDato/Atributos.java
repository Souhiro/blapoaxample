package blapoGame.clases.tiposDato;

public class Atributos {

	private int CON;
	private int DEX;
	private int INT;
	private int CHA;
	private int PER;
	
	public Atributos(int CON, int DEX, int INT, int CHA, int PER){
		this.CON = CON;
		this.DEX = DEX ;
		this.INT = INT;
		this.CHA = CHA;
		this.PER = PER;
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
}