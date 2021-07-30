import java.util.Scanner;

public class Exercicio04 {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a idade: ");
		Integer idade = scanner.nextInt();

		System.out.print("Informe o tempo de contribuição: ");
		Integer tempoContribuicao = scanner.nextInt();

		Boolean podeAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR && tempoContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

		if (podeAposentar) {
			System.out.println("Parabéns você pode se aposentar");
		} else {
			System.out.println("Trabalhe mais, viva o capitalismo!");
		}

		scanner.close();
	}

}
