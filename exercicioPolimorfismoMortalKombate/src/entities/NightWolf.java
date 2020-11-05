package entities;

public class NightWolf extends Lutador{
	
	// construtor 
	
	public NightWolf() {
		super("NightWolf");
	}
	
	// metodos utilizando polimorfismo e reuso atirar e soltar magia da super classe Lutador

	@Override
	public void atirar(Lutador adversario) {
		if (adversario != null) {
			super.atirar(adversario);
			adversario.vida -= 5;
		}
		
	}

	@Override
	public void magia(Lutador adversario) {
		if (adversario != null) {
			super.magia(adversario);
			adversario.vida -= 6;
		}
		
	}
	
	

}
