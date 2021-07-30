package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:/Users/Scorsatto/Desktop/Arquivo.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);

		for (String linha : linhas) {
			System.out.println("Jogador: " + linha);
		}
		
		//linhas.stream().forEach(l -> System.out.println(l));
		
	}

}
