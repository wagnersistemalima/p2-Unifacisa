package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {
	
	// metodo 1
	public static List<Integer> calculaDivisores(int num) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i=1; i<=num/2; i++) {
			if (num % i == 0) {
				lista.add(i);
			}
		}
		lista.add(num);
		return lista;
	}
	
	// metodo 2 retornar o maior numero da lista
	public static double computaMaior(List<Double> numeros) {
		double maior = numeros.get(0);
		for (Double p : numeros) {
			if (p > maior) {
				maior = p;
			}
		}
		return maior;
		
	}
	
	// metodo 3 retornar o menor numero da lista 
	public static double computaMenor(List<Double> numeros) {
		double menor = numeros.get(0);
		for (Double p : numeros) {
			if (p < menor) {
				menor = p;
			}
		}
		return menor;
	}
	
	// metodo 4 deve retornar a media dos valores da lista 
	public static double computaMedia(List<Double> numeros) {
		double soma = 0.0;
		for (Double p : numeros) {
			soma += p;
		}
		double media = soma / numeros.size();
		return media;
	}
	
	// metodo 5 deve retornar se existe numeros repetidos na lista
	

}
