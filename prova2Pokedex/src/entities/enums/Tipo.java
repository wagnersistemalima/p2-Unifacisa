package entities.enums;

public enum Tipo {
	
	
	
	NORMAL,
	LUTADOR,
	VENENOSO,
	TERRA, 
	PEDRA,
	INSETO,
	FANTASMA,
	METAL,
	FOGO,
	ÁGUA,
	GELO,
	SOMBRIO,
	PSÍQUICO,
	ELÉTRICO,
	PLANTA,
	DRAGÃO,
	FADA;
	
	private int quantidadePokemon;

	public int getQuantidadePokemon() {
		return quantidadePokemon;
	}

	public void setQuantidadePokemon(int quantidadePokemon) {
		this.quantidadePokemon = quantidadePokemon;
	}
	
	

}
