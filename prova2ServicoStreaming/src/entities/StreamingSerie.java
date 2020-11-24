package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.exceptions.AutorInexistenteException;
import interfaces.ServicoStreaming;

public abstract class StreamingSerie implements ServicoStreaming{
	
	
	protected List<Serie> series;
	

	
	public StreamingSerie() {
		this.series = new ArrayList<Serie>();
	}
	
	// adicionar serie
	
	@Override
	public void adicionarSerie(String nome, String autor, Data lancamento, double custoOnDemand) {
		Serie serie = new Serie(nome, autor, lancamento, custoOnDemand);
		series.add(serie);
		
	}
	
	// metodo para listar uma serie pelo autor
	
	@Override
	public List<Serie> listarSeriesDoAutor(String autor) {
		List<Serie> listaAuxiliar = new ArrayList<Serie>();
		for (Serie serie: this.series) {
			if (serie.getAutor().equals(autor)) {
				listaAuxiliar.add(serie);
			}
		}
		return listaAuxiliar;
	}
	
	// remover serie do autor
	
	@Override
	public void removerSeriesDoAutor(String autor) throws AutorInexistenteException  {
		Iterator<Serie> iterator = this.series.iterator();
		boolean status = false;
		
		while (iterator.hasNext()) {
			Serie serie = iterator.next();
			if (serie.getAutor().contentEquals(autor)) {
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			throw new AutorInexistenteException(autor);
		}
		
	}
	
	// Getters

	public List<Serie> getSeries() {
		return series;
	}
	
	

}
