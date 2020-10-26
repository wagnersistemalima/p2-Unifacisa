package application;

import java.util.ArrayList;
import java.util.List;

import entities.ListaMathUtils;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(ListaMathUtils.calculaDivisores(12) + " Lista de divisores");
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(ListaMathUtils.calculaDivisores(32)+ " Lista de divisores");
		
		List<Double> listaDeNumeros = new ArrayList<Double>();
		
		listaDeNumeros.add(12.4);
		listaDeNumeros.add(43.1);
		listaDeNumeros.add(4.3);
		listaDeNumeros.add(54.0);
		listaDeNumeros.add(6.7);
		
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println(ListaMathUtils.computaMaior(listaDeNumeros)+ " é o maior numero da lista");
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println(ListaMathUtils.computaMenor(listaDeNumeros) + " é o menor numero da lista");
		
		System.out.println("----------------------------------------------------------");
		System.out.println( "Media = " + ListaMathUtils.computaMedia(listaDeNumeros));
		
		System.out.println("-----------------------------------------------------------");
		
	}

}
