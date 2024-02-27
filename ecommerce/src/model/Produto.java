package model;

public abstract class Produto {

	private int ID;
	private int tipo;
	public String tipoSt;
	
	public Produto(int ID, int tipo) {
		this.setID(ID);
		this.setTipo(tipo);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		switch (getTipo()) {
		case 1:
			this.tipoSt = "Smartphone";
			break;
		case 2:
			this.tipoSt = "Conta Poupança";
			break;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + "\nDADOS DO PRODUTO:"
				+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++" + "\nID produto: " + getID()
				+ "\nTipo de produto: " + this.tipo);

	}

}
