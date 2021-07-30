import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Informe o número que deseja saber seu quadrado: ");
		Double numeroInformado = scanner.nextDouble();
		
		System.out.println("O quadrado do numero " + numeroInformado + " é: " + (numeroInformado * numeroInformado));
		
		scanner.close();
	}
}
