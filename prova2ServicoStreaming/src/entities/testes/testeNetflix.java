package entities.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Data;
import entities.Netflix;
import entities.StreamingSerie;
import entities.exceptions.AutorInexistenteException;
import entities.exceptions.SerieInexistenteException;

public class testeNetflix {

	private StreamingSerie streamingSerie;

	@Before
	public void setUp() {
		streamingSerie = new Netflix();
	}

	@Test
	public void testAdicionarSeries() {

		assertEquals(0, streamingSerie.getSeries().size());

		streamingSerie.adicionarSerie("Game of Thrones", "George R. R. Martin", new Data(17, 4, 2011), 50.0);
		streamingSerie.adicionarSerie("Narcos", "José Padilha", new Data(5, 11, 2015), 55.0);
		streamingSerie.adicionarSerie("Cobra Kai", "Jon Hurwitz", new Data(9, 7, 2020), 60.0);
		
		assertEquals(3, streamingSerie.getSeries().size());

	}

	// listar serie

	@Test
	public void testListarSeries() {

		assertEquals(0, streamingSerie.getSeries().size());

		streamingSerie.adicionarSerie("Game of Thrones", "George R. R. Martin", new Data(17, 4, 2011), 50.0);
		streamingSerie.adicionarSerie("Narcos", "José Padilha", new Data(5, 11, 2015), 55.0);
		streamingSerie.adicionarSerie("Cobra Kai", "Jon Hurwitz", new Data(9, 7, 2020), 60.0);

		assertEquals(1, streamingSerie.listarSeriesDoAutor("George R. R. Martin").size());
	}
	
	// remover serie existente
	
	@Test
	public void testRemoverSerieExistente() throws AutorInexistenteException {
		
		streamingSerie.adicionarSerie("Game of Thrones", "George R. R. Martin", new Data(17, 4, 2011), 50.0);
		streamingSerie.adicionarSerie("Narcos", "José Padilha", new Data(5, 11, 2015), 55.0);
		streamingSerie.adicionarSerie("Cobra Kai", "Jon Hurwitz", new Data(9, 7, 2020), 60.0);
		
		assertEquals(3, streamingSerie.getSeries().size());
		
		streamingSerie.removerSeriesDoAutor("Jon Hurwitz");
		
		assertEquals(2, streamingSerie.getSeries().size());
		
	}
	
	// remover serie inexistente
	
	@Test(expected = AutorInexistenteException.class)
	public void testeRemoverSerieInexistente() throws AutorInexistenteException {
		
		streamingSerie.adicionarSerie("Game of Thrones", "George R. R. Martin", new Data(17, 4, 2011), 50.0);
		streamingSerie.adicionarSerie("Narcos", "José Padilha", new Data(5, 11, 2015), 55.0);
		streamingSerie.adicionarSerie("Cobra Kai", "Jon Hurwitz", new Data(9, 7, 2020), 60.0);
		
		streamingSerie.removerSeriesDoAutor("Tiringa");
		
		assertEquals(3, streamingSerie.getSeries().size());
		
		
	}
	
	@Test
	public void testeAlugarSerie() throws SerieInexistenteException {
		
		streamingSerie.adicionarSerie("Game of Thrones", "George R. R. Martin", new Data(17, 4, 2011), 50.0);
		streamingSerie.adicionarSerie("Narcos", "José Padilha", new Data(5, 11, 2015), 55.0);
		streamingSerie.adicionarSerie("Cobra Kai", "Jon Hurwitz", new Data(9, 7, 2020), 60.0);
		
		assertEquals(44, streamingSerie.alugarSerie("Narcos", "José Padilha"), 0.001);
		
	}

}
