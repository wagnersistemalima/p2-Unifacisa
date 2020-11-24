package entities;

import entities.exceptions.LivroEmprestadoException;

public class BibliotecaFacisaPosGraduacao extends BibliotecaFacisa{

	@Override
	public double fazerEmprestimo(Livro livro, int diasEmprestimo) throws LivroEmprestadoException {
		
		for (Livro book: super.getLivros()) {
			if (book.getTitulo().equals(livro.getTitulo()) && book.getAutor().equals(livro.getAutor()) && book.getPublicacao() == livro.getPublicacao()) {
				if (livro.isEmprestado()) {
					throw new LivroEmprestadoException(livro);
				}
				else {
					livro.setEmprestado(true);
				}
			}
		}
		
		livro.setDiasEmprestimo(diasEmprestimo);
		return livro.getDiasEmprestimo() * 2;
		
	}

}
