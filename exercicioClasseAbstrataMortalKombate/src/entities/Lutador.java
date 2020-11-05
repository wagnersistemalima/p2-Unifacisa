package entities;

public abstract class Lutador {
	
	// atributos basicos
	
	protected String nome;
	protected int vida;
	
	// construtor padrao
	
	public Lutador() {
		
	}
	
	// construtor com argumento

	public Lutador(String nome) {
		this.nome = nome;
		this.vida = 100;
	}
	
	// Getters & Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	// metodo socar adversario
	
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

	// metodo abstrato atirar / nem todo personagem sabe atirar

	public abstract void atirar(Lutador adversario);

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
