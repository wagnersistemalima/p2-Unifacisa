package entities;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	public Zoologico() {
		
	}
	
	List<Animal> jaula = new ArrayList<Animal>();
	
	// metodo adicionar animal a jaula
	public void adicionarAnimalJaula(Animal animal) {
		jaula.add(animal);
	}
	
	// metodo para cutucar animal
	public void cutuqueAnima() {
		for (Animal animal: jaula) {
			animal.emitirSom();
			if (animal instanceof Cachorro) {
				((Cachorro) animal).correr();
			}
			else if (animal instanceof Cavalo) {
				((Cavalo) animal).correr();
			}
			else if (animal instanceof Preguica) {
				((Preguica) animal).escalarArvore();
			}
		}
	}

}
