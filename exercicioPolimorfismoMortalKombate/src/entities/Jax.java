package entities;

public class Jax extends Lutador{
	
	// construtor
	
	public Jax() {
		super("Jax");
	}
	
	// metodo utilizando polimorfismo e reuso socar da super classe Lutador

	@Override
	public void socar(Lutador adversario) {
		if (adversario != null) {
			super.socar(adversario);
			adversario.vida -= 10;
		}
		
	}
	

}
