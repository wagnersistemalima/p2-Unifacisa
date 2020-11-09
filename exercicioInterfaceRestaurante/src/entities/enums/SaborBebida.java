package entities.enums;

public enum SaborBebida {
	
	// lista de constantes
	
	COCA_COLA(5.0),
	QUARANA(5.0),
	SUCO_DE_LARANJA(4.0),
	AQUA_COM_GAS(3.0),
	CERVEJA(8.0),
	WHISKY(12.0);
	
	// atributos basicos
	
	private double valor;
	
	// construtor com argumento / modificador de acesso (nada)

	SaborBebida(double valor) {
		this.valor = valor;
	}
	
	// Getters

	public double getValor() {
		return valor;
	}
	
}
