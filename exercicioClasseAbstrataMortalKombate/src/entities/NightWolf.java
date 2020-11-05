package entities;

// classe concreta e obrigada a implementar o metodo abstrato da super classe, se quiser ser concreta

public class NightWolf extends Lutador{
	
	// construtor
	
	public NightWolf() {
		super("NightWolf");
	}
	
	// metodo abstrato da super classe atirar

	@Override
	public void atirar(Lutador adversario) {
		if (adversario != null) {
			adversario.vida -= 12;
		}
	}
	
	// metodo utilizando polimorfismo e reuso soltar magia da super classe Lutador

	@Override
	public void magia(Lutador adversario) {
		if (adversario != null) {
			super.magia(adversario);
			adversario.vida -= 6;
		}
		
	}
	
	

}
