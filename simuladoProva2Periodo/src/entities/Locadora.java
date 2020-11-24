package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.exceptions.CarroInexistenteException;
import interfaces.LocadoraCarros;

// a classe locadora não pode ser instaciada pois é abstrata. / ela assina o contrato com a interface locadora de carros

public abstract class Locadora implements LocadoraCarros{
	
	// atributo basico
	
	private List<Carro> carros;
	
	// construtor padrao
	
	public Locadora() {
		this.carros = new ArrayList<Carro>();
	}
	
	// getters

	public List<Carro> getCarros() {
		return carros;
	}
	
	// metodo adicionar carro
	
	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		Carro carro = new Carro(modelo, marca, ano, diaria);
		carros.add(carro);
		
	}
	
	// metodo listar carro
	
	@Override
	public List<Carro> listarCarrosDaMarca(String marca) {
		List<Carro> listaAuxiliar = new ArrayList<Carro>();
		for (Carro carro: this.carros) {
			if(carro.getMarca().equals(marca)) {
				listaAuxiliar.add(carro);
			}
		}
		return listaAuxiliar;
	}
	
	
	// metodo remover carro utilizando Iterator.  pode lançar uma exceção caso o carro não exista para ser removido
	
	@Override
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException{
		boolean status = false;
		Iterator<Carro> iterator = this.carros.iterator();
		while (iterator.hasNext()) {
			Carro carro = iterator.next();
			if (carro.getModelo().equals(modelo) && carro.getMarca().equals(marca) && carro.getAno() == ano) {
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			throw new CarroInexistenteException(modelo, marca, ano);
		}
		
	}
	
	// metodo auxiliar para calcular a quantidade de dias
	
	protected static int getQuantidadeDias(Data inicio, Data fim) {
		
		int dias = 0;
		
		dias += (30 - inicio.getDia()) + fim.getDia();
		
		dias += (fim.getMes() - inicio.getMes() - 1) * 30;
		return dias;
		
	}
	

}
