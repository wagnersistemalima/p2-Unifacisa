package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String conteudo;
	private String remetente;
	private String destinatario;
	private Date dataEnvio;
	private static int quantidadeMaxEmails;
	
	
	
	public Email(String conteudo, String remetente, String destinatario, Date dataEnvio) {
		this.conteudo = conteudo;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.dataEnvio = dataEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	public String getRemetente() {
		return remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public static int getQuantidadeMaxEmails() {
		return quantidadeMaxEmails;
	}


	@Override
	public String toString() {
		return "Email [conteudo=" + conteudo + ", remetente=" + remetente + ", destinatario=" + destinatario
				+ ", dataEnvio=" + sdf.format(dataEnvio) + "]";
	}
	
	
	
}
