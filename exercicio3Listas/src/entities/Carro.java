package entities;

import java.util.Random;

import entities.enums.Cor;

public class Carro {
	
	private int id;
	private String nome;
	private String marca;
	private Cor cor;
	private int porta;
	private boolean vidroEletrico;
	private boolean cambioAutomatico;
	private boolean direcaoEletrica;
	private double preco;
	
	Random random = new Random();
	
	public Carro() {
		
	}
	
	public Carro(String nome, String marca, double preco) {
		
		this.id = 25;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.porta = 2;
		this.cor = Cor.BRANCO;
		this.vidroEletrico = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}

	public Carro(int id, String nome, String marca, Cor cor, int porta, boolean vidroEletrico, boolean cambioAutomatico,
			boolean direcaoEletrica, double preco) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.porta = porta;
		this.vidroEletrico = vidroEletrico;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carro -> Id: "
			+  id
			+  ", nome: "
			+ nome
			+ ", marca: "
			+ marca
			+ ", cor: "
			+ cor
			+ ", portas: "
			+ porta
			+ ", vidro eletrico: "
			+ vidroEletrico
			+ ", cambio automatico: "
			+ cambioAutomatico
			+ ", direção eletrica: "
			+ direcaoEletrica
			+ ", preço: "
			+ String.format("R$ %.2f", preco);
	}
	
	

}
