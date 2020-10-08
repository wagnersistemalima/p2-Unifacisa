package entities;

public class DataLista {
	
	private short dia;
	private short mes;
	private short ano;
	private short hora;
	
	
	public DataLista(int dia, int mes, int ano, int hora) {
		super();
		this.dia = (short) dia;
		this.mes = (short) mes;
		this.ano = (short) ano;
		this.hora = (short) hora;
	}


	public short getDia() {
		return dia;
	}


	public short getMes() {
		return mes;
	}


	public short getAno() {
		return ano;
	}


	public short getHora() {
		return hora;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + hora;
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
		DataLista other = (DataLista) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (hora != other.hora)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Data: "
				+ dia
				+ "/"
				+ mes
				+ "/"
				+ ano
				+ " as "
				+ hora
				+ " horas";
	}

}
