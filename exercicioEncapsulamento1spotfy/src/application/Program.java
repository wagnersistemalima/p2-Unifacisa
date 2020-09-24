package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Musica;
import entities.Spotify;
import entities.enums.Genero;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Musica musica1 = new Musica("Levanta saia", "Antonio louro", "Vem dançar...",Genero.FORRO,sdf.parse("01/01/1970"), 3.0, 1);
		Musica musica2 = new Musica("Cabrueira", "Zezinho da carne de charque", "To largado as traças", Genero.FORRO, 
				sdf.parse("05/02/2020"), 4.0, 1);
		Musica musica3 = new Musica("Truta imbativel", "Neguinho da quebrada", "Odio e ganancia", Genero.FUNK, 
				sdf.parse("09/08/2019"), 2.0, 1);
		
		Spotify lista = new Spotify();
		lista.addMusic(musica1);
		lista.addMusic(musica2);
		lista.addMusic(musica3);
		
		
		
		
		
		
		
		
	}


}
