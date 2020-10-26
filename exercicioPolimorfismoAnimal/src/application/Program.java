package application;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;
import entities.Zoologico;

public class Program {

	public static void main(String[] args) {
		
		
		Animal cachorro = new Cachorro("Sardinha");
		Animal cavalo = new Cavalo("Oreinha");
		Animal preguica = new Preguica("Maresia");
		
		// animais emitindo som
		cachorro.emitirSom();
		System.out.println("------------------");
		
		cavalo.emitirSom();
		System.out.println("-------------------");
		
		preguica.emitirSom();
		System.out.println("-------------------");
		
		
		Zoologico jaula = new Zoologico();
		
		// adicionando animais a jaula
		jaula.adicionarAnimalJaula(cachorro);
		jaula.adicionarAnimalJaula(cavalo);
		jaula.adicionarAnimalJaula(preguica);
		
		// cutucando animais
		jaula.cutuqueAnima();
	

	}

}
