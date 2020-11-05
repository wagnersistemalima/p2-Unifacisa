package entities;

import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
	
	// atributos basicos
	
	private List<Corrida> corridas;
	
	// construtor
	
	public SistemaUber() {
		this.corridas = new ArrayList<Corrida>();
	}
	
	// metodo adicionar carro
	
	public void adicionarCorridas(Corrida corrida) {
		corridas.add(corrida);
	
	}
	
	
	// valor total da corridas
	
	public double getValorCorridas() {
		double valorTotal = 0;
		for (Corrida c: corridas) {
			valorTotal += c.getValor();
		}
		return valorTotal;
	}

	
}
