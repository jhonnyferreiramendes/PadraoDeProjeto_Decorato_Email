public class Envio_Com_Anexo extends Decorator{

	public Envio_Com_Anexo(Email email) {
		super(email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviarEmail(String de, String para, String assunto, String texto) {
		super.enviarEmail(de, para, assunto, texto);
		System.out.println("ANEXO ==> Email enviado de: " + de + " Para: "+ para + " Assunto: " + assunto + " Texto: " + texto);
		
	}



}