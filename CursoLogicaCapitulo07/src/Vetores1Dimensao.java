import java.util.Scanner;

public class Vetores1Dimensao {
	public static void main(String[] args) {

		// 1
//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		
//		System.out.println("Escolha o sabor: ");
//		
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Digite o número referente ao sabor: ");
//		Integer saborEscolhido = scanner.nextInt();
//		
//		System.out.println("A compra da sua pizza de " + cardapio[saborEscolhido] + " foi concluida com sucesso!");
//		
//		scanner.close();

		// 2
//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		cardapio[3] = "Frango";
//		
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println(cardapio[i]);
//		}

		// 3
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";

		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}
	}
}
