import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso: ");
		Double peso = scanner.nextDouble();

//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoPesado = peso > 90;
//		
//		if (pesoLeve) {
//			System.out.println("Categoria PESO LEVE");
//		}
//		
//		if (pesoMedio) {
//			System.out.println("Categoria PESO MÉDIO");
//		}
//		
//		if (pesoPesado) {
//			System.out.println("Categoria PESO PESADO");
//		}

		if (peso > 0 && peso <= 60) {
			System.out.println("Categoria PESO LEVE");
		} else if (peso > 60 && peso <= 90) {
			System.out.println("Categoria PESO MÉDIO");
		} else if (peso > 90){
			System.out.println("Categoria PESO PESADO");
		} else {
			System.out.println("Peso invalido");
		}

		scanner.close();
	}

}
