package entities.enums;

public enum Carboidrato {
	
	// lista de constantes
	
	FEIJAO(2.0),
	ARROZ(1.5),
	PURE(1.5),
	BATATA(1.0),
	ARRUMADINHO(2.5);
	
	// ATRIBUTOS BASICOS
	
	private double valor;
	
	// construtor com argumento / modificador de acesso (nada)
	
	Carboidrato(double valor) {
		this.valor = valor;
	}
	
	// Getters

	public double getValor() {
		return valor;
	}
	
}
