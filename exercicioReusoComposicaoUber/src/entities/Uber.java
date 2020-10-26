package entities;

import java.util.ArrayList;
import java.util.List;

public class Uber {
	
	private ContaCorrente contaEmpresa;
	
	private List<Corrida> corridaPendentes = new ArrayList<Corrida>();
	
	private List<Motorista> listaDeMotoristas = new ArrayList<Motorista>();
	
	private List<Pessoa> listaDeClientes = new ArrayList<Pessoa>();
	
	public Uber() {
		
	}

	public Uber(ContaCorrente contaEmpresa) {
		this.contaEmpresa = contaEmpresa;
	}

	public ContaCorrente getContaEmpresa() {
		return contaEmpresa;
	}

	public void setContaEmpresa(ContaCorrente contaEmpresa) {
		this.contaEmpresa = contaEmpresa;
	}

	public List<Corrida> getCorridaPendentes() {
		return corridaPendentes;
	}
	
	
	public List<Motorista> getListaDeMotoristas() {
		return listaDeMotoristas;
	}

	public List<Pessoa> getListaDeClientes() {
		return listaDeClientes;
	}

	// metodo para adicionar corridas pendentes
	public void adicionarCorridaPendente(Corrida corrida) {
		corridaPendentes.add(corrida);
	}
	
	// metodo para remover corridas pendentes
	public void removerCorridaPendente(Corrida corrida) {
		corridaPendentes.remove(corrida);
	}
	
	// metodo para cadastrar motorista
	public void cadastrarMotorista(Motorista motorista) {
		listaDeMotoristas.add(motorista);
	}
	
	// metodo para descadastrar motorista
	public void descadastrarMotorista(Motorista motorista) {
		listaDeMotoristas.remove(motorista);
	}
	
	// metodo para cadastrar cliente-pessoa
	public void cadastrarCliente(Pessoa cliente) {
		listaDeClientes.add(cliente);
	}
	
	// metodo para descadastrar cliente-pessoa
	public void descadastrarCliente(Pessoa cliente) {
		listaDeClientes.remove(cliente);
	}

}
