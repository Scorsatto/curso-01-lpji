import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double primeiroNumero = lerNumero("Informe o primeiro n�mero: ", scanner);
		Double segundoNumero = lerNumero("Informe o segundo n�mero: ", scanner);
		Integer operacao = escolhaAOperacao(scanner);
		Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
		System.out.println("O resultado �: " + resultado);

		scanner.close();
	}

	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERA��O");

		String[] operacoes = new String[] { "Adi��o", "Subtra��o" };

		for (int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}

		System.out.print("Digite a opera��o: ");

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
			System.err.println("Escolha uma opera��o v�lida!");
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
