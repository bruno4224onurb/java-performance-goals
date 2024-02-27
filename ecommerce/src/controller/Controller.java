package controller;

import java.util.ArrayList;

import repository.Repository;
import model.Produto;

public class Controller implements Repository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	public Produto buscarNaArray(int ID) {
		for (var produto : listaProdutos) {
			if (produto.getID() == ID) {
				return produto;
			}
		}

		return null;
	}

	public void procurarPorID(int ID) {
		var produto = buscarNaArray(ID);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto de ID " + ID + " não existe na nossa base de dados!");

	}

	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto de ID " + produto.getID() + " foi criado com sucesso!");

	}

	public void deletar(int ID) {
		var produto = buscarNaArray(ID);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.println("O produto de ID " + ID + " foi excluído com sucesso!");
			}
		} else {
			System.out.println("\nO produto de ID " + ID + " não existe na nossa base de dados!");
		}

	}

	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaArray(produto.getID());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("O produto de ID " + produto.getID() + "foi atualizado com sucesso!");
		}

		else {
			System.out.println("\nO produto de ID " + produto.getID() + " não existe na nossa base de dados!");
		}

	}

	int numero = 0;

	public int gerarNumero() {
		return ++numero;
	}

}
