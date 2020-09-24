package application;

import entities.StringUtils;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(StringUtils.formataAtributo("quantidade de questoes"));                       // 1
		System.out.println(StringUtils.formataMetodoGet(StringUtils.formataAtributo("quantidade de questoes"))); // 2
		System.out.println(StringUtils.formataClasse("formatador de identificadores"));                 //3
		System.out.println(StringUtils.ordenaStrings("volkswagen", "ford"));                           // 4
		System.out.println(StringUtils.ehPalidromo("arara"));                                          //5
		System.out.println(StringUtils.transformaParaCaixaAlta("professor"));                         // 6
		System.out.println(StringUtils.contaVogais("In God We Trust"));                       //7
		System.out.println(StringUtils.removeEspacosSuperfluos(" Hay que endurecerse, pero sin perder la ternura jamás ")); //8
		
		System.out.println(StringUtils.getQtdadePalavras("programar é muito fácil")); //11
		
		
		String nome = "Wagner";
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" Lima Braga.");
		System.out.println(sb);
		
		

	}

}
