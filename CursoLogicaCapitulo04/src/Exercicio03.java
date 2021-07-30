import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double gastosTotais = 0.0;
		
		System.out.print("Informe o valor da conta de luz: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de água: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de telefone: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.print("Informe o valor da escola do filho: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.print("Informe o valor da fatura do cartão: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.print("Informe o valor gasto com super mercado: ");
		gastosTotais += scanner.nextDouble();
		
		System.out.println("Os gastos totais do mês são de: R$" + gastosTotais);
		
		scanner.close();
	}
}
