package livraria;

public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	
	void mostrarDetalhes() {
		String mensagem="Imprimindo detalhes do livro";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		}

}
