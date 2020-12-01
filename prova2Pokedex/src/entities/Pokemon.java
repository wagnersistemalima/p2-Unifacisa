package entities;

import entities.enums.Tipo;

public class Pokemon {
	
	// atributos basicos
	
	private String nome;
	private Tipo tipo;
	private Data diaCaptura;
	
	// construtor
	
	public Pokemon(String nome, Tipo tipo, Data data) {
		this.nome = nome;
		this.tipo = tipo;
		this.diaCaptura = data;
	}
	
	// Getters

	public String getNome() {
		return nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Data getDiaCaptura() {
		return diaCaptura;
	}

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", diaCaptura=" + diaCaptura + "]";
	}
	
	// HashCode e equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diaCaptura == null) ? 0 : diaCaptura.hashCode());
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
		Pokemon other = (Pokemon) obj;
		if (diaCaptura == null) {
			if (other.diaCaptura != null)
				return false;
		} else if (!diaCaptura.equals(other.diaCaptura))
			return false;
		return true;
	}
	
	
}
