package entities.exceptions;

public class CarroInexistenteException extends Exception{

	// objeto � transformado em uma sequ�ncia de bytes e � �til quando precisamos enviar objetos pela rede,
	// salvar no disco, ou comunicar de uma JVM com outra.
	
	
	private static final long serialVersionUID = 1L;
	
	public CarroInexistenteException(String modelo, String marca, int ano) {
		super("O carro de modelo " + modelo + " e da marca " + marca + " do ano " + ano + " n�o existe!");
	}
	
	

}
