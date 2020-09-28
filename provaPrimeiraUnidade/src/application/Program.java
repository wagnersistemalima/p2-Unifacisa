package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Email;
import entities.Gmail;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Gmail gmail = new Gmail();
		
		Email email = new Email("Prova", "Maria", "Jose", sdf.parse("01/10/2020"));
		Email email2 = new Email("Prova2", "Pedro", "Joao", sdf.parse("02/10/2020"));
		Email email3 = new Email("Prova3", "Maria", "Pedro", sdf.parse("05/10/2020"));
		
		
		// adicionar email ou enviar email
		gmail.addEmail(email);
		gmail.addEmail(email2);
		gmail.addEmail(email3);
		
		
		
		for (Email play: gmail.getEmails()) {
			System.out.println(play);
		}
		
		System.out.println("-------------------------------------------------------");
		
		// listar por remetente
		Email[] listarRemetente = gmail.getEmailsRemetente("wagner");
		
		for (Email play: listarRemetente) {
			System.out.println(play);
		}
		// quantidade de email
		System.out.println("--------------------------------------------------------");
		System.out.println(gmail.getQuantidadeEmail() + " emails");
		
		System.out.println("----------------------------------------------------------");
		// testar se o array está cheio
		System.out.println(gmail.esthaLotado());
		
	}

}
