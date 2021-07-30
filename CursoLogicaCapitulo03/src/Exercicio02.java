import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe o sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá " + nome + " " + sobrenome + " seja bem vindo(a)!");
		
		scanner.close();
	}
}
