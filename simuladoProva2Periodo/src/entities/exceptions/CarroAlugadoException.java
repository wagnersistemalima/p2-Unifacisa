package entities.exceptions;

import entities.Carro;

public class CarroAlugadoException extends Exception{

	// objeto é transformado em uma sequência de bytes e é útil quando precisamos enviar objetos pela rede,
		// salvar no disco, ou comunicar de uma JVM com outra.
	
	
	private static final long serialVersionUID = 1L;
	
	public CarroAlugadoException(Carro carro) {
		super("O carro " + carro.toString() + " já foi alugado!");
	}

}
