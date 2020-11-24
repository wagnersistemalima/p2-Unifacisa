package entities.exceptions;

import entities.Livro;

public class LivroEmprestadoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public LivroEmprestadoException(Livro livro) {
		super("O livro " + livro.toString() + " já está emprestado!");
	}

}
