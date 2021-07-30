package exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {
	public static void main(String[] args) throws IOException {

Path arquivo = Paths.get("C:/Users/Scorsatto/Desktop/Arquivo.txt");
		
		List<String> tarefas = Files.readAllLines(arquivo);

		for (String tarefa : tarefas) {
			System.out.println("Tarefa: " + tarefa);
		}
		
	}
}
