package entities;

public class Sonia extends Lutador{
	
	// construtor 
	
	public Sonia() {
		super("Sonia");
	}
	
	// metodos utilizando polimorfismo e reuso de socar e chutar da super classe lutador

	@Override
	public void socar(Lutador adversario) {
		if (adversario != null) {
			super.socar(adversario);
			adversario.vida -= 8;
		}
		
	}

	@Override
	public void chutar(Lutador adversario) {
		if (adversario != null) {
			super.chutar(adversario);
			adversario.vida -= 8;
		}
		
	}
	
	

}
