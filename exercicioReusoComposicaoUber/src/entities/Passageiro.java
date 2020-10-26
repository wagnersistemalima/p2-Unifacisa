package entities;

public class Passageiro extends Pessoa{
	
	public Passageiro() {
		
	}
	
	public Passageiro(String nome, String cpf, Data data, ContaCorrente conta, Data dataIngresso) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.conta = conta;
		this.dataIngresso = dataIngresso;
	}

}
