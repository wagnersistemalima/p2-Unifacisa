package application;

import java.util.Locale;

import entities.Altomovel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Loja de carros Lima CG");
		System.out.println("-------------------------");
		
		Altomovel opcao1 = new Altomovel("Palio", "Fiat", "azul", 2, 35000.0);
		opcao1.calculaPreco();
		Altomovel opcao2 = new Altomovel("Palio", "Fiat", "prateado", 2, false, false, false, false, 35000.0);
		opcao2.calculaPreco();
		Altomovel opcao3 = new Altomovel("Civic", "Honda", "amarelo", 4, true, true, true, true, 110000.0);
		opcao3.calculaPreco();
		Altomovel opcao4 = new Altomovel("Corolla", "Toyota", "preto", 4, true, true, false, true, 55000.0);
		opcao4.calculaPreco();
		Altomovel opcao5 = new Altomovel("Gol", "Volkswagen", "chumbo", 4, true, true, true, true, 55000.0);
		opcao5.calculaPreco();
		
		
		System.out.println(opcao1 + " basico");
		System.out.println();
		System.out.println(opcao2 + " com cor personalizada");
		System.out.println();
		System.out.println(opcao3 + " completo com cor personalizada");
		System.out.println();
		System.out.println(opcao4 + " com vidro, direção e ar");
		System.out.println();
		System.out.println(opcao5 + " completo com cor personalizada");
		
	}

}
