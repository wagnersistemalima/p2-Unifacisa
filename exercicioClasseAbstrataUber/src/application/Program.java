package application;

import entities.SistemaUber;
import entities.UberBlack;
import entities.UberX;
import entities.UberXVip;

public class Program {

	public static void main(String[] args) {
		
		// instanciando um sistema do uber
		
		SistemaUber uber = new SistemaUber();
		
		// adicionando corridas ao sistema
		
		uber.adicionarCorridas(new UberX(5));
		uber.adicionarCorridas(new UberBlack(8));
		uber.adicionarCorridas(new UberXVip(3.4));
		
		// mostrando o valor total das corridas no sistema
		
		System.out.println("Valor total " + uber.getValorCorridas());
		

	}

}
