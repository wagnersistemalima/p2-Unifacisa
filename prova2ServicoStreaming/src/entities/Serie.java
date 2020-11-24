package entities;

public class Serie {
	
	private String nome;
	private String autor;
	private Data lancamento;
	private double custoOnDemand;
	
	
	public Serie(String nome, String autor, Data lancamento, double custoOnDemand) {
		
		this.nome = nome;
		this.autor = autor;
		this.lancamento = lancamento;
		this.custoOnDemand = custoOnDemand;
	}


	public String getNome() {
		return nome;
	}


	public String getAutor() {
		return autor;
	}


	public Data getLancamento() {
		return lancamento;
	}


	public double getCustoOnDemand() {
		return custoOnDemand;
	}


	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", autor=" + autor + ", lancamento=" + lancamento + ", custoOnDemand="
				+ custoOnDemand + "]";
	}
	
	

}
