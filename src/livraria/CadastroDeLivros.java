package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome="Java 8 Prático";
		livro.descricao="Novos recursos da linguagem";
		livro.valor=59.90;
		livro.isbn="978-2855-2547";
		
		System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);
		
		Livro outrolivro = new Livro();
		outrolivro.nome="Lógica de Programação";
		outrolivro.descricao="Crie seus primeiros programas";
		outrolivro.valor=59.78;
		outrolivro.isbn="154984-4554-44654";
		System.out.println("--------------------------------------");
		System.out.println(outrolivro.nome);
		System.out.println(outrolivro.descricao);
		System.out.println(outrolivro.valor);
		System.out.println(outrolivro.isbn);
		

	}

}
