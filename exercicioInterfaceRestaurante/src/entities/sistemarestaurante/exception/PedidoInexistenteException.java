package entities.sistemarestaurante.exception;

import entities.Cliente;
import interfaces.Item;

public class PedidoInexistenteException extends Exception{

	// objeto é transformado em uma sequência de bytes e é útil quando precisamos enviar objetos pela rede,
	// salvar no disco, ou comunicar de uma JVM com outra.
	
	private static final long serialVersionUID = 1L;
	
	// construtor passando uma mensagem representativa
	
	public PedidoInexistenteException(Cliente cliente , Item item) {
		super("O cliente da mesa " + cliente.getMesa() + " não havia solicitado o item " + item.toString() + "!");
	}

}
