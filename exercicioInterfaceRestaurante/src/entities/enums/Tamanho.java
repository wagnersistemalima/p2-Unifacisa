package entities.enums;

public enum Tamanho {
	
	// lista de constantes
	
	PEQUENO(0.0),
	MEDIO(2.0),
	GRANDE(2.8);
	
	// atributos basicos
	
	private double valor;
	
	// construtor com argumento / modificador de acesso (nada)

	Tamanho(double valor) {
		this.valor = valor;
	}
	
	// getters

	public double getValor() {
		return valor;
	}

}
