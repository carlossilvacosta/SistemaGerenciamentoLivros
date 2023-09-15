package util;

import java.util.ArrayList;
import java.util.List;

import entities.Livro;

public class CadastroLivros {
	List<Livro> livrosList = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		livrosList.add(livro);
		System.out.println("Livro adicionado com sucesso!");
		System.out.println();
	}
	
	public void listarLivros() {
		for(Livro livro : livrosList) {
			livro.mostraDetalhes();
			System.out.println("--------------------------");
		}
	}
	
	public void alterarPrecoLivro(String titulo, double novoPreco) {
		Livro livro = buscarLivro(titulo);
			if(livro != null) {
				livro.setPreco(novoPreco);
				System.out.println("Preço do livro atualizado!");
			}
	}
	
	public Livro buscarLivro(String titulo) {
		for (Livro livro : livrosList) {
			if(livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}

}
