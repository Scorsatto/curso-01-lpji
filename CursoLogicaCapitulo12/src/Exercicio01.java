import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
	public static void main(String[] args) throws IOException {

		ListaAlunos listaAlunos = new ListaAlunos();
		
		Path arquivo = Paths.get("C:/Users/Scorsatto/Desktop/Arquivo.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);

		for (String linha : linhas) {

			Aluno aluno = new Aluno();
			aluno.nome = linha;
			listaAlunos.adicionar(aluno);
			
		}
		
		listaAlunos.ordenar();
		
		linhas = new ArrayList<>();
		
		for (int i = 0; i < listaAlunos.tamanhoLista; i++) {
			
			linhas.add(listaAlunos.obter(i).nome);
		}
		
		arquivo = Paths.get("C:/Users/Scorsatto/Desktop/Arquivo2.txt");
		
		Files.write(arquivo, linhas);
		
	}
}
