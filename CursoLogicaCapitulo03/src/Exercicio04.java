import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Informe a quantidade: ");
		Integer quantidade = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidade;
		
		if (quantidade > 10) {
			subtotal = subtotal - (subtotal * 0.10);
		}
		
		System.out.println("O valor a ser pago é de: " + subtotal);
		
		scanner.close();
	}
}
