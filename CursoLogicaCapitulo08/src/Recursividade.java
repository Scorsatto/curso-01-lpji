
public class Recursividade {
	public static void main(String[] args) {
		String[] alunos = new String[] {"Alexandre", "João", "Maria"};
		
		iterarNomes(alunos, 0);
		//imprimirNumero(0);
	}
	
	static void iterarNomes(String[] alunos, Integer i) {
		System.out.println("Aluno: " + alunos[i]);
		
		if (++i < alunos.length) {
			iterarNomes(alunos, i);
		}
		
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println("Aluno: " + alunos[i]);
//		}
	}
	
	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);
		
		if (numero < 10) {
			imprimirNumero(++numero);			
		}
	}
}
