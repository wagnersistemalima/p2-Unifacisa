package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GmailLista {
	
	private List<EmailLista> lista;
	private Integer quantidadeDeEmails;
	
	public GmailLista() {
		lista = new ArrayList<EmailLista>();
		quantidadeDeEmails = 0;
	}

	public List<EmailLista> getLista() {
		return lista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
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
		GmailLista other = (GmailLista) obj;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}
	
	// função para enviar email
	public void enviarEmail(EmailLista email) {
		lista.add(email);
	}
	// funçao para enviar email
	public void enviarEmail(String conteudo, String remetente, String destinatario, DataLista dataEnvio) {
		lista.add(new EmailLista(conteudo, remetente, destinatario, dataEnvio));
	}
	
	public void removerEmail(EmailLista email) {
		lista.remove(email);
	}
	
	// função para retornar a quantidade de emails enviados
	public Integer getQuantidadeDeEmails() {
		for (EmailLista start: lista) {
			if (start.getRemetente() != null) {
				quantidadeDeEmails++;
			}
		}
		return quantidadeDeEmails;
	}
	
	// Função que retorna um booleano que indica se a caixa de entrada atingiu sua capacidade
	public boolean estahLotado() {
		if (getQuantidadeDeEmails() < 10) {
			return false;
		}
		return true;
	}
	
	// Função que retorne todos os emails enviados pelo mesmo remetente
	
	public List<EmailLista> getEmailsRemetente(String remetente) {
		List<EmailLista> resultado = new ArrayList<EmailLista>();
		for (EmailLista p: lista) {
			if (p.getRemetente().equals(remetente)) {
				// filtrar a lista, de modo que fique no resultado aqueles emails que tem o nome do remetente
				// utilizei a função lambida, que recebe um predicado
				 resultado = lista.stream().filter(x -> x.getRemetente().equals(remetente)).collect(Collectors.toList());			
			}
			if (resultado != null) {
				return resultado;
			}
			
		}
		return null;				
	}
	
	// Função que retorne todos os emails que contenham uma determinada palavra no conteúdo
	public List<EmailLista> getEmailsComPalavra(String palavra) {
		List<EmailLista> resultado = new ArrayList<EmailLista>();
		for (EmailLista p: lista) {
			if (p.getConteudo().equals(palavra)) {
				// filtrar a lista, usando a funçao lambida
				resultado = lista.stream().filter(x -> x.getConteudo().equals(palavra)).collect(Collectors.toList());
				return resultado;
			}	
		}
		return null;
	}
	
	// Função que remova o email mais antigo de um determinado remetente
	


}
