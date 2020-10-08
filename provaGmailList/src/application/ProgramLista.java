package application;

import java.util.List;

import entities.DataLista;
import entities.EmailLista;
import entities.GmailLista;

public class ProgramLista {

	public static void main(String[] args) {
		
		GmailLista gmail = new GmailLista();
		
		DataLista dataEnvio1 = new DataLista(1, 5, 1980, 14);
		
		EmailLista email1 = new EmailLista("aula1", "paulo", "maria", dataEnvio1);
		
		// adicionando um email a lista função 1
		gmail.enviarEmail(email1);
		gmail.enviarEmail("aula2", "paulo", "joao", new DataLista(2, 4, 2020, 9));
		gmail.enviarEmail("aula3", "ana", "carol", new DataLista(5, 1, 2019, 15));
		
		
		// mostrando emails enviados
		for (EmailLista start: gmail.getLista()) {
			System.out.println(start);
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("Total emails enviados: " + gmail.getQuantidadeDeEmails());
		
		//  Função que retorna um booleano que indica se a caixa de entrada atingiu sua capacidade
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println(gmail.estahLotado());
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		// Função que retorne todos os emails enviados pelo mesmo remetente
		
		List<EmailLista> resultado2 = gmail.getEmailsRemetente("paulo");
		for (EmailLista start: resultado2) {
			System.out.println(start);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		// Função que retorne todos os emails que contenham uma determinada palavra no conteúdo
		List<EmailLista> resultado3 = gmail.getEmailsComPalavra("aula3");
		for (EmailLista start: resultado3) {
			System.out.println(start);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
	}

}
