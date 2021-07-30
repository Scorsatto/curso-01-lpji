package exercicio02;

public class Exercicio02 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "TV";
		produto.quantidadeEstoque = 11;
		
		System.out.println("É necessário repor o estoque do produto: " + produto.nome + "? " + produto.reporEstoque());
	}
}
