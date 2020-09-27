package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Musica;
import entities.Spotify;
import entities.enums.Genero;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Spotify playList = new Spotify(5);
		// adicionar musicas
		playList.addMusic(new Musica("sou cachorro", "antonio louro", "era voce", Genero.FORRO, sdf.parse("01/01/2020"), 3.0, 1));
		playList.addMusic(new Musica("sou gato", "antonio moreno", "era eu", Genero.CLASSICO, sdf.parse("02/02/2020"), 3.0, 1));
		playList.addMusic(new Musica("sou leao", "antonio cabeleira", "era tu", Genero.FORRO, sdf.parse("01/08/2004"), 4.0, 1));
		
		// mostrar playList
		for (Musica play: playList.getMusicas()) {
			System.out.println(play);
			System.out.println("---------------------------------------");
		}
		
		// contar a quantidade de musica na playList
		System.out.println("Quantidade de musicas na playList: " + playList.getQuantidaDeMusicas() + " musicas");
		System.out.println("###############################################");
		
		// remover musica
		playList.removeMusic("sou cachorro");
		
		// mostrar playList
				for (Musica play: playList.getMusicas()) {
					System.out.println(play);
					System.out.println("---------------------------------------");
				}
		
		
		System.out.println("Quantidade de musicas na playList: " + playList.getQuantidaDeMusicas() + " musicas");
		System.out.println("###############################################");
		
		// listar musica por artista
		Musica[] artista = playList.listarArtista("antonio cabeleira");
		
		for (Musica play: artista) {
			System.out.println(play);
		}
		System.out.println("-----------------------------------------------");
		// listar musica por diaMesAno
		Musica[] diaMesAno = playList.listarPorAnoLancamento("02/02/2020");
		
		for (Musica play: diaMesAno) {
			System.out.println(play);
		}
		
	}


}
