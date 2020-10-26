package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected Data data;
	protected ContaCorrente conta;
	protected Data dataIngresso;
	
	List<Corrida> corridas = new ArrayList<Corrida>();
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String cpf, Data data, ContaCorrente conta, Data dataIngresso) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.conta = conta;
		this.dataIngresso = dataIngresso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public Data getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Data dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public List<Corrida> getCorridas() {
		return corridas;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	// metodo para adicionar corrida
	public void adicionarCorrida(Corrida corrida) {
		corridas.add(corrida);
	}
	
	// metodo remover corrida
	public void removerCorrida(Corrida corrida) {
		corridas.remove(corrida);
	}
	

}
