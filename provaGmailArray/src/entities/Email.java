package entities;

public class Email {
	
	private String conteudo;
	private String remetente;
	private String destinatario;
	private Data dataEnvio;                            // ageitar atributo
	
	private static int quantidadeMaximaEmail = 10;
	

	public Email(String conteudo, String remetente, String destinatario, Data dataEnvio) {
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

	public Data getDataEnvio() {
		return dataEnvio;
	}

	public static int getQuantidadeMaximaEmail() {
		return quantidadeMaximaEmail;
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
