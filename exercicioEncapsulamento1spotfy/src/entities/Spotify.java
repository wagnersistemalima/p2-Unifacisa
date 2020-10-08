package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Spotify{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Musica[] musicas;
	private Integer quantidaDeMusicas;
	
	public Spotify() {
		this(10);
	}

	public Spotify(int quantidade) {
		this.musicas = new Musica[quantidade];
		this.quantidaDeMusicas = 0;
	}
	
	// contar a quantidade de musicas
	public Integer getQuantidaDeMusicas() {
		int contador = 0;
		for (int i=0; i<quantidaDeMusicas; i++) {
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
	
	
	// pesquisar artistas
	public Musica[] listarArtista(String artista) {
		if (getQuantidaDeMusicas() > 0) {
			// array auxiliar, para armezenar musicas por artista
			Musica[] musicasDoArtista = new Musica[getQuantidaDeMusicas()];
			int i=0;
			for (Musica p: this.musicas) {
				if (p != null && p.getArtista().equals(artista)) {
					musicasDoArtista[i] = p;
					i++;
				}
			}
			return musicasDoArtista;
		}
		else {
			return null;
		}
		
	}
	
	// pesquisar musicas por ano lançamento
	public Musica[] listarPorAnoLancamento(String diaMesAno) throws ParseException {
		if (getQuantidaDeMusicas() > 0) {
			Musica[] listarAno = new Musica[getQuantidaDeMusicas()];
			int i=0;
			for (Musica p: musicas) {
				if (p != null && p.getAnoLancamento().equals(sdf.parseObject(diaMesAno))) {
					listarAno[i] = p;
					i++;
				}
			}
			return listarAno;
		}
		else {
			return null;
		}
	}

}
