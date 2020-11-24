package entities.exceptions;

import entities.Data;

public class LivroInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public LivroInexistenteException(String titulo, String autor, Data data) {
		
		super("O livro do titulo " + titulo + ", e autor " + autor + " e publicação " + data + " não existe!");
		
	}

}
