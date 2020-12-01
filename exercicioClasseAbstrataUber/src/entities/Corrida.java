package entities;

public abstract class Corrida {
	
	// atributos basicos
	
	protected double km;
	protected double precoBase;
	protected double precoKm;
	
	// construtor padrao
	
	public Corrida() {
		
	}
	
	// construtor com argumento
	

	public Corrida(double km, double precoBase, double precoKm) {
		
		this.km = km;
		this.precoBase = precoBase;
		this.precoKm = precoKm;
	}
	
	// metodo abstrato
	
	public abstract double getValor();

}
