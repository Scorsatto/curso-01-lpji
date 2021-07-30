import java.util.Scanner;

public class RecebendoParametros {

//	public static void main(String[] args) {
//
//		imprimir("************************************");
//		
//		String nome = "João";
//		imprimir(nome);
//		
//	}
//	
//	static void imprimirTraco() {
//		System.out.println("--------------------------------------");
//	}
//	
//	static void imprimir(String texto) {
//		System.out.println(texto);
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

//		for (int i = 0; i < cursos.length; i++) {
//			System.out.println("[" + i + "] " + cursos[i]);
//		}
		iterarEExibirPosicoesDoVetorString(cursos);

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaPosicaoInvalida();
		}

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);
//		for (int i = 0; i < formasPagamento.length; i++) {
//			System.out.println("[" + i + "] " + formasPagamento[i]);
//		}

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		// System.out.println("----------------------------------------------");
		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}

}
