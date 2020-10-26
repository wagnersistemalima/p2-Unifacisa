package entities;

public class Cavalo extends Animal{
	
	public Cavalo(String nome) {
		super(nome);
	}
	
	// metodo correr
	public void correr() {
		System.out.println("Cavalo correndo ");
	}
	
	// metodo emitir som
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Hiiiroron homm!");
	}

}
