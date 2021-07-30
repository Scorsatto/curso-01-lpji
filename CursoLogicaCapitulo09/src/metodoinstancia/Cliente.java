package metodoinstancia;

public class Cliente {

	String primeiroNome;
	String ultimoNome;
	String telefone;
	String email;
	
	public String obterNomeCompleto() {
		return primeiroNome + " " + ultimoNome;
	}
	
	public String obterDDD() {
		return telefone.substring(0, 2);
	}
	
}
