package entities.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Data;
import entities.Ifood;

public class TesteIfood {
	
	Ifood ifood = new Ifood();
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void testSolicitar() {
		
		
		assertEquals(0, ifood.getPedido().size());
		
		ifood.solicitarComida(new Data(2, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(5, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(7, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(9, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(30, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		
		assertEquals(5, ifood.getPedido().size());
		
		
	}
	
	@Test
	public void testRemoverPedidoMaisAntigo() {
		
		
		ifood.solicitarComida(new Data(2, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(5, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(7, 8, 2020), "Pedro", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(9, 8, 2020), "Maria", "Arrumadinho", 3.0, 5);
		ifood.solicitarComida(new Data(30, 8, 2020), "Carlos", "Arrumadinho", 3.0, 5);
		
		ifood.removePedidoMaisAntigo("Carlos");
		
		assertEquals(4, ifood.getPedido().size());
		
		
	}

}
