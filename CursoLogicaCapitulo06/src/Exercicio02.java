
public class Exercicio02 {
	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 0;
		
		while(i < numeros.length) {
			
			Integer numero = numeros[i];
			
			if (numero % 3 == 0) {
				System.out.println("N�mero divisivel por 3: " + numero);
			} 
			
			i++;
		}
	}
}
