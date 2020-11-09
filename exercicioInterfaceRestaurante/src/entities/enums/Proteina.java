package entities.enums;

public enum Proteina {
	
	// lista de constantes
	
	PICANHA(20.0),
	MAMINHA(15.0),
	FRANGO(15.0),
	LINGUICA(10.0),
	CARNE_DE_SOL(25.0);
	
	// atributos basicos
	
	private double valor;
	
	// construtor com argumento / modificador de acesso (nada)
	
	Proteina(double valor) {
		this.valor = valor;
	}
	
	// Getters

	public double getValor() {
		return valor;
	}

}
