package entities;

public class UberBlack extends UberX{
	
	// construtor com argumento

	public UberBlack(double km) {
		super(km);
		
	}
	
	// metodo 
	
	@Override
	public double getValor() {
		return 1.1 * super.getValor();
	}

}
