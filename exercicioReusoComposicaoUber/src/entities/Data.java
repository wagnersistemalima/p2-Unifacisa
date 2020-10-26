package entities;

public class Data {
	
	private Integer dia;
	private Integer mes;
	private Integer ano;
	private Integer minuto;
	private Integer segundo;
	
	public Data() {
		
	}

	public Data(Integer dia, Integer mes, Integer ano, Integer minuto, Integer segundo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getSegundo() {
		return segundo;
	}

	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}
	
	

}
