package entities;

// super classe lutador

public class Lutador {
	
	// atributos basicos
	
	protected String nome;
	protected Integer vida;
	
	// construtor padrão
	
	public Lutador() {
		
	}
	
	// construtor com argumentos

	public Lutador(String nome) {

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
	
	public void socar(Lutador adversario) {
		if (adversario != null) {
			adversario.vida -= 7;
		}
	}
	
	// metodo chutar
	
	public void chutar(Lutador adversario) {
		if (adversario != null) {
			adversario.vida -= 5;
		}
	}
	
	// metodo atirar
	
	public void atirar(Lutador adversario) {
		if (adversario != null) {
			adversario.vida -= 10;
		}
	}
	
	// metodo lançar magia
	
	public void magia(Lutador adversario) {
		if (adversario != null) {
			adversario.vida -= 12;
		}
	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", vida=" + vida + "]";
	}
	
	

}
