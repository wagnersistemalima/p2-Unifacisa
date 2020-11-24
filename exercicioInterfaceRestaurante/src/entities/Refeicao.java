package entities;

import entities.enums.Carboidrato;
import entities.enums.Proteina;
import interfaces.Item;

// a classe refeicao assina o contrato com a interface item, e tem a responsabilidade de implementar os metodos

public class Refeicao implements Item{
	
	// atributos basicos
	
	protected Proteina proteina;
	protected Carboidrato carboidrato;
	
	
	// construtor
	
	public Refeicao(Proteina proteina, Carboidrato carboidrato) {
		this.proteina = proteina;
		this.carboidrato = carboidrato;
	}

	// Getters 
	
	public Proteina getProteina() {
		return proteina;
	}

	public Carboidrato getCarboidrato() {
		return carboidrato;
	}
	
	// HashCode & equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carboidrato == null) ? 0 : carboidrato.hashCode());
		result = prime * result + ((proteina == null) ? 0 : proteina.hashCode());
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
		Refeicao other = (Refeicao) obj;
		if (carboidrato != other.carboidrato)
			return false;
		if (proteina != other.proteina)
			return false;
		return true;
	}
	
	    // metodos da assinatura do contrato
	
		// metodo para retornar o preco da refeição

	@Override
	public double getPreco() {
		return proteina.getValor() + carboidrato.getValor();
	}
	
	// metodo para retornar a descrição da refeição

	@Override
	public String getDescricao() {
		return proteina.name() + " com " + carboidrato.name();
	}

	@Override
	public String toString() {
		return getDescricao();
	}
	
	

}
