package application;

import entities.SistemaInterpol;

public class Program {

	public static void main(String[] args) {
		
		SistemaInterpol interpol = new SistemaInterpol();
		
		interpol.adicionarProcurado("Joao perigoso");
		interpol.adicionarProcurado("Maria boca de fogo");
		interpol.adicionarProcurado("Antonio extrangulador");
		
		System.out.println("Antonio extrangulador � procurado? " + interpol.ehProcurado("Antonio extrangulador"));
		
		System.out.println("Joao da carne de charque � procurado? " + interpol.ehProcurado("Joao da carne de charque"));
	}

}
