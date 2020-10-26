package application;

import entities.Carro;
import entities.LojaDeCarro;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		
		LojaDeCarro carrosDisponiveis = new LojaDeCarro();
		
		
		Carro carro1 = new Carro(1, "Gol", "volkswagen", Cor.AMARELO, 2, true, true, true, 55000.0);
		Carro carro2 = new Carro("Uno", "Fiat", 25000.0);
		
		
		// metodo adicionar carro
		carrosDisponiveis.adicionarCarro(carro1);
		carrosDisponiveis.adicionarCarro(carro2);
		
		// listar carros disponiveis para venda
		carrosDisponiveis.exibirCarrosDispon�veis();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		
		// listar novamente carros disponiveis
		System.out.println("Carros disponiveis atualizado:");
		carrosDisponiveis.exibirCarrosDispon�veis();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		// adicionar carro na promo��o
		System.out.println("Carro em promo��o");
		carrosDisponiveis.adicionarPromocao(1);
		carrosDisponiveis.exibirCarrosDispon�veis();
		
		
		
		
	}

}
