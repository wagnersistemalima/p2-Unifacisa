package entities.exceptions;

public class AutorInexistenteException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public AutorInexistenteException(String autor) {
		super("O autor " + autor + " não produzio series");
	}

}
