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
		return quantidaDeMusicas;
	}

	public void setQuantidaDeMusicas(Integer quantidaDeMusicas) {
		this.quantidaDeMusicas = quantidaDeMusicas;
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

	public void removeMusic(String nome) {
		// 
	}

	@Override
	public String toString() {
		return "Spotify [playList=" + Arrays.toString(musicas) + "]";
	}
	
	
	

}
