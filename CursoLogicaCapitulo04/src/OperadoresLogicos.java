public class OperadoresLogicos {
	public static void main(String[] args) {

		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;

		System.out.println("**** && - E ****");
		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
		System.out.println("**** || - OU ****");
		aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
		System.out.println("**** && - Varias condi��es ****");
		aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
		System.out.println("**** || - Varias condi��es ****");
		aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
		System.out.println("**** && e || - Varias condi��es ****");
		aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja);
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
		System.out.println("**** && e || e && - Varias condi��es ****");
		aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("N�o aplique o desconto.");
		}
		
	}
}
