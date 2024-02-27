package model;

public abstract class Produto {

	private int ID;
	private int tipo;
	public String nome;
	public String tipoSt;

	public Produto(int ID, String nome, int tipo) {
		this.setID(ID);
		this.setNome(nome);
		this.setTipo(tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
			this.tipoSt = "Notebook";
			break;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + "\nDADOS DO PRODUTO:"
				+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++" + "\nID do produto: " + getID()
				+ "\nNome do produto: " + getNome() + "\nTipo de produto: " + this.tipoSt);

	}

}
