package livraria;

public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	public Livro(){
		System.out.println("Novo livro criado");
	}
	
	void mostrarDetalhes() {
		String mensagem="Imprimindo detalhes do livro";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		if (this.temAutor()) {
			autor.mostrarDetalhes();
			}
		}
	
	void adicionaLinha(){
		System.out.println("_____________________________________________");
	}
	
	public void aplicaDesdeconto(double desconto){
		
		if(desconto > 0.3){
			System.out.println("Desconto não pode ser maior que 30%");
		}else{
			this.valor -= this.valor * desconto;
			System.out.println(valor);
		}
	}
	
	boolean temAutor(){
		return this.autor != null;
		}

}
