package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// adicionando elementos na lista
		list.add("maria");
		list.add("joao");
		list.add("pedro");
		list.add("ana");
		list.add("paulo");
		list.add("pietro");
		list.add("janaina");
		list.add("jonatas");
		list.add("alice");
		
		for (String start: list) {
			System.out.println(start);
		}
		
		System.out.println("---------------------------------------------");
		
		// adicionando elementos na lista na entre joao e pedro
		list.add(2, "marco");
		
		for (String start: list) {
			System.out.println(start);
		}
		
		System.out.println("----------------------------------------------");
		
		// saber o tamanho da lista
		System.out.println("A lista tem: " + list.size() + " elementos");
		
		System.out.println("-----------------------------------------------");
		
		// remover um elemento da lista obs = a lista tem uma operação que e capaz de remover um dado a partir da comparação com outro
		list.remove("maria");
		list.remove(1);
		
		for (String start: list) {
			System.out.println(start);
		}
		
		System.out.println("--------------------------------------------------");
		
		// remover da lista aqueles elementos que atendem por um predicado
		// usar removeIf pois aceita um predicado
		list.removeIf(x -> x.charAt(0) == 'p');        // (definindo uma função de alta ordem lambida)
		
		for (String start: list) {
			System.out.println(start);
		}
		
		System.out.println("---------------------------------------------------");
		
		// encontrar a posição de um elemento que esteja na lista ou nao. retorna a posição do elemento
		System.out.println(list.indexOf("ana") + " existe");   // se a posição do elemento não existe na lista for -1, o elemento não existe
		System.out.println(list.indexOf("wagner") + " não existe");
		
		System.out.println("---------------------------------------------------");
		
		// filtrar a lista, de modo que fique na lista aqueles elementos que tem o nome começado com a letra a.
		
		// usar o stream() pois ele aceita função de alta ordem lambida. mas nao é compativel com List
		// filter() recebe um predicado
		// para converter o strem() de volta para lista, chamar a função  collect()
		// Collectors.toList()
		// essa foi a forma que o java 8 encontrou para manter a compatibilidade com o List, e permitir fazer operaçoes do tipo lambida
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		
		for (String start: result) {
			System.out.println(start);
		}
		
		System.out.println("------------------------------------------------------");
		
		// encontrar um elemento na lista que atenda um certo predicado
		// encontrar o primeiro elemento que comece com a letra a. utilizar findFirst()
		String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
