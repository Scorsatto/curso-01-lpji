
public class OperadoresIncrementoDecremento {
	public static void main(String[] args) {

		Integer numero = 10;
		
		System.out.println("Numero antes: " + numero);
		
		++numero;
		System.out.println("Numero depois: " + numero);
		
		System.out.println("++");
		numero = 10;
		Integer numero02 = ++numero;
		System.out.println("(++ antes) Numero: " + numero + ", Numero02: " + numero02);

		numero = 10;
		numero02 = numero++;
		System.out.println("(++ depois) Numero: " + numero + ", Numero02: " + numero02);
		
		System.out.println("--");
		numero = 10;
		numero02 = --numero;
		System.out.println("(-- antes) Numero: " + numero + ", Numero02: " + numero02);

		numero = 10;
		numero02 = numero--;
		System.out.println("(-- depois) Numero: " + numero + ", Numero02: " + numero02);
		
	}
}
