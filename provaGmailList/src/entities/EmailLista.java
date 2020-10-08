package entities;

public class EmailLista {
	
	private String conteudo;
	private String remetente;
	private String destinatario;
	private DataLista dataEnvio;
	
	private static int quantidadeMaxEmails;

	public EmailLista(String conteudo, String remetente, String destinatario, DataLista dataEnvio) {
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

	public DataLista getDataEnvio() {
		return dataEnvio;
	}

	public static int getQuantidadeMaxEmails() {
		return quantidadeMaxEmails;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
		result = prime * result + ((destinatario == null) ? 0 : destinatario.hashCode());
		result = prime * result + ((remetente == null) ? 0 : remetente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailLista other = (EmailLista) obj;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (dataEnvio == null) {
			if (other.dataEnvio != null)
				return false;
		} else if (!dataEnvio.equals(other.dataEnvio))
			return false;
		if (destinatario == null) {
			if (other.destinatario != null)
				return false;
		} else if (!destinatario.equals(other.destinatario))
			return false;
		if (remetente == null) {
			if (other.remetente != null)
				return false;
		} else if (!remetente.equals(other.remetente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conteudo do email "
			+ 	conteudo
			+ ", remetente: "
			+ remetente
			+ ", destinatario: "
			+ destinatario
			+ ", "
			+ dataEnvio;
	}

}
