package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ifood {
	
	// atributos basicos
	
	private List<Pedido> pedidos;
	
	// construtor
	
	public Ifood() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	// getters

	public List<Pedido> getPedido() {
		return pedidos;
	}
	
	// Funções para solicitar comida, que adiciona solicitação de comida  ao sistema do iFood
	
	public void solicitarComida(Pedido p) {
		this.pedidos.add(p);
	}
	
	public void solicitarComida(Data dataPedido, String cliente, String comida, double precoComida, double km) {
		Pedido pedido = new Pedido(dataPedido, cliente, comida, precoComida, km);
		this.pedidos.add(pedido);
	}
	
	// Função para retornar quantidade de comidas solicitadas no iFood
	
	public int getQuantidadePedidos() {
		return pedidos.size();
	}
	
	// Função que retorne todos os pedidos realizados por um mesmo cliente
	
	public List<Pedido> getPedidosCliente(String cliente) {
		List<Pedido> listaAuxiliar = new ArrayList<Pedido>();
		boolean status = false;
		for (Pedido pedido: this.pedidos) {
			if (pedido.getCliente().contentEquals(cliente)) {
				listaAuxiliar.add(pedido);
				status = true;
			}
		}
		if (!status) {
			return null;
		}
		return listaAuxiliar;
	}

	// Função que retorne o custo agregado dos pedidos de um determinado cliente:
	
	public double getCustoPedidos(String cliente) {
		double custoAgregado = 0.0;
		for (Pedido pedido: this.pedidos) {
			if (pedido.getCliente().contentEquals(cliente)) {
				custoAgregado += pedido.getCustoPedido();
			}
		}
		return custoAgregado;
	}
	
	// Função que remova o pedido mais antigo de um determinado cliente
	
	
	public Pedido removePedidoMaisAntigo(String cliente) {
		Iterator<Pedido> iterator = this.pedidos.iterator();
		Pedido pedidoMaisAntigo = descobrirPedidoMaisAntigo(cliente);
		boolean status = false;
		Pedido pedidoRemovido = null;
		while (iterator.hasNext()) {
			Pedido pedido1 = iterator.next();
			if (pedido1.getCliente().equals(pedidoMaisAntigo.getCliente()) &&
					 pedido1.getData().getAno() == pedidoMaisAntigo.getData().getAno() && 
					 pedido1.getData().getMes() == pedidoMaisAntigo.getData().getMes() && 
					 pedido1.getData().getDia() == pedidoMaisAntigo.getData().getDia()) {
				pedidoRemovido = pedido1;
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			return null;
		}
		return pedidoRemovido;
		
	}
	
	
	// função auxiliar para descobrir o pedido mais antigo
	
	private Pedido descobrirPedidoMaisAntigo(String cliente) {
		Pedido pedidoComparador = new Pedido(new Data(Short.MAX_VALUE, Short.MAX_VALUE, Short.MAX_VALUE), "Joao", "Feijoada", 2.0, 10);
		boolean status = false;
		for (Pedido pedido: this.pedidos) {
			if (pedido.getCliente().equals(cliente)) {
				if (pedido.getData().getAno() < pedidoComparador.getData().getAno() &&
						pedido.getData().getMes() < pedidoComparador.getData().getMes() &&
						 pedido.getData().getDia() < pedidoComparador.getData().getDia()) {
					pedidoComparador = pedido;
					status = true;
				}
			}
		}
		if (!status) {
			return null;
		}
		return pedidoComparador;	
	}	

}
