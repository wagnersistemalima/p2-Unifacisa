package entities;

public class Corrida {
	
	private Data dataInicioDeCorrida;
	private Data dataFimDeCorrida;
	private Double km;
	
	public Corrida() {
		
	}

	public Corrida(Data dataInicioDeCorrida, Data dataFimDeCorrida, Double km) {
		super();
		this.dataInicioDeCorrida = dataInicioDeCorrida;
		this.dataFimDeCorrida = dataFimDeCorrida;
		this.km = km;
	}

	public Data getDataInicioDeCorrida() {
		return dataInicioDeCorrida;
	}

	public void setDataInicioDeCorrida(Data dataInicioDeCorrida) {
		this.dataInicioDeCorrida = dataInicioDeCorrida;
	}

	public Data getDataFimDeCorrida() {
		return dataFimDeCorrida;
	}

	public void setDataFimDeCorrida(Data dataFimDeCorrida) {
		this.dataFimDeCorrida = dataFimDeCorrida;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}
	
	// metodo para calcular a corrida para carros convencionais
	public double UberX() {
		double pagamentoPorCorridaUber = 5.0 + (km * 1.6);
		return pagamentoPorCorridaUber;
	}
	
	// metodo para calcular a corrida com carros de luxo
	public double uberVip() {
		double pagamentoPorCorridaUber = 5.0 + (km * 2.3);
		return pagamentoPorCorridaUber;
	}
	
	// metodo para calcular corrida compartilhada
	public double uberPool() {
		double pagamentoPorCorridaUber = 4.5 + (km * 1.3);
		return pagamentoPorCorridaUber;
	}

}
