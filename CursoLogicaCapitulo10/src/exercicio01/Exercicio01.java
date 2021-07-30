package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) throws IOException {

			Scanner scanner = new Scanner(System.in);
			
			ArrayList<String> linhas = new ArrayList<>();
			
			String tarefa = scanner.nextLine();
			
			while (!tarefa.equalsIgnoreCase("x")) {
				linhas.add(tarefa);
				
				tarefa = scanner.nextLine();
			}
			
			
			Path arquivo = Paths.get("C:\\Users\\Scorsatto\\Desktop\\Arquivo.txt");
			
			Files.write(arquivo, linhas);
			
			scanner.close();
			System.out.println("Arquivo Criado.");
		
		
		
	}
}
