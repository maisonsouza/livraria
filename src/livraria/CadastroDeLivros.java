package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome="Java 8 Prático";
		livro.descricao="Novos recursos da linguagem";
		livro.valor=59.90;
		livro.isbn="978-2855-2547";
		
		
		livro.adicionaLinha();
		
		Livro outrolivro = new Livro();
		outrolivro.nome="Lógica de Programação";
		outrolivro.descricao="Crie seus primeiros programas";
		outrolivro.valor=59.78;
		outrolivro.isbn="154984-4554-44654";
		
		
		Autor autor = new Autor();
		autor.nome="Mauricio Aniche";
		autor.cpf="98788448451";
		autor.email="mauricio.aniche@caelum.com.br";
		livro.autor=autor;
		livro.mostrarDetalhes();
		
		livro.adicionaLinha();
		Autor outroautor = new Autor();
		outroautor.nome="Rodrigo Silveira";
		outroautor.cpf="645654646";
		outroautor.email="rodrigo.silveira@caelum.com.br";
		outrolivro.autor=outroautor;
		outrolivro.mostrarDetalhes();
		

	}

}
