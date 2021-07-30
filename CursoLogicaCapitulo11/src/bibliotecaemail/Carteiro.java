package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	public static void enviar(String assunto, String texto, String para) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("bibliotecajava", "SENHA_AQUI"));
		email.setSSLOnConnect(true);
		email.setFrom("bibliotecajava@gmail.com");
		email.setSubject(assunto);
		email.setMsg(texto);
		email.addTo(para);
		email.send();
	}
	
}
