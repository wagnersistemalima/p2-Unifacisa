package entities.exceptions;

public class AniversarianteNaoEncontradoException extends Exception{

	// trasforma o objeto em bytes
	
	private static final long serialVersionUID = 1L;
	
	public AniversarianteNaoEncontradoException(String nome) {
		super("O aniversariante de nome " + nome + " não está na lista");
	}

}
