package entities;

public class Animal {
	
	private String nome;
	private Integer idade;
	
	public Animal() {
		
	}

	public Animal(String nome) {
		super();
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	// metodo emitir som
	public void emitirSom() {
		System.out.println("Animal emitindo som -> ");
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + "]";
	}
	
	

}
