package entities;

public class Lutador {
	
	// atributos basicos
	
	protected String nome;
	protected Integer vida;
	
	// construtor padrão
	
	public Lutador() {
		
	}
	
	// construtor com argumentos

	public Lutador(String nome) {
		super();
		this.nome = nome;
		this.vida = 100;
	}
	
	// Getters & setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
	// metodo socar
	
	public void socar(Lutador lutador1) {
		if (lutador1 != null) {
			lutador1.vida -= 7;
		}
	}
	
	// metodo chutar
	
	public void chutar(Lutador lutador1) {
		if (lutador1 != null) {
			lutador1.vida -= 5;
		}
	}
	
	// metodo atirar
	
	public void atirar(Lutador lutador1) {
		if (lutador1 != null) {
			lutador1.vida -= 10;
		}
	}
	
	// metodo lançar magia
	
	public void magia(Lutador lutador1) {
		if (lutador1 != null) {
			lutador1.vida -= 12;
		}
	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", vida=" + vida + "]";
	}
	
	

}
