
public class OperadoresAritmeticos {
	public static void main(String[] args) {

		Integer adicao = 1 + 1;
		System.out.println("Adi��o: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtra��o: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divis�o: " + divisao);
		
		Integer modulo = 7 % 5;
		System.out.println("M�dulo: " + modulo); // M�dulo � o resto
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia01); // M�dulo � o resto
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia02); // M�dulo � o resto
		
		Integer precedencia03 = 5 * (1 + 1);
		System.out.println("Precedencia 03: " + precedencia03); // M�dulo � o resto
		
		Integer precedencia04 = 5 * (1 + 1) + 2;
		System.out.println("Precedencia 04: " + precedencia04); // M�dulo � o resto
		
		Integer precedencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Precedencia 05: " + precedencia05); // M�dulo � o resto
		
		Integer cinco = 5;
		Integer um = 1;
		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedencia com vari�veis: " + precedenciaComVariaveis); // M�dulo � o resto
		
	}
}
