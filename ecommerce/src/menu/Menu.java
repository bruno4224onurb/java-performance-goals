package menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.ProdutoNotebook;
import model.ProdutoSmartphone;
import util.Colors;

public class Menu {
	public static void main(String[] args) {

		Controller produtos = new Controller();

		Scanner input = new Scanner(System.in);

		int opcao, tipo = 0, porte, memoria, ID;
		String nome = "", tipoAux = null;

		while (true) {

			System.out.println(Colors.TEXT_BLUE + Colors.ANSI_BLACK_BACKGROUND
					+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++"
					+ "\n                                                     "
					+ "\n                 Bruno Tech Store                    "
					+ "\n                                                     "
					+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++"
					+ "\n                                                     "
					+ "\n            1 - Cadastrar produto                    "
					+ "\n            2 - Deletar produto                      "
					+ "\n            3 - Atualizar produto                    "
					+ "\n            4 - Listar todos os produtos             "
					+ "\n            5 - Buscar produto por ID                "
					+ "\n            6 - Sair                                 "
					+ "\n                                                     "
					+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++"
					+ "\nEntre com a opção desejada:                          "
					+ "\n                                                     " + Colors.TEXT_RESET);
			try {
				opcao = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Favor digitar um número inteiro de 1 a 9!");
				input.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println(
						Colors.TEXT_BLUE + Colors.ANSI_BLACK_BACKGROUND + "\nBruno Tech Store, inovação e tecnologia!");
				sobre();
				input.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1 -> {
				System.out.println(Colors.TEXT_WHITE + "Cadastrar produto: \n");

				do {
					try {
						System.out.println("Qual o nome do produto?");
						input.nextLine();
						nome = input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Favor digitar um nome válido!");
						input.nextLine();
					}
				} while (nome.equals(""));

				do {
					try {
						System.out.println(
								"\nQual o tipo de produto?\nPara Smartphones digite S.\nPara Notebooks digite N.\n");
						tipoAux = input.next();
						if (tipoAux.equalsIgnoreCase("S") == false && tipoAux.equalsIgnoreCase("N") == false) {
							System.out.println("Opção Inválida! Tente novamente...");
							tipo = 0;
						} else {
							if (tipoAux.equalsIgnoreCase("S")) {
								tipo = 1;
							} else if (tipoAux.equalsIgnoreCase("N")) {
								tipo = 2;
							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Favor digitar S ou N!");
						input.nextLine();
						tipo = 0;
					}
				} while (tipoAux.equalsIgnoreCase("S") == false && tipoAux.equalsIgnoreCase("N") == false);

				switch (tipo) {

				case 1 -> {
					do {
						try {
							System.out.println("\nQual o porte de internet?\n Digite 1 para 4g e 2 para 5g!");
							porte = input.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Favor digitar um número inteiro de 1 a 2!");
							input.nextLine();
							porte = 0;
						}
					} while (1 > porte || 2 < porte);
					produtos.cadastrar(new ProdutoSmartphone(produtos.gerarNumero(), nome, tipo, porte));
				}

				case 2 -> {
					do {
						try {
							System.out.println("\nQual o tipo de memória?\n Digite 1 para DDR4 e 2 para DDR5!");
							memoria = input.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Favor digitar um número inteiro de 1 a 2!");
							input.nextLine();
							memoria = 0;
						}
					} while (1 > memoria || 2 < memoria);
					produtos.cadastrar(new ProdutoNotebook(produtos.gerarNumero(), nome, tipo, memoria));
				}

				}

				keyPress();
			}

			case 2 -> {
				System.out.println(Colors.TEXT_WHITE + "Deletar produto: \n\n");
				keyPress();

				System.out.println("Digite o ID do produto:\n");
				ID = input.nextInt();
				produtos.deletar(ID);

				keyPress();
			}

			case 3 -> {
				System.out.println(Colors.TEXT_WHITE + "Atualizar produto: \n\n");
				keyPress();

				System.out.println("Digite o ID do produto:\n");
				ID = input.nextInt();

				do {
					try {
						System.out.println("Qual o nome do produto?");
						input.nextLine();
						nome = input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Favor digitar um nome válido!");
						input.nextLine();
					}
				} while (nome.equals(""));

				do {
					try {
						System.out.println(
								"\nQual o tipo de produto?\nPara Smartphones digite S.\nPara Notebooks digite N.\n");
						tipoAux = input.next();
						if (tipoAux.equalsIgnoreCase("S") == false && tipoAux.equalsIgnoreCase("N") == false) {
							System.out.println("Opção Inválida! Tente novamente...");
							tipo = 0;
						} else {
							if (tipoAux.equalsIgnoreCase("S")) {
								tipo = 1;
							} else if (tipoAux.equalsIgnoreCase("N")) {
								tipo = 2;
							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Favor digitar S ou N!");
						input.nextLine();
						tipo = 0;
					}
				} while (tipoAux.equalsIgnoreCase("S") == false && tipoAux.equalsIgnoreCase("N") == false);

				switch (tipo) {

				case 1 -> {
					do {
						try {
							System.out.println("\nQual o porte de internet?\n Digite 1 para 4g e 2 para 5g!");
							porte = input.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Favor digitar um número inteiro de 1 a 2!");
							input.nextLine();
							porte = 0;
						}
					} while (1 > porte || 2 < porte);
					produtos.atualizar(new ProdutoSmartphone(ID, nome, tipo, porte));
				}

				case 2 -> {
					do {
						try {
							System.out.println("\nQual o tipo de memória?\n Digite 1 para DDR4 e 2 para DDR5!");
							memoria = input.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Favor digitar um número inteiro de 1 a 2!");
							input.nextLine();
							memoria = 0;
						}
					} while (1 > memoria || 2 < memoria);
					produtos.atualizar(new ProdutoNotebook(ID, nome, tipo, memoria));
				}

				default -> {
					System.out.println("Tipo de produto inválido!");
				}
				}

				keyPress();

			}

			case 4 -> {
				System.out.println(Colors.TEXT_WHITE + "Listar todos os produtos: \n\n");

				produtos.listarTodos();

				keyPress();
			}

			case 5 -> {
				System.out.println(Colors.TEXT_WHITE + "Buscar produto por ID: \n\n");
				keyPress();

				do {
					try {
						System.out.println("Digite o ID do produto que você deseja consultar:\n");
						ID = input.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Favor digitar um número inteiro positivo!");
						input.nextLine();
						ID = -1;
					}
				} while (ID < 0);
				produtos.procurarPorID(ID);
				keyPress();
			}

			default -> {
				System.out.println(Colors.TEXT_RED + "\nOpção Inválida!\n");
				keyPress();
			}
			}
		}

	}

	private static void keyPress() {
		try {
			System.out.println(Colors.TEXT_RESET + "Aperte a tecla enter para continuar.");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você apertou outra tecla! Por favor aperte enter da próxima vez.");
		}

	}

	public static void sobre() {
		System.out.println(Colors.TEXT_BLUE + Colors.ANSI_BLACK_BACKGROUND
				+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++"
				+ "\n     Projeto Desenvolvido por: Bruno S. Franchi      "
				+ "\n              github.com/bruno4224onurb              "
				+ "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
