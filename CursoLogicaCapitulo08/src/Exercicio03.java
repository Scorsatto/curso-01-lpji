import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double primeiroNumero = lerNumero("Informe o primeiro número: ", scanner);
		Double segundoNumero = lerNumero("Informe o segundo número: ", scanner);
		Integer operacao = escolhaAOperacao(scanner);
		Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
		System.out.println("O resultado é: " + resultado);

		scanner.close();
	}

	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERAÇÃO");

		String[] operacoes = new String[] { "Adição", "Subtração" };

		for (int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}

		System.out.print("Digite a operação: ");

		return scanner.nextInt();
	}

	static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;

		switch (operacao) {
		case 0:
			resultado = adicao(primeiroNumero, segundoNumero);
			break;
		case 1:
			resultado = subtracao(primeiroNumero, segundoNumero);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}

		return resultado;
	}

	static Double lerNumero(String texto, Scanner scanner) {
		System.out.print(texto);
		return scanner.nextDouble();
	}

	static Double adicao(Double primeiroNumero, Double segundoNumero) {

		return primeiroNumero + segundoNumero;
	}

	static Double subtracao(Double primeiroNumero, Double segundoNumero) {

		return primeiroNumero - segundoNumero;
	}
}
