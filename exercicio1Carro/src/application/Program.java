package application;

import java.util.Locale;

import entities.Automovel;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Loja de carros Lima CG");
		System.out.println("-------------------------");
		
//		Automovel.setPromocao(false);
//      Automovel.setPromocao(true);
		
		Automovel opcao1 = new Automovel("Palio", "Fiat", 35000.0);
		
		Automovel opcao2 = new Automovel("Palio", "Fiat", Cor.PRATEADO  ,2, false, false, false, false, 35000.0);
		
		Automovel opcao3 = new Automovel("Civic", "Honda", Cor.AMARELO, 4, true, true, true, true, 110000.0);
		
		Automovel opcao4 = new Automovel("Corolla", "Toyota", Cor.PRETO, 4, true, true, false, true, 55000.0);
		
		Automovel opcao5 = new Automovel("Gol", "Volkswagen", Cor.CHUMBO, 4, true, true, true, true, 55000.0);
		
		
		
		
		System.out.println(opcao1 + ", basico");
		System.out.println();
		System.out.println(opcao2 + ", basico com cor personalizada");
		System.out.println();
		System.out.println(opcao3 + " completo e cor personalizada");
		System.out.println();
		System.out.println(opcao4 + ", com vidro, direção, ar-condicionado");
		System.out.println();
		System.out.println(opcao5 + ", completo e cor personalizada");
		
		System.out.println("--------------------------------------------------");
		System.out.println("Com promoção, desconto 10% no preco basico do carro!");
		System.out.println();
		opcao1.setPromocao(true);
		opcao2.setPromocao(true);
		opcao3.setPromocao(true);
		opcao4.setPromocao(true);
		opcao5.setPromocao(true);
		
		System.out.println(opcao1 + ", basico");
		System.out.println();
		System.out.println(opcao2 + ", basico com cor personalizada");
		System.out.println();
		System.out.println(opcao3 + " completo e cor personalizada");
		System.out.println();
		System.out.println(opcao4 + ", com vidro, direção, ar-condicionado");
		System.out.println();
		System.out.println(opcao5 + ", completo e cor personalizada");
		
		
	}

}
