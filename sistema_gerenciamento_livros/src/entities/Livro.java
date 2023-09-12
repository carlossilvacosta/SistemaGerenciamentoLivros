package entities;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private double preco;
	
	public Livro (String titulo, String autor, int anoPublicacao, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}
	
	public void mostraDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano da publicação: " + anoPublicacao);
		System.out.println("Preço do livro = R$ " + preco);
	}
	
	public void alterarPreco(double preco) {
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
