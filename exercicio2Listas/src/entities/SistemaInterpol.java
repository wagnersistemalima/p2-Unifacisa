package entities;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	private List<String> procurados;
	
	public SistemaInterpol() {
		procurados = new ArrayList<String>();
	}
	
	public void adicionarProcurado(String nome) {
		procurados.add(nome);
	}
	
	public boolean ehProcurado(String nome) {
		for (String p: procurados) {
			if (p.equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
