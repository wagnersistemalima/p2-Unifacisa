package entities;

public class Motorista extends Pessoa{
	
	public Motorista() {
		
	}
	
	public Motorista(String nome, String cpf, Data data, ContaCorrente conta, Data dataIngresso) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.conta = conta;
		this.dataIngresso = dataIngresso;
	}
	

}
