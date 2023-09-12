package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Livro;
import util.CadastroLivros;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CadastroLivros cadastro = new CadastroLivros();
		
		while(true) {
		System.out.println();
		System.out.println("Sistema de Cadastro de Livros");
		System.out.println("Menu:");
		System.out.println("1 - Adicionar um livro ao sistema");
		System.out.println("2 - Listar livros do sistema");
		System.out.println("3 - Buscar livro por nome");
		System.out.println("4 - Atualizar preço de livro");
		System.out.println("5 - Sair do sistema");
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		System.out.println();
		
		if(opcao == 1) {
			System.out.print("Digite o nome do livro que deseja adicionar: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			System.out.print("Digite o nome do autor do livro: ");
			String autor = sc.nextLine();
			System.out.print("Digite o ano da publicação do livro: ");
			int anoPublicacao = sc.nextInt();
			System.out.print("Digite o preço do livro: R$ ");
			double preco = sc.nextDouble();
			Livro livro = new Livro(titulo, autor, anoPublicacao, preco);
			cadastro.adicionarLivro(livro);
		} else if(opcao == 2) {
			cadastro.listarLivros();
		} else if(opcao == 3) {
			System.out.print("Digite o título do livro que deseja buscar? ");
			sc.nextLine();
			String titulo = sc.nextLine();
			cadastro.buscarLivro(titulo);
		} else if(opcao == 4) {
			System.out.print("Digite o título do livro que deseja alterar o preço: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			System.out.print("Digite o novo preço do livro: R$ ");
			double novoPreco = sc.nextDouble();
			cadastro.alterarPrecoLivro(titulo, novoPreco);
		} else if (opcao == 5) {
			System.out.println("Sistema encerrado, obrigado!");
			break;
		} else {
			System.out.println("Opção inválida, tente novamente!");
		}
		}
		
		sc.close();

	}

}
