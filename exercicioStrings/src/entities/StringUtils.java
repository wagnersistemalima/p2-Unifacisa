package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringUtils {
	
	public static String formataAtributo(String atributo) {
		return atributo.replace("quantidade de questoes", "quantidadeDequestoes");
	}
	
	public static String formataMetodoGet(String metodo) {
		return "get" + metodo.toUpperCase();
	}
	
	public static String formataClasse(String classe) {
		return classe.substring(0, 1).toUpperCase() + classe.substring(1).replace(" de ", "De").replace("id", "Id");
	}
	
	public static String ordenaStrings(String palavra1, String palavra2) {
		List<String> lista = new ArrayList<String>();
		lista.add(palavra1);
		lista.add(palavra2);
		Collections.sort(lista);
		palavra1 = lista.get(0);
		palavra2 = lista.get(1);
		return palavra1 + " e " + palavra2;
		
		
	}
	
	public static boolean ehPalidromo(String palavra) {
		String comparacao = "";
		for (int i=palavra.length() - 1; i >= 0; i--) {
			comparacao += palavra.charAt(i);
		}
		if (comparacao.toLowerCase().equals(palavra.toLowerCase())) {
			return true;
		}
		return false;
	}
	
	public static String transformaParaCaixaAlta(String palavra) {
		return palavra.toUpperCase();
	}
	
	public static int contaVogais(String frase) {
		// trasformar frase para minusculo
		frase = frase.toLowerCase();
		int vogal = 0;
		for (int i=0; i<frase.length(); i++) {
			char f = frase.charAt(i);
			// a=97  e = 101  i = 105  o = 111 u = 117  na tabela 
			if(f == 97 || f == 101 || f == 105 || f == 111 || f == 117) {
				vogal++;
			}
		}
		return vogal;
	}
	
	public static String removeEspacosSuperfluos(String frase) {
		// remove espaços desnesseçarios na frase
		return frase.trim();
	}
	
	public static int getQtdadePalavras(String frase) {
		String[] vect = frase.split(" ");
		int cont=0;
		for (int i=0; i<vect.length; i++) {
			cont++;
		}
		return cont;
	}
	
	
	
}
