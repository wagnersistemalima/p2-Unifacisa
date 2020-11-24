package entities.exceptions;

import entities.Carro;

public class CarroAlugadoException extends Exception{

	// trasforma o objeto em bytes
	
	private static final long serialVersionUID = 1L;
	
	public CarroAlugadoException(Carro carro) {
		super("O carro " + carro.toString() + " já foi alugado!");
	}

}
