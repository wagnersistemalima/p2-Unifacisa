package entities.exceptions;

public class CarroInexistenteException extends Exception{
	
	// transforma o objeto em bytes para melhor trafegar
	
	private static final long serialVersionUID = 1L;
	
	public CarroInexistenteException(String modelo, String marca, int ano) {
		super("O carro de modelo " + modelo + ", da marca " + marca + ", e ano " + ano + ", não existe!");
	}

}
