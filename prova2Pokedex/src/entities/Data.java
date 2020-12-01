package entities;

public class Data {
	
	// atributos basico
	
	private short dia;
	private short mes;
	private short ano;
	
	// construtor
	
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = (short) dia;
		this.mes = (short) mes;
		this.ano = (short) ano;
	}
	
	
	
	// HasCode & equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	// Getters & setters

	public short getDia() {
		return dia;
	}

	public short getMes() {
		return mes;
	}

	public short getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	

}
