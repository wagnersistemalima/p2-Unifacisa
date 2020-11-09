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
