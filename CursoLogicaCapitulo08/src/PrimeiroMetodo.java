import java.util.Scanner;

public class PrimeiroMetodo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}

		System.out.print("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
		}

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		for (int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[i]);
		}

		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);

		scanner.close();
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}	
}
