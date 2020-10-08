package entities;

public class Data {
	
	private short dia;
	private short mes;
	private short ano;
	private short hora;
	
	
	public Data(short dia, short mes, short ano, short hora) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
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

}
