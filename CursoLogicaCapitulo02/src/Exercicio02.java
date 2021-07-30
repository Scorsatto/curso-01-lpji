import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o seu peso: ");
		Double peso = scanner.nextDouble();

		System.out.print("Informe a sua altura: ");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);

		System.out.println("Seu IMC é de: " + imc);

		scanner.close();
	}
}
