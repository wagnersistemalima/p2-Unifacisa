package entities;

public class UberPool extends UberX{
	
	// atributos basicos
	
	private int numeroPassageiro;
	
	// construtor com argumento

	public UberPool(double km, int passageiro) {
		super(km);
		this.numeroPassageiro = passageiro;
	}
	
	@Override
	public double getValor() {
		return super.getValor() / numeroPassageiro;
	}

}
