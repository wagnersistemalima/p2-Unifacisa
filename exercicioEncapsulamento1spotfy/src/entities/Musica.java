package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.Genero;

public class Musica {
	// definir o formato para a conversao entre date e string, mascara/  dia/mes/ano
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String artista;
	private String letra;
	private Genero genero;
	private Date anoLancamento;
	private Double duracao;
	private Integer numeroDeVezesProduzida;
	
	
	public Musica() {
		
	}

	public Musica(String nome, String artista, String letra, Genero genero, Date anoLancamento, Double duracao,
			Integer numeroDeVezesProduzida) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.numeroDeVezesProduzida = numeroDeVezesProduzida;
	}



	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}

	public String getLetra() {
		return letra;
	}

	public Genero getGenero() {
		return genero;
	}

	public Date getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Double getDuracao() {
		return duracao;
	}

	public Integer getNumeroDeVezesProduzida() {
		return numeroDeVezesProduzida;
	}
	
	public void playMusic() {
		this.numeroDeVezesProduzida++;
	}

	@Override
	public String toString() {
		return "Musica: "
			 + nome
			 + "\n"
			 + "Artista: "
			 + artista
			 + "\n"
			 + "Letra: "
			 + letra
			 + "\n"
			 + "Ano de lançamento: "
			 + sdf.format(anoLancamento)
		     + "\n"
		     + "Duração: "
		     + duracao
		     + " minutos\n"
		     + "Numero de vezes produzida: "
		     + numeroDeVezesProduzida; 
			 
	}
	
	
	
	

}
