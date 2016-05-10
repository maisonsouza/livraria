package livraria;

public class CalculadoraDeEstoque {
	
	public static void main(String[] args) {
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		System.out.println("A soma dos livros = "+soma);
		if (soma<150){
			System.out.println("Seu estoque está muito baixo");
			
		}else{
			System.out.println("Seu estoque está suficiente");
		}
		int contador=1;
		while(contador<=3){
			System.out.println("Volta "+contador);
			contador++;
		}
		
		for(int a=1;a<=5;a++){
			
			System.out.println("Imprimindo 5 vezes");
		}
	}

}
