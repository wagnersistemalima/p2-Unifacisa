package entities.exceptions;

public class SerieInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SerieInexistenteException(String nome, String autor) {
		super("A serie " + nome + " de autor " + autor + ", não existe!");
	}

}
