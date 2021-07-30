import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		System.out.print("Informe a operação (1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão): ");
		Integer operacao = scanner.nextInt();
		
		Double resultado = 0.0;
		
		if (operacao == 1) {
			resultado = primeiroNumero + segundoNumero;
		} else if (operacao == 2) {
			resultado = primeiroNumero - segundoNumero;
		} else if (operacao == 3) {
			resultado = primeiroNumero * segundoNumero;
		} else {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("O resultado da operação é: " + resultado);
		
		scanner.close();
	}
}
