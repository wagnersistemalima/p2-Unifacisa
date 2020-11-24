package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.exceptions.CarroInexistenteException;
import interfaces.LocadoraCarros;

public abstract class Locadora implements LocadoraCarros {

	// atributo basico

	private List<Carro> carros;

	// construtor

	public Locadora() {
		this.carros = new ArrayList<Carro>();
	}

	// getters

	public List<Carro> getCarros() {
		return carros;
	}

	// 1º metodo adicionar carro

	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		Carro carro = new Carro(modelo, marca, ano, diaria);
		this.carros.add(carro);

	}

	// 2º metodo listar carros da marca

	@Override
	public List<Carro> listarCarrosDaMarca(String marca) {
		List<Carro> listaAuxiliar = new ArrayList<Carro>();
		for (Carro carro : this.carros) {
			if (carro.getMarca().equals(marca)) {
				listaAuxiliar.add(carro);
			}
		}
		return listaAuxiliar;
	}

	// 3º metodo remover carro

	@Override
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException {
		Iterator<Carro> iterator = this.carros.iterator();
		boolean status = false;
		while (iterator.hasNext()) {
			Carro carro = iterator.next();
			if (carro.getModelo().equals(modelo) && carro.getMarca().contentEquals(marca) && carro.getAno() == ano) {
				iterator.remove();
				status = true;
			}
		}
		if (!status) {
			throw new CarroInexistenteException(modelo, marca, ano);
		}
	}

	// metodo static para calcular a quantidade de dias

	public static int getQuantidadeDeDias(Data inicio, Data fim) {
		int dias = 0;
		
		if (fim.getMes() >= inicio.getMes()) {

			dias += (fim.getMes() - inicio.getMes()) * 30;
			if (fim.getDia() >= inicio.getDia()) {
				dias += fim.getDia() - inicio.getDia();
				if (dias == 0) {
					dias = 1;
				}
			}
			else {
				dias = (dias + fim.getDia()) - inicio.getDia();
			}
		}
		
		return dias;
	}
	
	

}
