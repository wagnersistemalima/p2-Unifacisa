package entities;

import java.util.Arrays;

public class Spotify extends Musica{
	
	private Musica[] musicas;
	private Integer quantidaDeMusicas;
	
	public Spotify() {
		this(10);
	}

	public Spotify(int quantidade) {
		this.musicas = new Musica[quantidade];
		this.quantidaDeMusicas = 0;
	}
	
	public Integer getQuantidaDeMusicas() {
		int contador = 0;
		for (int i=0; i<this.quantidaDeMusicas; i++) {
			if (musicas[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	

	public Musica[] getMusicas() {
		return musicas;
	}

	public void addMusic(Musica musica) {
		if (quantidaDeMusicas >= musicas.length) {
			Musica[] musicas2 = new Musica[2 * musicas.length];
			for (int i=0; i<musicas.length; i++) {
				musicas2[i] = musicas[i];
			}
			// lista de musicas com espaço dobrado
			this.musicas = musicas2;
		}
		musicas[quantidaDeMusicas] = musica;
		// proxima musica a ser adcionada
		quantidaDeMusicas++;
	}
	
	// remover musicas
	public void removeMusic(String nome) {
		boolean deslocarAEsquerda = false;
		for (int i=0; i<this.quantidaDeMusicas; i++) {
			if (musicas[i].getNome().equals(nome)) {
				deslocarAEsquerda = true;
			}
			if (deslocarAEsquerda) {
				this.musicas[i] = this.musicas[i+1];
			}
		}
	}

	@Override
	public String toString() {
		return "Spotify [musicas=" + Arrays.toString(musicas) + ", quantidaDeMusicas=" + quantidaDeMusicas + "]";
	}

	
	
	

}
