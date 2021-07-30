import java.util.Scanner;

public class Exercicio01 {
	
	static final Double NOTA_MINIMA_MATERIA = 60.0;
	static final Double PONTUACAO_TOTAL_MINIMA = 150.0;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a nota de portugu�s: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Informe a nota de matem�tica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean atingiuNotaMinimaPorMateria = (notaPortugues >= NOTA_MINIMA_MATERIA) && (notaMatematica >= NOTA_MINIMA_MATERIA);
		Boolean atingiuPontuacaoTotalMinima = notaPortugues + notaMatematica >= PONTUACAO_TOTAL_MINIMA;
		
		if (atingiuNotaMinimaPorMateria && atingiuPontuacaoTotalMinima) {
			System.out.println("Parab�ns concurseiro, voc� foi aprovado!");
		} else {
			System.out.println("Espere o proximo concurso e tente novamente!");
		}
		
		scanner.close();
		
	}
}
