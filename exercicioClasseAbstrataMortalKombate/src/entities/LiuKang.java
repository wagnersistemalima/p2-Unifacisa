package entities;

//classe concreta e obrigada a implementar o metodo abstrato da super classe, se quiser ser concreta

public class LiuKang extends Lutador{
	
	// construtor
	
	public LiuKang() {
		super("LiuKang");
	}
	
	// metodo abstrato atirar da super classe

	@Override
	public void atirar(Lutador adversario) {
		
	}
	
	// metodo utilizando polimorfismo e reuso chutar e soltar magia da super classe Lutador

	@Override
	public void chutar(Lutador adversario) {
		if (adversario != null) {
			super.chutar(adversario);
			adversario.vida -= 9;
		}
		
	}

	@Override
	public void magia(Lutador adversario) {
		if (adversario != null) {
			super.magia(adversario);
			adversario.vida -= 8;
		}
		
	}

}
