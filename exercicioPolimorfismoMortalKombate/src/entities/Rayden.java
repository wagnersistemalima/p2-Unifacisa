package entities;

public class Rayden extends Lutador{
	
	// construtor
	
	public Rayden() {
		super("Rayden");
	}
	
	// metodos utilizando polimorfismo e reuso soltar magia da super classe Lutador

	@Override
	public void magia(Lutador adversario) {
		if (adversario != null) {
			super.magia(adversario);
			adversario.vida -= 9;
		}
		
	}
	
	

}
