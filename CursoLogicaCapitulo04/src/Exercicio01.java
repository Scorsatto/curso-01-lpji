import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Informe o segundo n�mero: ");
		Double segundoNumero = scanner.nextDouble();
		
		System.out.print("Informe a opera��o (1 ser� adi��o, o 2 subtra��o, o 3 multiplica��o e o 4 divis�o): ");
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
		
		System.out.println("O resultado da opera��o �: " + resultado);
		
		scanner.close();
	}
}
