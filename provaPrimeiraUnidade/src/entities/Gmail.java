package entities;

import java.util.Arrays;

public class Gmail {
	
	private Email[] emails;
	private int quantidadeEmail;
	
	
	
	public Gmail() {
		this.emails = new Email[10];
		this.quantidadeEmail = 0;
	}
	
	public Email[] getEmails() {
		return emails;
	}
	
	// metodo auxiliar para saber a quantidade de emails no array
	public int getQuantidadeEmail() {
		int contador = 0;
		for (int i=0; i<this.quantidadeEmail; i++) {
			if (emails[i] != null) {
				contador++;
			}
		}
		return contador;
	}

	// função para adicionar email
	public void addEmail(Email email) {
		if(getQuantidadeEmail() >= emails.length) {
			Email[] emails2 = new Email[2 * emails.length];            // array auxiliar
			for (int i=0; i<emails.length; i++) {
				emails2[i] = emails[i];                                      // copiando o array principal
			}
			//array com o dobro do tamanho atualizado
			emails = emails2;
		}
		emails[quantidadeEmail] = email;
		quantidadeEmail++;                                           // proximo email a ser adicionado
	}
	// 
	public boolean esthaLotado() {
		if (getQuantidadeEmail() > 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Email[] getEmailsRemetente(String remetente) {
		if (getQuantidadeEmail() > 0) {
			// array auxiliar
			Email[] emailsEnviadoremetente = new Email[getQuantidadeEmail()];
			int i = 0;
			for (Email p: emails) {
				if (p != null && p.getRemetente().equals(remetente)) {
					emailsEnviadoremetente[i] = p;
					i++;
				}
			}
			return emailsEnviadoremetente;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Gmail [emails=" + Arrays.toString(emails) + ", quantidadeEmail=" + quantidadeEmail + "]";
	}
	
}
