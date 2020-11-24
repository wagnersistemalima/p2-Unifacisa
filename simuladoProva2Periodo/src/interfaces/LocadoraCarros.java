package interfaces;

import java.util.List;

import entities.Carro;
import entities.Data;
import entities.exceptions.CarroAlugadoException;
import entities.exceptions.CarroInexistenteException;

// todos os metodos serao abstratos

public interface LocadoraCarros {
	
	public abstract void adicionarCarro(String modelo, String marca, int ano, double diaria);
	
	public abstract List<Carro> listarCarrosDaMarca(String marca);
	
	public abstract void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException; 
	
	public abstract double alugarCarro(Carro carro, Data datafim, Data inicio) throws CarroAlugadoException;

}
