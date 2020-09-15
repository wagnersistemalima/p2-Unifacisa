package entities;

import entities.enums.Cor;

public class Automovel {
	
//	private static boolean promocao;
	private boolean promocao;
	
	private String nome;
	private String marca;
	private Cor cor;
	private Integer portas;
	private boolean vidroEletrico;
	private boolean arCondicionado;
	private boolean cambioAutomatico;
	private boolean direcaoEletrica;
	private double precoBase;
	
	public Automovel() {
		
	}
	
	// construtor de um carro basico
	public Automovel(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = Cor.BRANCO;
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}

	// construtor de um carro personalizado
	
	public Automovel(String nome, String marca, Cor cor, Integer portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Integer getPortas() {
		return portas;
	}

	public void setPortas(Integer portas) {
		this.portas = portas;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isDirecaoEletrica() {
		return direcaoEletrica;
	}

	public void setDirecaoEletrica(boolean direcaoEletrica) {
		this.direcaoEletrica = direcaoEletrica;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	

	// 

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	// função para calcular preco do carro
	public double calculaPreco() {
		double soma = precoBase;
		double descontoPromocao = 0.10;
		if (promocao) {
			soma -= soma * descontoPromocao;
		}
		
		if (vidroEletrico) {
			soma += 1250.0;
		}
		if (arCondicionado) {
			soma += 1250.0;
		}
		if (cambioAutomatico) {
			soma += 1250.0;
		}
		if (direcaoEletrica) {
			soma += 1250.0;
		}
		
		switch (cor) {
		case BRANCO:
			return soma;
		case AZUL:
			return soma;
		case VERMELHO:
			return soma;
		case PRETO:
			return soma;
		default:
			return soma += 1000.0;
		}
		
		
	}

	@Override
	public String toString() {
		return marca
			+  " "
			+ nome
			+ " "
			+ cor
			+ " "
			+ portas
			+ " portas, "
			+ ", "
			+ String.format("R$ %.2f", calculaPreco());
	}
}
