package entities;

public class Lutador {
	
	protected String nome;
	protected Integer vida;
	
	public Lutador() {
		
	}

	public Lutador(String nome) {
		super();
		this.nome = nome;
		this.vida = 100;
	}

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
	public void socar() {
		
	}

}
