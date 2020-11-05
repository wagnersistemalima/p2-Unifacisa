package entities;

//classe concreta e obrigada a implementar o metodo abstrato da super classe, se quiser ser concreta

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
	
	// metodo abstrato atirar da super classe

	@Override
	public void atirar(Lutador adversario) {
		
	}

}
