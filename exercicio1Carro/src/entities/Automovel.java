package entities;

public class Automovel {
	
	private String nome;
	private String marca;
	private String cor;
	private Integer portas;
	private boolean vidroEletrico;
	private boolean arCondicionado;
	private boolean cambioAutomatico;
	private boolean direcaoEletrica;
	private double precoBase;
	
	public Automovel() {
		
	}
	
	

	public Automovel(String nome, String marca, String cor, Integer portas, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.precoBase = precoBase;
	}

	public Automovel(String nome, String marca, String cor, Integer portas, boolean vidroEletrico,
			boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
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
	
	public void calculaPreco() {
		
		double soma = 0.0;
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
		else {
			soma = 0.0;
		}
		
		switch (cor) {
		case "branco":
			precoBase += soma;
			break;
		case "azul":
			precoBase += soma;
			break;
		case "vermelho":
			precoBase += soma;
			break;
		case "preto":
			precoBase += soma;
			break;
		default:
			precoBase += 1000.0 + soma;
			break;
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
			+ String.format("R$ %.2f", precoBase);
	}
}
