package livraria;

public class Livro {
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Livro(){
		System.out.println("Novo livro criado");
	}
	
	void setValor(double valor){
		this.valor += valor;
	}
	
	double getValor() {
		return this.valor;
		}
	
	void mostrarDetalhes() {
		String mensagem="Imprimindo detalhes do livro";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(getValor());
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
