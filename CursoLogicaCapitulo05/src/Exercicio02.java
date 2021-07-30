import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a meta de faturamento anual: ");
		Double metaFaturamentoAnual = scanner.nextDouble();
		
		System.out.print("Informe o faturamento anual da empresa: ");
		Double faturamentoAnual = scanner.nextDouble();
		
		System.out.print("Informe a média salarial: ");
		Double mediaSalarial = scanner.nextDouble();
		
		if (faturamentoAnual >= metaFaturamentoAnual) {
			System.out.println("Bateu a meta, o bonus será de: " + mediaSalarial);
		} else {
			if (faturamentoAnual >= (metaFaturamentoAnual * 0.8)) {
				System.out.println("Bonus de 80% da meta, que será de: " + (mediaSalarial * 0.8));
			} else {
				System.out.println("Sem bonus esse ano");
			}
		}
		
		
		scanner.close();
	}

}
