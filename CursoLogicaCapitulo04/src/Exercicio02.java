import java.util.Scanner;

public class Exercicio02 {
	
	static final Double VALOR_FRETE = 15.00;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFinalProduto = valorProduto;
		
		if (valorProduto < 100) {
			valorFinalProduto = valorProduto + VALOR_FRETE;
		}
		
		System.out.println("Valor a ser pago: " + valorFinalProduto);
		
		scanner.close();
	}
}
