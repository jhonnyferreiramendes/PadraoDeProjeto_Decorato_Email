
public class Main {

	public static void main(String[] args) {
		
		Email emailNormal = new Email_Normal();
		Email envioComConfirmacao = new Email_Confirmacao_Entrega();
		Email emailAnexo = new Email_Anexo();
		Email envioAnexoConfirmacao = new Email_Anexo_ConfirmacaoEntrega();
		
		emailNormal = new  Envio_Com_Anexo(emailNormal);
		emailNormal.enviarEmail("Jhonny", "Joao", "Prova", "Hoje vai ter prova!\n");
		
		envioComConfirmacao = new  Envio_Com_Confirmacao(envioComConfirmacao);
		envioComConfirmacao.enviarEmail("Joao", "Jhonny ", "Prova", "Obrigado! vou estudar\n");
		
		emailAnexo = new Envio_Com_Anexo(emailAnexo);
		emailAnexo.enviarEmail("Maria", "Lucy", "Dormir", "Estou cansada vou dormir");
		emailAnexo.enviarEmail("Lucy", "Maria", "Dormir", "Eu também, boa noite!\n");
		
		
		envioAnexoConfirmacao = new Envio_Com_Anexo(envioAnexoConfirmacao);
		envioAnexoConfirmacao.enviarEmail("Jose", "Carlos", "Emprego", "Voce foi aprovado para entrevista de emprego");
		envioAnexoConfirmacao.enviarEmail("Calos", "Jose", "Emprego", "Obrigado, estarei la no dia ");
		
	
		
		

		

		
		
		
	
	
		

	}

}
