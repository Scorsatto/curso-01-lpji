package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("Aula sobre uso de bibliotecas de terceiros", "Parabéns! FUNCIONOU! 222222", "fabianoscorsatto@gmail.com");

	}
}