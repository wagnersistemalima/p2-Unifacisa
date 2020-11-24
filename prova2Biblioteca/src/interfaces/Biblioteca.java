package interfaces;

import java.util.List;

import entities.Data;
import entities.Livro;
import entities.exceptions.LivroEmprestadoException;
import entities.exceptions.LivroInexistenteException;

public interface Biblioteca {
	
	public void adicionarLivro(String titulo, String autor, Data data);
	
	public List<Livro> listarLivrosDoAutor(String autor);
	
	public void removerLivro(String titulo, String autor, Data data) throws LivroInexistenteException;
	
	public double fazerEmprestimo(Livro livro, int diasEmprestimo) throws LivroEmprestadoException;

}
