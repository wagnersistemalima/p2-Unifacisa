package entities.sistemarestaurante.exception;

public class ClienteInexistenteException extends Exception{
	
	// objeto é transformado em uma sequência de bytes e é útil quando precisamos enviar objetos pela rede,
	// salvar no disco, ou comunicar de uma JVM com outra.

	private static final long serialVersionUID = 1L;
	
	// construtor passando uma mensagem representativa
	
	public ClienteInexistenteException(int mesa) {
		super("O cliente da mesa " + mesa + " não exixte!");
	}

}
