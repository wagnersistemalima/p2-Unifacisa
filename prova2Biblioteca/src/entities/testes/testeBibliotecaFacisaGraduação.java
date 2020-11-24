package entities.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.BibliotecaFacisa;
import entities.BibliotecaFacisaGraduacao;
import entities.Data;
import entities.Livro;
import entities.exceptions.LivroEmprestadoException;
import entities.exceptions.LivroInexistenteException;

public class testeBibliotecaFacisaGraduação {
	
	private BibliotecaFacisa biblioteca;
	
	
	@Before
	public void setUp() {
		biblioteca = new BibliotecaFacisaGraduacao();
	}

	@Test
	public void testAdicionarLivro() {
		
		assertEquals(0, biblioteca.getLivros().size());

		biblioteca.adicionarLivro("Onda do mar", "Antonio", new Data(2, 10));
		biblioteca.adicionarLivro("Onda do vento", "Maria", new Data(5, 11));
		biblioteca.adicionarLivro("Onda da terra", "Joao", new Data(10, 12));

		assertEquals(3, biblioteca.getLivros().size());
		
	}
	
	@Test
	public void testListarLivro() {
		
		assertEquals(0, biblioteca.getLivros().size());

		biblioteca.adicionarLivro("Onda do mar", "Antonio", new Data(2, 10));
		biblioteca.adicionarLivro("Onda do vento", "Maria", new Data(5, 11));
		biblioteca.adicionarLivro("Onda da terra", "Joao", new Data(10, 12));
		
		assertEquals(1, biblioteca.listarLivrosDoAutor("Antonio").size());
		
	}
	
	// remover livro existente
	
	@Test(expected = LivroInexistenteException.class)
	public void testRemoverLivroExistente() throws LivroInexistenteException {
		
		biblioteca.adicionarLivro("Onda do mar", "Antonio", new Data(2, 10));
		biblioteca.adicionarLivro("Onda do vento", "Maria", new Data(5, 11));
		biblioteca.adicionarLivro("Onda da terra", "Joao", new Data(10, 12));
		
		biblioteca.removerLivro("Onda da terra", "Joao", new Data(10, 12));
		
		assertEquals(2, biblioteca.getLivros().size());
		
	}
	
	
	// remover livro inexistente 
	
	@Test(expected = LivroInexistenteException.class)
	public void testRemoverLivroIxistente() throws LivroInexistenteException {
		
		biblioteca.adicionarLivro("Onda do mar", "Antonio", new Data(2, 10));
		biblioteca.adicionarLivro("Onda do vento", "Maria", new Data(5, 11));
		biblioteca.adicionarLivro("Onda da terra", "Joao", new Data(10, 12));
		
		biblioteca.removerLivro("Onda do sol", "Carlos", new Data(2, 10));
		
		assertEquals(3, biblioteca.getLivros().size());
		
	}
	
	// testar fazer emprestimo livro
	
	@Test
	public void testFazerEmprestimo() throws LivroEmprestadoException {
		
		biblioteca.adicionarLivro("Onda do mar", "Antonio", new Data(2, 10));
		biblioteca.adicionarLivro("Onda do vento", "Maria", new Data(5, 11));
		biblioteca.adicionarLivro("Onda da terra", "Joao", new Data(10, 12));
		
		
		
		assertEquals(2.0, biblioteca.fazerEmprestimo(new Livro("Onda do mar", "Antonio", new Data(2, 10)), 2), 0.001);
		assertEquals(10.0, biblioteca.fazerEmprestimo(new Livro("Onda do mar", "Antonio", new Data(2, 10)), 10), 0.001);
		assertEquals(15.0, biblioteca.fazerEmprestimo(new Livro("Onda do mar", "Antonio", new Data(2, 10)), 15), 0.001);
		
	}

}
