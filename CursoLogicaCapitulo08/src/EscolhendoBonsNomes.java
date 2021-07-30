import java.util.Scanner;

public class EscolhendoBonsNomes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String cursoEscolhido = receberCursoDoUsuario(scanner);

		imprimirTraco();

		String formaPagamentoEscolhida = receberFormaPagamentoDoUsuario(scanner);

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);

		scanner.close();
	}
	
	static String receberFormaPagamentoDoUsuario(Scanner scanner) {
		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida �:", scanner);

		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
	
	static String receberCursoDoUsuario(Scanner scanner) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que voc� deseja � o: ", scanner);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor); //posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		return posicaoEscolhida;
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i]);
	
		if (++i < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
	}

	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}

	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		imprimir("Posi��o inv�lida!");
		System.exit(1);
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void imprimirEContinuarMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		
		imprimirEContinuarMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
}
