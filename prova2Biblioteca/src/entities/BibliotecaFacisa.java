package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.exceptions.LivroInexistenteException;
import interfaces.Biblioteca;

public abstract class BibliotecaFacisa implements Biblioteca{
	
	protected List<Livro> livros;
	
	// construtor
	
	public BibliotecaFacisa() {
		livros = new ArrayList<Livro>();
	}
	
	
	// metodo adicionar livro
	
	@Override
	public void adicionarLivro(String titulo, String autor, Data data) {
		Livro livro = new Livro(titulo, autor, data);
		livros.add(livro);
		
	}
	
	// metodo listar livros por autor
	
	@Override
	public List<Livro> listarLivrosDoAutor(String autor) {
		List<Livro> listaAuxiliar = new ArrayList<Livro>();
		for (Livro livro: livros) {
			if (livro.getAutor().equals(autor)) {
				listaAuxiliar.add(livro);
			}
		}
		return listaAuxiliar;
		
	}
	
	public void removerLivro(String titulo, String autor, Data data) throws LivroInexistenteException {
		Iterator<Livro> iterator = this.livros.iterator();
		boolean status = false;
		while (iterator.hasNext()) {
			Livro livro = iterator.next();
			if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor) && livro.getPublicacao() == data) {
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			throw new LivroInexistenteException(titulo, autor, data);
		}
	}
	
	// getters


	public List<Livro> getLivros() {
		return livros;
	}
	
	

}
