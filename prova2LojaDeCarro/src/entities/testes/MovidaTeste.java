package entities.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Carro;
import entities.Data;
import entities.Locadora;
import entities.Movida;
import entities.exceptions.CarroAlugadoException;

public class MovidaTeste {
	
	
	 private Locadora carros;
	

	// execulta sempre antes de cada função
	
	@Before
	public void setUp() {
		
		carros = new Movida();
		
	}
	
	// fazer aluguel de carro ainda não alugado

	@Test
	public void testeAlugarCarro() throws CarroAlugadoException  {
		
		carros.adicionarCarro("Palio", "Fiat", 2019, 50.0);
		carros.adicionarCarro("Corsa", "Chevrollet", 2020, 55.0);
		carros.adicionarCarro("Sandero", "Renault", 2018, 60.0);
		
		assertEquals(60.5, carros.alugarCarro(new Carro("Corsa", "Chevrollet", 2020, 55.0), new Data(5, 10), new Data(6, 10)), 0.001);

	}
	
	// fazer aluguel de carro ja alugado
	
	
	@Test(expected = CarroAlugadoException.class)
	public void testeAlugarCarroJaAlugado() throws CarroAlugadoException  {
		
		carros.adicionarCarro("Palio", "Fiat", 2019, 50.0);
		carros.adicionarCarro("Corsa", "Chevrollet", 2020, 55.0);
		carros.adicionarCarro("Sandero", "Renault", 2018, 60.0);
		
		carros.alugarCarro(new Carro("Sandero", "Renault", 2018, 60.0), new Data(5, 10), new Data(6, 11));
		carros.alugarCarro(new Carro("Sandero", "Renault", 2018, 60.0), new Data(5, 10), new Data(6, 11));
		
	}

}
