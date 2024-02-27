package model;

public class ProdutoNotebook extends Produto {

	private int memoria;
	public String memoriaSt;

	public ProdutoNotebook(int ID, String nome, int tipo, int memoria) {
		super(ID, nome, tipo);
		this.setMemoria(memoria);
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		switch (getMemoria()) {
		case 1:
			this.memoriaSt = "DDR4";
			break;
		case 2:
			this.memoriaSt = "DDR5";
			break;
		}
		System.out.println("Tipo de memória: " + this.memoriaSt);

	}

}
