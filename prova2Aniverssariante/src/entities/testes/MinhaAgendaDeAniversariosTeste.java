package entities.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.MinhaAgendaDeAniversarios;
import entities.exceptions.AniversarianteNaoEncontradoException;

public class MinhaAgendaDeAniversariosTeste {
	
	
	private MinhaAgendaDeAniversarios agenda;
	
	@Before
	public void setUp() {
		agenda = new MinhaAgendaDeAniversarios();
	}
	
	// teste adicionar

	@Test
	public void testAdicionarAniversariante() {
		
		assertEquals(0, agenda.getAniversariantes().size());
		
		agenda.adicionarAniverssariante("Joao", 10, 8);
		agenda.adicionarAniverssariante("Maria", 5, 12);
		agenda.adicionarAniverssariante("Pedro", 8, 2);
		
		assertEquals(3, agenda.getAniversariantes().size());
	}
	
	// teste obter aniversariante
	
	@Test
	public void testObterAniversariante() {
		
		agenda.adicionarAniverssariante("Joao", 10, 8);
		agenda.adicionarAniverssariante("Maria", 5, 12);
		agenda.adicionarAniverssariante("Pedro", 8, 2);
		
		assertEquals(1, agenda.obterAniversariantesDoMes(8).size());
		
	}
	
	// remover aniversariante existente
	
	@Test
	public void testRemoverAniversariante() throws AniversarianteNaoEncontradoException {
		
		agenda.adicionarAniverssariante("Joao", 10, 8);
		agenda.adicionarAniverssariante("Maria", 5, 12);
		agenda.adicionarAniverssariante("Pedro", 8, 2);
		
		agenda.removerAniversariante("Joao");
		
		assertEquals(2, agenda.getAniversariantes().size());
		
	}
	
	// remover aniversariantes inexistente
	
	@Test(expected = AniversarianteNaoEncontradoException.class)
	public void testRemoverAniversarianteInexistente() throws AniversarianteNaoEncontradoException {
		
		agenda.adicionarAniverssariante("Joao", 10, 8);
		agenda.adicionarAniverssariante("Maria", 5, 12);
		agenda.adicionarAniverssariante("Pedro", 8, 2);
		
		agenda.removerAniversariante("Luan");
		
	}

}
