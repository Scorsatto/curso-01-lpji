
public class OperadoresAritmeticos {
	public static void main(String[] args) {

		Integer adicao = 1 + 1;
		System.out.println("Adição: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão: " + divisao);
		
		Integer modulo = 7 % 5;
		System.out.println("Módulo: " + modulo); // Módulo é o resto
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia01); // Módulo é o resto
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia02); // Módulo é o resto
		
		Integer precedencia03 = 5 * (1 + 1);
		System.out.println("Precedencia 03: " + precedencia03); // Módulo é o resto
		
		Integer precedencia04 = 5 * (1 + 1) + 2;
		System.out.println("Precedencia 04: " + precedencia04); // Módulo é o resto
		
		Integer precedencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Precedencia 05: " + precedencia05); // Módulo é o resto
		
		Integer cinco = 5;
		Integer um = 1;
		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedencia com variáveis: " + precedenciaComVariaveis); // Módulo é o resto
		
	}
}
