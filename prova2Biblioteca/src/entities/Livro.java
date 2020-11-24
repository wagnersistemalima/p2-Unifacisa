package entities;

public class Livro {
	
	// atributos basico
	
	private String titulo;
	private String autor;
	private Data publicacao;
	private int diasEmprestimo;
	private boolean emprestado;
	
	// construtor
	
	public Livro(String titulo, String autor, Data publicacao) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.publicacao = publicacao;
		this.emprestado = false;
	}
	
	// Getters & setters

	public void setDiasEmprestimo(int diasEmprestimo) {
		this.diasEmprestimo = diasEmprestimo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Data getPublicacao() {
		return publicacao;
	}

	public int getDiasEmprestimo() {
		return diasEmprestimo;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", publicacao=" + publicacao + ", diasEmprestimo="
				+ diasEmprestimo + ", emprestado=" + emprestado + "]";
	}
	
	

}
