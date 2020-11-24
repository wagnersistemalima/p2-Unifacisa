package entities;

public class Carro {
	
	// atributos basicos
	
	private String modelo;
	private String marca;
	private int ano;
	private double diaria;
	private boolean alugado;
	
	
	// construtor
	
	public Carro(String modelo, String marca, int ano, double diaria) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.diaria = diaria;
		this.alugado = false;
	}
	
	// Getters & setters


	public boolean isAlugado() {
		return alugado;
	}


	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}


	public String getModelo() {
		return modelo;
	}


	public String getMarca() {
		return marca;
	}


	public int getAno() {
		return ano;
	}


	public double getDiaria() {
		return diaria;
	}
	
	
	
	

}
