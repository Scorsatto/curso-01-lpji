import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		
		System.out.println("Ol� " + nome + "!" );
		
		scanner.close();
		
		Character variavelChar = nome.charAt(0);
		
		System.out.println(variavelChar);
	}
}
