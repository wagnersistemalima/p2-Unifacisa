package entities;

public class Imovel {
	
	private String tipo;                                                             // casa ou apartamento
	private String imobiliaria;
	private Integer numeroDePavimentos;
	private Integer pavimento;
	private Integer numeroDeQuartos;
	private Integer numeroDeSuites;
	private Integer numeroDeBanheiros;
	private Integer areaMetrosQuadrados;
	private boolean elevador;
	private boolean piscina;
	private boolean quadra;
	private Double precoFinal = 0.0;
	
	public Imovel() {
		
	}

	public Imovel(String tipo, String imobiliaria, Integer numeroDeQuartos, Integer numeroDeSuites,   // costrutor casa
			Integer numeroDeBanheiros, Integer areaMetrosQuadrados, boolean piscina, boolean quadra, boolean elevador) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.numeroDeQuartos = numeroDeQuartos;
		this.numeroDeSuites = numeroDeSuites;
		this.numeroDeBanheiros = numeroDeBanheiros;
		this.areaMetrosQuadrados = areaMetrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
	}

	public Imovel(String tipo, String imobiliaria, Integer numeroDePavimentos, Integer pavimento,    // construtor apartamento
			Integer numeroDeQuartos, Integer numeroDeSuites, Integer numeroDeBanheiros, Integer areaMetrosQuadrados,
			boolean elevador, boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.numeroDePavimentos = numeroDePavimentos;
		this.pavimento = pavimento;
		this.numeroDeQuartos = numeroDeQuartos;
		this.numeroDeSuites = numeroDeSuites;
		this.numeroDeBanheiros = numeroDeBanheiros;
		this.areaMetrosQuadrados = areaMetrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImobiliaria() {
		return imobiliaria;
	}

	public void setImobiliaria(String imobiliaria) {
		this.imobiliaria = imobiliaria;
	}

	public Integer getNumeroDePavimentos() {
		return numeroDePavimentos;
	}

	public void setNumeroDePavimentos(Integer numeroDePavimentos) {
		this.numeroDePavimentos = numeroDePavimentos;
	}

	public Integer getPavimento() {
		return pavimento;
	}

	public void setPavimento(Integer pavimento) {
		this.pavimento = pavimento;
	}

	public Integer getNumeroDeQuartos() {
		return numeroDeQuartos;
	}

	public void setNumeroDeQuartos(Integer numeroDeQuartos) {
		this.numeroDeQuartos = numeroDeQuartos;
	}

	public Integer getNumeroDeSuites() {
		return numeroDeSuites;
	}

	public void setNumeroDeSuites(Integer numeroDeSuites) {
		this.numeroDeSuites = numeroDeSuites;
	}

	public Integer getNumeroDeBanheiros() {
		return numeroDeBanheiros;
	}

	public void setNumeroDeBanheiros(Integer numeroDeBanheiros) {
		this.numeroDeBanheiros = numeroDeBanheiros;
	}

	public Integer getAreaMetrosQuadrados() {
		return areaMetrosQuadrados;
	}

	public void setAreaMetrosQuadrados(Integer areaMetrosQuadrados) {
		this.areaMetrosQuadrados = areaMetrosQuadrados;
	}

	public boolean isElevador() {
		return elevador;
	}

	public void setElevador(boolean elevador) {
		this.elevador = elevador;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isQuadra() {
		return quadra;
	}

	public void setQuadra(boolean quadra) {
		this.quadra = quadra;
	}

	public Double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(Double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public void calculaPreco() {
		int opcao = 0;
		if (elevador) {
			opcao += 2500;
		}
		if (piscina) {
			opcao += 2500;
		}
		if (quadra) {
			opcao += 2500;
		}
		
		if (tipo == "casa") {
			precoFinal += areaMetrosQuadrados * 5000 + opcao;
		}
		if (tipo == "apartamento") {
			int precoPorAndar = 0;
			int cont = 1;
			for (int i=5; i<=pavimento; i++) {
					precoPorAndar = cont * 2000;
					cont++;
			}
			precoFinal += areaMetrosQuadrados * 5000 + opcao + precoPorAndar;
		}
		
	}
	
	@Override
	public String toString() {
		return tipo
			+ ", "
			+ imobiliaria
			+ ", "
			+ numeroDeQuartos
			+ " quartos, "
			+ numeroDeSuites
			+ " suite "
			+ numeroDeBanheiros
			+ " banheiros, "
			+ areaMetrosQuadrados
			+ " m2, preço final R$ "
			+ String.format("%.2f", precoFinal);
			
	}

}
