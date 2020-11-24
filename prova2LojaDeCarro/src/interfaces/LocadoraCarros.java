package interfaces;

import java.util.List;

import entities.Carro;
import entities.Data;
import entities.exceptions.CarroAlugadoException;
import entities.exceptions.CarroInexistenteException;

public interface LocadoraCarros {
	
	public void adicionarCarro(String modelo, String marca, int ano, double diaria);
	
	public List<Carro> listarCarrosDaMarca(String marca);
	
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException;
	
	public double alugarCarro(Carro carro, Data inicio, Data fim)throws CarroAlugadoException;

}
