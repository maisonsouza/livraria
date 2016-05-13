package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		autor.setCpf("845244525854");
		autor.setEmail("mauricio.aniche@caelum.com.br");
		
		
		
		Livro livro = new Livro();
		livro.setNome("Java 8 Pr�tico");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-2855-2547");
		livro.setAutor(autor);
		livro.mostrarDetalhes();
		
		
		livro.adicionaLinha();
		
		Autor outroautor = new Autor();
		outroautor.setNome("Maison Marcel");
		outroautor.setCpf("98225723289");
		outroautor.setEmail("rodrigo.silveira@caelum.com.br");
		
		
		Livro outrolivro = new Livro();
		outrolivro.setNome("L�gica de Programa��o");
		outrolivro.setDescricao("Crie seus primeiros programas");
		outrolivro.setValor(25.68);
		outrolivro.setIsbn("154984-4554-44654");
		outrolivro.setAutor(outroautor);
		outrolivro.mostrarDetalhes();
		
		
		
		
		livro.adicionaLinha();
		
		
		livro.aplicaDesdeconto(0.1);
		livro.aplicaDesdeconto(0.3);
		livro.aplicaDesdeconto(0.4);
		

	}

}
