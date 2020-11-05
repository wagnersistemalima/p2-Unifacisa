package application;

import entities.LiuKang;
import entities.Lutador;
import entities.MortalKombate;
import entities.SubZero;

public class Program {

	public static void main(String[] args) {
		
		
		// criando personagens
		Lutador personagem1 = new LiuKang();
		Lutador personagem2 = new SubZero();
		
		// criando a arena de combate 
		
		MortalKombate arena = new MortalKombate(personagem1, personagem2);
		
		
		// começando os combates reiniciando a luta com personagens com life cheio 
		
		for (int i=0; i<10; i++) {
			arena.fight();
			System.out.println("Vencedor -> " + arena.getVencedor());
			personagem1.setVida(100);
			personagem2.setVida(100);
			System.out.println("--------------------------------------");
		}

	}

}
