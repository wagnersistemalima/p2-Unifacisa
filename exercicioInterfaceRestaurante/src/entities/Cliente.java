package entities;

import java.util.ArrayList;
import java.util.List;

import interfaces.Item;

public class Cliente {
	
	// atributos basicos
	
	private int mesa;
	private String nome;
	
	// associação 
	
	private List<Item> pedidos;
	
	// construtor

	public Cliente(int mesa, String nome) {
		this.mesa = mesa;
		this.nome = nome;
		this.pedidos = new ArrayList<Item>();
	}
	
	// getters & setters

	public int getMesa() {
		return mesa;
	}
	
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	
	// metodo adicionar um pedido
	
	
	public void adicionarPedido(Item item) {
		this.pedidos.add(item);
	}
	
	// metodo remover um pedido
	
	public boolean removerPedido(Item item) {
		return this.pedidos.remove(item);
	}
	
	// metodo para mostrar total da conta do pedido
	
	public double getConta() {
		double totalDaConta = 0.0;
		for (Item p: pedidos) {
			totalDaConta += p.getPreco();
		}
		return totalDaConta;
	}

	@Override
	public String toString() {
		return "Cliente [mesa=" + mesa + ", nome=" + nome + ", pedidos=" + pedidos + "]";
	}
	
	

}
