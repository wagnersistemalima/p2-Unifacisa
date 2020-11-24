package application;

import entities.Bebida;
import entities.Refeicao;
import entities.SistemaRestaurante;
import entities.enums.Carboidrato;
import entities.enums.Proteina;
import entities.enums.SaborBebida;
import entities.enums.Tamanho;
import entities.sistemarestaurante.exception.ClienteInexistenteException;
import entities.sistemarestaurante.exception.PedidoInexistenteException;

public class Program {

	public static void main(String[] args) {

		System.out.println("Sistema restaurante abriu!");

		// criar um sistema de restaurante

		SistemaRestaurante sistemaRestaurante = new SistemaRestaurante();

		// clientes acabaram de chegar no restaurante

		sistemaRestaurante.adicionarCliente("Antonio pe de guenga");
		sistemaRestaurante.adicionarCliente("Maria boca de fogo");
		sistemaRestaurante.adicionarCliente("Luiz da carne de charque");
		sistemaRestaurante.adicionarCliente("Renata lingua de lixa");
		sistemaRestaurante.adicionarCliente("Leila do cabare do crato");

		// adicicionando os pedidos dos clientes nas mesas

		try {
			sistemaRestaurante.adicionarPedido(0, new Bebida(SaborBebida.CERVEJA, Tamanho.GRANDE));
		} catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}

		// ---------------------------------------------------------------------------------------------------

		try {
			sistemaRestaurante.adicionarPedido(1, new Bebida(SaborBebida.QUARANA, Tamanho.PEQUENO));
		} catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}

		// -------------------------adicionando uma mesa que não existe------------------------------------------------------------------

		try {
			sistemaRestaurante.adicionarPedido(22, new Refeicao(Proteina.CARNE_DE_SOL, Carboidrato.ARRUMADINHO));
		} catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}

		// ----------------------------------------------------------------------------------------------------

		try {
			sistemaRestaurante.adicionarPedido(3, new Refeicao(Proteina.MAMINHA, Carboidrato.PURE));
		} catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}

		// -----------------------------------------------------------------------------------------------------

		
		try {
			sistemaRestaurante.adicionarPedido(4, new Refeicao(Proteina.LINGUICA, Carboidrato.ARROZ));
		}
		catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}
		

		// -------------------------------------------------------------------------------------------------------
		
		// removendo um pedido em mesa que não existe
		
		try {
			sistemaRestaurante.removerPedido(50, new Refeicao(Proteina.LINGUICA, Carboidrato.ARROZ));
		}
		catch (ClienteInexistenteException | PedidoInexistenteException e) {
			e.printStackTrace();
		}
		
		// removendo um pedido que não existe
		
		try {
			sistemaRestaurante.removerPedido(4, new Refeicao(Proteina.FRANGO, Carboidrato.PURE));
		}
		catch (ClienteInexistenteException | PedidoInexistenteException e) {
			e.printStackTrace();
		}
		
		// computando pagamento sem lançar exceção
		
		
	}

}
