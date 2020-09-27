package entities;

public class ContaCorrente {
	
	private String nome;
	private Integer numero;
	private Double limite;
	private Double saldo;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(String nome, Integer numero, Double limite) {
		if (limite < 0.0) {
			limite = 0.0;
		}
		this.nome = nome;
		this.numero = numero;
		this.limite = limite;
		this.saldo = 0.0;
	}
	
	

	public ContaCorrente(String nome, Integer numero, Double limite, Double saldo) {
		if (limite < 0.0) {
			limite = 0.0;
		}
		if (saldo < 0.0) {
			saldo = 0.0;
		}
		this.nome = nome;
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	// metodo para deposito em conta
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	// metodo para saque em conta
	public double saque(double quantia) {
		if (validacaoSaque(quantia)) {
			saldo -= quantia;
			return quantia;
		}
		else {
			return 0.0;
		}
		
	}
	
	// metodo para trasferencia entre contas
	public boolean transferir(double quantia, ContaCorrente conta) {
		double valor = saque(quantia);
		if (valor > 0.0) {
			conta.depositar(valor);
			return true;
		}
		return false;
	}
	
	// validação para retirar dinheiro em conta                 //    omitir o que deve ser omitido
	private boolean validacaoSaque(double quantia) {
		if (quantia > 0.0 && quantia <= (saldo)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Titular: "
			 + nome
			 + "\n"
			 + "Numero da conta: "
			 + numero
			 + "\n"
			 + "Limite especial: "
			 + limite
			 + "\n"
			 + "Saldo conta: "
			 + saldo;
			 
	}
	
	

}
