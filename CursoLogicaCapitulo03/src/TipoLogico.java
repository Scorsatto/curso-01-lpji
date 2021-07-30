
public class TipoLogico {
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		Boolean variavelFalsa = false;
		
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		System.out.println("Variável falsa: " + variavelFalsa);
		
		System.out.println("----------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {	
			System.out.println("Sim! Você pode tirar carteira.");
		} else {
			System.out.println("Não! Você não pode tirar carteira.");
		}
		
		//System.out.println("Pode tirar carteira? " + podeTirarCarteira);
	}
}
