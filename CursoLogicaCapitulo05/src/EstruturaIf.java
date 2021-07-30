public class EstruturaIf {

	public static void main(String[] args) {

		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;

		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura
				&& temNomeLimpo;

		if (liberarEmprestimo) {
			System.out.println("Sim, pode liberar o empréstimo!");
		}

		if (movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim, pode liberar o empréstimo!");
		}
		
		if (((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim, pode liberar o empréstimo!");
		} else {
			System.out.println("Não pode liberar o empréstimo!");
		}
		
//		if (!(((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura && temNomeLimpo)) {
//			System.out.println("Sim, pode liberar o empréstimo!");
//		} else {
//			System.out.println("Não pode liberar o empréstimo!");
//		}

	}

}
