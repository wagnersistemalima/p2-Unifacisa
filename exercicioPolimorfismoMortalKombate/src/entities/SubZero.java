package entities;

public class SubZero extends Lutador{
	
	// construtor
	
	public SubZero() {
		super("SubZero");
	}
	
	// metodos utilizando polimorfismo e reuso soltar magia da super classe Lutador

	@Override
	public void magia(Lutador adversario) {
		if (adversario != null) {
			super.magia(adversario);
			adversario.vida -= 8;
		}
		
	}
	
	

}
