package application;

import entities.Data;
import entities.Email;
import entities.Gmail;

public class Program {

	public static void main(String[] args) {
		
		Gmail gmail = new Gmail();                                                // instaciei o gmail
		
		short dia = 1;
		short mes = 8;
		short ano = 2020;
		short hora = 3;
		
		Data dataEnvio1 = new Data(dia, mes, ano, hora);
		Data dataEnvio2 = new Data(5, 3, 2019, 14);
		Data dataEnvio3 = new Data(9, 4, 1988, 15);
		
		Email email1 = new Email("aula1", "paulo", "maria", dataEnvio1);
		Email email2 = new Email("aula2", "paulo", "joao", dataEnvio2);
		
		gmail.enviarEmail(email1);                                         // metodo enviar email
		gmail.enviarEmail(email2);
		gmail.enviarEmail("aula3", "ana", "josefa", dataEnvio3);           // reuso metodo com argumentos
		System.out.println("---------------------------------Mostrando todos emails enviados------------------------------------------");
		for (Email start: gmail.getEmails()) {                            // mostrar emails enviados.
			System.out.println(start);
		}
		System.out.println("-----------------------Mostrando a quantidade de emails enviados------------------------------------------");
		
		// função para retornar a quantidade emails eviados pelo gmail
		System.out.println("Foram enviados " + gmail.getQuantidadeEmails() + " emails");
		
		System.out.println("------------------------Mostrando se a caixa de email está lotada-----------------------------------------");
		// função que indica se a caixa de email está lotada
		System.out.println(gmail.estahLotado());
		System.out.println("---------------Mostrando emails enviados pelo remetente---------------------------------------------------");
		
		// função que retorna todos os emails enviados pelo mesmo remetente
		Email[] emailEnviadoRemetente = gmail.getEmailsRemetente("paulo");
		for (Email start: emailEnviadoRemetente) {
			System.out.println(start);
		}
		
		System.out.println("------------------Mostrando email com uma determinada palavra no conteudo-----------------------------------");
		// Função que retorna todos os emails que contenha uma determinada palavra no conteudo
		Email[] cacaPalavra = gmail.getEmailsComPalavra("aula3");
		for (Email start: cacaPalavra) {
			System.out.println(start);
		}
		
		System.out.println("-----------------------------------Mostrando o email mais antigo--------------------------------------------");
		// função auxiliar para retornar o email mais antigo pelo remetente
		Email[] antigo = gmail.emailMaisAntigo("paulo");
		for (Email start: antigo) {
			System.out.println(start);
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
		// função remover
		
	}

}
