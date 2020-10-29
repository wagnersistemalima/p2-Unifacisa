package entities;

public class UberXVip extends UberX{
	
	// construtor com argumentos

	public UberXVip(double km) {
		super(km);
		
	}
	
	// metodo
	
	@Override
	public double getValor() {
		return 0.9 * super.getValor();
	}

}
