import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];

		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Informe a " + i + " tarefa: ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("Tarefas cadastradas:");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(i + " - " + tarefas[i]);
		}
		
		scanner.close();
	}
}
