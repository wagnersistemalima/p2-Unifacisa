package entities;

public class Carro {
	
	// atributos basicos 
	
	private String modelo;
	private String marca;
	private int ano;
	private double diaria;
	private boolean alugado;
	
	
	// costrutor
	
	
	public Carro(String modelo, String marca, int ano, double diaria) {
	
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.diaria = diaria;
		
	}
	
	// gatters


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

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	@Override
	public String toString() {
		return modelo + ", " +  marca + ", " + ano;
			
				
	}
	
	
	

}
