package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexande";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "66999859237";
		cliente.email = "alexandre.afonso@algaworks.com";
		
		Cliente cliente2 = new Cliente();
		
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "65999859237";
		cliente2.email = "João.afonso@algaworks.com";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto());
		//System.out.println(cliente.obterDDD());
		
		System.out.println("Nome cliente2: " + cliente2.obterNomeCompleto());
		
	}

}
