package interfaces;

import java.util.List;

import entities.Data;
import entities.Serie;
import entities.exceptions.AutorInexistenteException;
import entities.exceptions.SerieInexistenteException;

public interface ServicoStreaming {
	
	public void adicionarSerie(String nome, String autor, Data lancamento, double custoOnDemand);
	
	public  List<Serie> listarSeriesDoAutor(String autor);
	
	public void removerSeriesDoAutor(String autor) throws AutorInexistenteException;
	
	public double alugarSerie(String nome, String autor) throws SerieInexistenteException;
		
	

}
