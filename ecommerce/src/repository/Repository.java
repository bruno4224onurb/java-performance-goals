package repository;

import model.Produto;

public interface Repository {

	public void procurarPorID(int ID);
	
	public void procurarPorNome(String nome);

	public void listarTodos();

	public void cadastrar(Produto produto);

	public void atualizar(Produto produto);

	public void deletar(int ID);

}
