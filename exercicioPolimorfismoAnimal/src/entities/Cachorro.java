package entities;

public class Cachorro extends Animal{
	
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	// metodo correr
	public void correr() {
		System.out.println("Cachorro correndo ");
	}
	
	// metodo emitir som
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Au Au Auuuu!");
	}

}
