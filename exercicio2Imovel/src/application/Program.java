package application;

import java.util.Locale;

import entities.Imovel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Classificados:");
		
		Imovel casa1 = new Imovel("casa", "Imobiliária Falcão", 3, 1, 2, 120, true, false, false);
		System.out.println();
		System.out.println(casa1 + ", com piscina.");
		
		Imovel apartamento1 = new Imovel("apartamento", "Imobiliária Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		System.out.println();
		System.out.println(apartamento1 + ", " + apartamento1.getNumeroDePavimentos() + " andares,\n apartamento no pavimento " + 
		apartamento1.getPavimento() + " com elevador.");
		
		
		Imovel casa2 = new Imovel("casa", "Imobiliária Altaman", 4, 2, 3, 240, true, true, true);
		System.out.println();
		System.out.println(casa2 + ", com piscina, quadra, e elevador.");
		
		Imovel casa3 = new Imovel("casa", "Imobiliária Leblon", 6, 3, 5, 540, true, true, true);
		System.out.println();
		System.out.println(casa3 + ", com piscina, quadra, e elevador.");
		
		Imovel apartamento2 = new Imovel("apartamento", "Imobiliária Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		System.out.println();
		System.out.println(apartamento2 + ", " + apartamento2.getNumeroDePavimentos() + " andares,\n apartamento no pavimento " +
		apartamento2.getPavimento() + " sem elevador.");

	}

}
