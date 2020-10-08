package entities;

public class Data {
	
	private short dia;
	private short mes;
	private short ano;
	private short hora;
	
	
	public Data(int dia, int mes, int ano, int hora) {
		this.dia = (short) dia;
		this.mes = (short) mes;
		this.ano = (short) ano;
		this.hora = (short) hora;
	}


	public int getDia() {
		return dia;
	}


	public int getMes() {
		return mes;
	}


	public int getAno() {
		return ano;
	}


	public int getHora() {
		return hora;
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
