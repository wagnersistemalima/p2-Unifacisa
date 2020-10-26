package entities;

public class Preguica extends Animal{
	
	public Preguica(String nome) {
		super(nome);
	}
	
	// metodo correr
	public void escalarArvore() {
		System.out.println("Nao!");
	}
	
	// metodo emitir som
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("ZZZzzzzzzzzZZzzzz");
	}

}
