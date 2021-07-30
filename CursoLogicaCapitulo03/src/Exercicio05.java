import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_PARA_PASSAR = 70;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua nota: ");
		Integer nota = scanner.nextInt();
		
		Boolean passou = nota >= NOTA_PARA_PASSAR;
		
		if (passou) {
			System.out.println("Parabéns você passou!");
		} else {
			System.out.println("Tente novamente ano que vem!");
		}
		
		scanner.close();
	}
}
