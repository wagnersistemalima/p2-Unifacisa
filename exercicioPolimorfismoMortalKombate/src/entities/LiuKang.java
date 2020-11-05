package entities;

public class LiuKang extends Lutador{
	
	// construtor
	
	public LiuKang() {
		super("Liu Kang");
	}
	
	// metodos utilizando polimorfismo e reuso chutar e soltar magia da super classe Lutador

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
