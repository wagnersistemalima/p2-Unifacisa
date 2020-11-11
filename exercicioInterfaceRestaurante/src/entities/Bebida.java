package entities;

import entities.enums.SaborBebida;
import entities.enums.Tamanho;
import interfaces.Item;

//a classe bebida assina o contrato com a interface item, e tem a responsabilidade de implementar os metodos

public class Bebida implements Item{
	
	// atributos basicos
	
	protected SaborBebida saborBebida;
	protected Tamanho tamanho;
	
	// construtor com arguimento
	
	public Bebida(SaborBebida saborBebida, Tamanho tamanho) {
		this.saborBebida = saborBebida;
		this.tamanho = tamanho;
	}
	
	// Getters

	public Tamanho getTamanho() {
		return tamanho;
	}

	public SaborBebida getSaborBebida() {
		return saborBebida;
	}
	
	
	// HashCode & equals
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((saborBebida == null) ? 0 : saborBebida.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
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
		Bebida other = (Bebida) obj;
		if (saborBebida != other.saborBebida)
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	
	// metodos da assinatura do contrato
	
	// metodo para retornar o preço das bebidas

	@Override
	public double getPreco() {
		return tamanho.getValor() + saborBebida.getValor();
	}
	
	// metodo para retornar a descrição das bebidas

	@Override
	public String getDescricao() {
		return saborBebida.name() + " " + tamanho.name();
	}

}
