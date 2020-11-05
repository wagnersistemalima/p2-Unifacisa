package entities;

//classe concreta e obrigada a implementar o metodo abstrato da super classe, se quiser ser concreta

public class Jax extends Lutador{
	
	// construtor
	
	public Jax() {
		super("Jax");
	}
	
	// metodo abstrato atirar da super classe

	@Override
	public void atirar(Lutador adversario) {
		
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
