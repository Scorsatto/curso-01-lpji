import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua nota: ");
		Integer nota = scanner.nextInt();
		
		Boolean passou = nota >= 70;
		
		if (passou) {
			System.out.println("Parabéns você passou!");
		} else {
			System.out.println("Tente novamente ano que vem!");
		}
		
		scanner.close();
	}
}
