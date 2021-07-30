
public class OperadoresAtribuicao {
	
	static final Double NUMERO = 7.0;
	
	public static void main(String[] args) {

		Double numero = NUMERO;
		System.out.println("-> numero: " + numero);
		
		numero = numero + 4;
		System.out.println("numero + 4: " + numero);
		
		numero = NUMERO;
		numero += 4;
		System.out.println("numero += 4: " + numero);
		
		numero = NUMERO;
		numero -= 4;
		System.out.println("numero -= 4: " + numero);
		
		numero = NUMERO;
		numero *= 4;
		System.out.println("numero *= 4: " + numero);
		
		numero = NUMERO;
		numero /= 4;
		System.out.println("numero /= 4: " + numero);
		
		numero = NUMERO;
		numero %= 4;
		System.out.println("numero %= 4: " + numero);
	}
}
