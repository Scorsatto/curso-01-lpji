package exercicio01;

import java.util.Scanner;

import org.apache.commons.mail.EmailException;

import bibliotecaemail.Carteiro;

public class Exercicio01 {
	public static void main(String[] args) throws EmailException {

		Scanner scanner = new Scanner(System.in);
		
		String tarefas = "";
		
		String tarefa = scanner.nextLine();
		
		while (!tarefa.equalsIgnoreCase("x")) {
			tarefas += tarefa + System.lineSeparator();
			
			tarefa = scanner.nextLine();
		}
		
		scanner.close();
		
		Carteiro.enviar("Tarefas", tarefas, "fabianoscorsatto@gmail.com");
	}
}
