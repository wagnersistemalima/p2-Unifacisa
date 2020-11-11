package entities;

import java.util.ArrayList;
import java.util.List;

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
	
	public void adicionarCliente() {
		Cliente cliente = new Cliente(mesa);
		this.clientes.add(cliente);
		mesa ++;
	}
	
	// metodo para adicionar um pedido
	
	public void adicionarPedido(int mesa, Item item) {
		Cliente cliente = new Cliente(mesa);
		cliente.adicionarPedido(item);
	}
	
	// metodo para remover um pedido
	
	public void removerPedido(int mesa, Item item) {
		Cliente cliente = new Cliente(mesa);
		cliente.removerPedido(item);
	}
	
	//metodo registrar pagamento cliente
	
	public double computarPagamentoCliente(int mesa) {
		Cliente cliente = new Cliente(mesa);
		return cliente.getConta();
	}
	
	// metodo para receber pagamento cliente
	
	public void receberPagamentoCliente(int mesa, double pagamento) {
		double valorDaConta = computarPagamentoCliente(mesa);
		if (pagamento >= valorDaConta) {
			this.clientes.remove(mesa);
			mesa--;
			ajustarMesa(mesa);
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
