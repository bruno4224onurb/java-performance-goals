package repository;

import model.Produto;

public interface Repository {
	
		public void procurarPorID(int ID);

		public void listarTodas();

		public void cadastrar(Produto produto);

		public void atualizar(Produto produto);

		public void deletar(int ID);

}
