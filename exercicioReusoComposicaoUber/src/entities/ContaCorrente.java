package entities;

public class ContaCorrente {
	
	private String nome;
	private String cpf;
	private String senha;
	private Double saldo;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = "1234";
		this.saldo = 500.0;
	}

	public ContaCorrente(String nome, String cpf, String senha, Double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
	// metodo depositar
	public void deposito(double valor) {
		saldo += valor;
	}
	
	// metodo saque
	public double saque(double valor) {
		if (validacaoSaque(valor)) {
			saldo -= valor;
			return valor;
		}
		return 0.0;
	}
	
	// metodo para auxiliar a validação para saque
	private boolean validacaoSaque(double valor) {
		if (valor > 0.0 && valor <= saldo) {
			return true;
		}
		return false;
	}
	
	// metodo para transferir valores entre contas
	public boolean trasferencia(ContaCorrente conta, double valor) {
		double numero = saque(valor);
		if (numero > 0.0) {
			conta.deposito(valor);
			return true;
		}
		return false;
	}
	
	

}
