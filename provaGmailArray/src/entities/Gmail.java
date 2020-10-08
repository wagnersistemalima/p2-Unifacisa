package entities;

public class Gmail {
	
	private Email[] emails;
	private int quantidadeEmails;
	
	public Gmail() {
		emails = new Email[10];
		quantidadeEmails = 0;
	}

	public Email[] getEmails() {
		return emails;
	}
	
	// metodo para saber quantos emails foi enviado para no Gmail.
	public int getQuantidadeEmails() {
		int contador = 0;
		for (int i=0; i<quantidadeEmails; i++) {
			if (emails[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	
	// metodo que adicionar email no Gmail. nome é enviar.
	public void enviarEmail(Email email) {
		if (getQuantidadeEmails() >= emails.length) {		
			Email[] emails2 = new Email[2 * emails.length];                   // criar um array auxiliar com valor dobrado de emails		                                                        
			for (int i=0; i<emails.length; i++) {
				emails2[i] = emails[i];                                       // copiar array emails para array auxiliar
			}
			emails = emails2;                                                // atualizando array principal com tamanho dobrado
		}
		emails[quantidadeEmails] = email;                               // adicionando email ao array de emails
		quantidadeEmails++;                                              // atualizando a quantidade
	}
	
	// reuso do metodo. chamar o metodo instanciando o costrutor da classe com argumeto
	public void enviarEmail(String conteudo, String remetente, String destinatario, Data dataEnvio) {
		enviarEmail(new Email(conteudo, remetente, destinatario, dataEnvio));	
	}
	
	// funçao que indica se a caixa de email está lotada
	public boolean estahLotado() {
		if (getQuantidadeEmails() >= Email.getQuantidadeMaximaEmail()) {
			return true;
		}
		return false;
	}
	
	// função que retorna todos os emails enviados pelo mesmo remetente
	public Email[] getEmailsRemetente(String remetente) {
		if (getQuantidadeEmails() > 0) {
			// array auxiliar
			Email[] emailEnviadoRemetente = new Email[getQuantidadeEmails()];
			int i = 0;
			for (Email p: emails) {
				if (p != null && p.getRemetente().equals(remetente)) {
					emailEnviadoRemetente[i] = p;
					i++;                                              // passa para o proximo
				}
			}
			return emailEnviadoRemetente;
		}
		else {
			return null;
		}
	}
	
	// Função que retorna os email que contenha uma determinada palavra
	public Email[] getEmailsComPalavra(String palavra) {
		if (getQuantidadeEmails() > 0) {
			// array auxiliar
			Email[] cacaPalavra = new Email[getQuantidadeEmails()];
			int i = 0;
			for (Email p: emails) {
				if (p != null && p.getConteudo().equals(palavra)) {
					cacaPalavra[i] = p;
					i++;
				}
				
			}
			return cacaPalavra;
		}
		else {
			return null;
		}
	}

	// função auxiliar para retirnar o email mais antigo de um remetente
	public Email[] emailMaisAntigo(String remetente) {
		if (getQuantidadeEmails() > 0) {
			// array auxiliar
			Email[] auxiliar = new Email[getQuantidadeEmails()];
			int i = 0;
			for (Email p: emails) {
				if (p != null && p.getRemetente().equals(remetente)) {
					auxiliar[i] = p;
					i++;
				}
			}
			int l = 0;
			Email[] menor = new Email[getQuantidadeEmails()];
			for (Email p: auxiliar) {
				if (p != null && p.getDataEnvio().getAno() < 2020 && p.getDataEnvio().getMes() < 12) {
					menor[l] = p;
					l++;
				}
			}
			return menor;
			
		}
		else {
			return null;
		}
	}
			

}
