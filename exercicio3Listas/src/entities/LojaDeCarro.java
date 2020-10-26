package entities;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarro {
	
	private List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	
	private List<Carro> carrosVendidos = new ArrayList<Carro>();
	
	
	public List<Carro> getCarrosDisponiveis() {
		return carrosDisponiveis;
	}

	public List<Carro> getCarrosVendidos() {
		return carrosVendidos;
	}
	
	

	//metodo adicionar carro
	public void adicionarCarro(Carro carro) {
		carrosDisponiveis.add(carro);
	}
	
	// metodo listar carros disponiveis para venda
	public void exibirCarrosDisponíveis() {
		for(Carro c: carrosDisponiveis) {
			System.out.println(c);
		}
	}
	
	// metodo para adicionar um carro disponivel na lista de carros vendidos erro 
	
	
	// metodo 
	public void adicionarPromocao(int id) {
		double precoDesconto = 0.0;
		for (Carro c: carrosDisponiveis) {
			if (c.getId() == id) {
				 precoDesconto = c.getPreco() - c.getPreco() * 15 / 100;
				 c.setPreco(precoDesconto);
			}
		}
	}
	
	

}
