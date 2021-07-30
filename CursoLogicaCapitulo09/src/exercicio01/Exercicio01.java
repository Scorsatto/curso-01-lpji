package exercicio01;

public class Exercicio01 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "TV";
		produto.quantidadeEstoque = 9;
		
		System.out.println("É necessário repor o estoque do produto: " + produto.nome + "? " + reporEstoque(produto));
	}
	
	static boolean reporEstoque(Produto produto) {
		
		if (produto.quantidadeEstoque < 10)
			return true;
		
		return false;
	}
}
