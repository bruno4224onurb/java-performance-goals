package model;

public class ProdutoSmartphone extends Produto {

	private int porte;
	public String porteSt;

	public ProdutoSmartphone(int ID, int tipo, int porte) {
		super(ID, tipo);
		this.setPorte(porte);
	}

	@Override
	public void visualizar() {
		super.visualizar();
		switch (getPorte()) {
		case 1:
			this.porteSt = "4G";
			break;
		case 2:
			this.porteSt = "5G";
			break;
		}
		System.out.println("\nPorte de internet: " + this.porteSt);

	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}
}
