package entities.sistemarestaurante.exception;

public class PagamentoInvalidoException extends Exception{

	// objeto � transformado em uma sequ�ncia de bytes e � �til quando precisamos enviar objetos pela rede,
	// salvar no disco, ou comunicar de uma JVM com outra.
	
	private static final long serialVersionUID = 1L;
	
	// construtor passando uma mensagem representativa
	
	public PagamentoInvalidoException(int mesa, double pagamento, double valorDaConta) {
		super("O cliente da mesa " + mesa + ", pagou a quantia " + pagamento +
				" mas o valor da conta � " + valorDaConta);
	}

}
