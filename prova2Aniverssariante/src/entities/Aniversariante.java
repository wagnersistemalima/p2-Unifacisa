package entities;

public class Aniversariante {
	
	// atributos basicos
	
	private String nome;
	private DataAniversario dataAniversario;
	
	// construtor
	
	
	
	public Aniversariante(String nome, int dia, int mes) {
		
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
		
	}
	
	// Getters & setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	// metodo para decobrir se o aniversariante e daquele mes
	
	public boolean ehAniversarianteDoMes(int mes) {
		if (this.dataAniversario.getMes() == mes) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
