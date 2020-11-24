package entities;

public class Data {
	
	// atributos basico


	private int dia;
	private int mes;
	
	
	// construtor 
	
	
	public Data(int dia, int mes) {
		
		this.dia = dia;
		this.mes = mes;
	}

	
	// Getters
	
	public int getDia() {
		return dia;
	}


	public int getMes() {
		return mes;
	}
	
	
	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + "]";
	}
	

}
