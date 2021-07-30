package exercicio02;

public class Produto {

	String nome;
	Integer quantidadeEstoque;
	
	public boolean reporEstoque() {
		
		if (quantidadeEstoque < 10)
			return true;
		
		return false;
	}
}
