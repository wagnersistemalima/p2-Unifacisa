package entities.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Locadora;
import entities.Movida;
import entities.exceptions.CarroInexistenteException;

public class TesteLocadora {

	private Locadora locadora;
	
	// execulta sempre antes de cada função

	@Before
	public void setUp() {
		locadora = new Movida();

	}

	// testando o metodo adicionar carro

	@Test
	public void testAdicionar() {
		assertEquals(0, locadora.getCarros().size());

		locadora.adicionarCarro("Palio", "Fiat", 2010, 50.0);
		locadora.adicionarCarro("Corsa", "Chevrollet", 2011, 60.0);
		locadora.adicionarCarro("Gol", "volkswagen", 2017, 70.0);

		assertEquals(3, locadora.getCarros().size());

	}

	// testando o metodo listar carros

	@Test
	public void testListarCarros() {
		assertEquals(0, locadora.getCarros().size());
		
		locadora.adicionarCarro("Palio", "Fiat", 2010, 50.0);
		locadora.adicionarCarro("Corsa", "Chevrollet", 2011, 60.0);
		locadora.adicionarCarro("Gol", "volkswagen", 2017, 70.0);

		assertEquals(1, locadora.listarCarrosDaMarca("Fiat").size());

	}

	// testando metodo remover carro

	@Test
	public void testRemoverCarro() {

		locadora.adicionarCarro("Palio", "Fiat", 2010, 50.0);
		locadora.adicionarCarro("Corsa", "Chevrollet", 2011, 60.0);
		locadora.adicionarCarro("Gol", "volkswagen", 2017, 70.0);

		assertEquals(3, locadora.getCarros().size());

		try {
			locadora.removerCarro("Corsa", "Chevrollet", 2011);
		} catch (CarroInexistenteException e) {
			e.printStackTrace();
		}

		assertEquals(2, locadora.getCarros().size());

	}
	
	

}
