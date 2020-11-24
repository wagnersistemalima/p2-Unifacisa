package entities;

import entities.exceptions.SerieInexistenteException;

public class Netflix extends StreamingSerie{
	
	@Override
	public double alugarSerie(String nome, String autor) throws SerieInexistenteException {
		double custoAluguel = 0;
		boolean status = false;
		for (Serie serie: super.getSeries()) {
			if (serie.getNome().equals(nome) && serie.getAutor().equals(autor)) {
				custoAluguel += serie.getCustoOnDemand() - (serie.getCustoOnDemand() * 0.20);
				status = true;
			}
			
		}
		if (!status) {
			throw new SerieInexistenteException(nome, autor);
		}
		return custoAluguel;
	}

}
