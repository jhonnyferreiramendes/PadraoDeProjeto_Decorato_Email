
public class Decorator  extends Email {
	
	private Email email;
	
	public Decorator(Email email) {
		this.email = email;
	}

	@Override
	public void enviarEmail(String de, String para, String assunto, String texto) {
		this.email.enviarEmail(de, para, assunto, texto);
		
	}


	

}
