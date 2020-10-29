package entities;

public class UberX extends Corrida{
	
	// construtor com argumentos
	
	public UberX(double km) {
		super(km, 4, 1.2);
	}
	
	// metodo
	
	@Override
	public double getValor() {
		return super.precoBase + super.km * super.precoKm;
	}

}
