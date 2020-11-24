package entities;

import java.util.ArrayList;
import java.util.List;

import entities.sistemarestaurante.exception.ClienteInexistenteException;
import entities.sistemarestaurante.exception.PagamentoInvalidoException;
import entities.sistemarestaurante.exception.PedidoInexistenteException;
import interfaces.Item;

public class SistemaRestaurante {
	
	// atributo basico 
	
	private int mesa;
	
	// associaçoes
	
	private List<Cliente> clientes;
	
	// construtor
	
	public SistemaRestaurante() {
		this.mesa = 0;
		this.clientes = new ArrayList<Cliente>();
	}
	
	// metodo para adicionar clientes
	
	public void adicionarCliente(String nome) {
		Cliente cliente = new Cliente(mesa, nome);
		this.clientes.add(cliente);
		mesa ++;
	}
	
	// metodo para adicionar um pedido                        1º  lança uma exceção checada, ClienteInexistenteException
	
	public void adicionarPedido(int mesa, Item item) throws ClienteInexistenteException {
		Cliente cliente = null;
		try {
		cliente = this.clientes.get(mesa);               // add um cliente a uma mesa inexistente
		}
		catch(IndexOutOfBoundsException e) {
			throw new ClienteInexistenteException(mesa);             // exceção
		}
		cliente.adicionarPedido(item);
	}
	
	// metodo para remover um pedido      2º lança duas exceçoes chegadas, ClienteInexistenteException, PedidoInexistenteException
	
	public void removerPedido(int mesa, Item item) throws ClienteInexistenteException, PedidoInexistenteException {
		Cliente cliente = null;
		try {
		cliente = this.clientes.get(mesa);
		}
		catch(IndexOutOfBoundsException e) {
			throw new ClienteInexistenteException(mesa);
		}
		if (!cliente.removerPedido(item)) {
			throw new PedidoInexistenteException(cliente, item);
		}
		cliente.removerPedido(item);
	}
	
	//metodo registrar pagamento cliente                 3º lança uma exceção ClienteInexistenteException
	
	public double computarPagamentoCliente(int mesa) throws ClienteInexistenteException {
		Cliente cliente = null;
		try {
		cliente = this.clientes.get(mesa);
		
		}
		catch (IndexOutOfBoundsException e) {
			throw new ClienteInexistenteException(mesa);
		}
		return cliente.getConta();
	}
	
	// metodo para receber pagamento cliente
	
	public void receberPagamentoCliente(int mesa, double pagamento) throws ClienteInexistenteException, PagamentoInvalidoException {
		double valorDaConta = computarPagamentoCliente(mesa);
		if (pagamento >= valorDaConta) {
			this.clientes.remove(mesa);
			mesa--;
			ajustarMesa(mesa);
		}
		else {
			throw new PagamentoInvalidoException(mesa, pagamento, valorDaConta);
		}
		
	}
	
	// metodo auxiliar para ajustar mesas
	
	private void ajustarMesa(int mesa) {
		while (mesa < this.mesa) {
			
			Cliente clienteQueSaiu = this.clientes.get(mesa);
			int mesaAtual = clienteQueSaiu.getMesa();
			mesaAtual--;
			clienteQueSaiu.setMesa(mesaAtual);
			mesa++;
		}
	}
	
	

}
