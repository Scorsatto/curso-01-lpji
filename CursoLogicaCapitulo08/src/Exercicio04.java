import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Integer multiplicador = lerNumero("Informe o número da tabuada: ", scanner);
		
		System.out.println("Tabuada do " + multiplicador);
		imprimirTabuada(multiplicador, 0);
	}
	
	static void imprimirTabuada(Integer multiplicador, Integer i) {
		System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
		
		if (i++ < 10) {
			imprimirTabuada(multiplicador, i);
		}
	}
	
	static Integer lerNumero(String texto, Scanner scanner) {
		System.out.print(texto);
		return scanner.nextInt();
	}
}
