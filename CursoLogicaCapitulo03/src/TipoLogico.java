
public class TipoLogico {
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		Boolean variavelFalsa = false;
		
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		System.out.println("Vari�vel falsa: " + variavelFalsa);
		
		System.out.println("----------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {	
			System.out.println("Sim! Voc� pode tirar carteira.");
		} else {
			System.out.println("N�o! Voc� n�o pode tirar carteira.");
		}
		
		//System.out.println("Pode tirar carteira? " + podeTirarCarteira);
	}
}
