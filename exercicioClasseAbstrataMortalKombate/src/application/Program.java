package application;

import entities.LiuKang;
import entities.Lutador;
import entities.MortalKombate;
import entities.NightWolf;
import entities.Sonia;
import entities.SubZero;

public class Program {

	public static void main(String[] args) {

		// criando personagens
		Lutador personagem1 = new LiuKang();
		Lutador personagem2 = new SubZero();
		
		Lutador personagem3 = new Sonia();
		Lutador personagem4 = new NightWolf();

		// criando a arena de combate

		MortalKombate arena1 = new MortalKombate(personagem1, personagem2);
		
		MortalKombate arena2 = new MortalKombate(personagem3, personagem4);

		// começando os combates reiniciando a luta com personagens com life cheio

		for (int i = 0; i < 1; i++) {
			arena1.fight();
			arena2.fight();
			System.out.println("Vencedor 1º combate -> " + arena1.getVencedor());
			System.out.println("Vencedor 2º combate -> " + arena2.getVencedor());
			personagem1.setVida(100);
			personagem2.setVida(100);
			personagem3.setVida(100);
			personagem4.setVida(100);
			System.out.println("-----------------End Game!---------------------");
		}
		
		

	}

}
