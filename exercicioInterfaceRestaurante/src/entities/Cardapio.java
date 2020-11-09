package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Carboidrato;
import entities.enums.Proteina;
import entities.enums.SaborBebida;
import entities.enums.Tamanho;
import interfaces.Item;

public class Cardapio {
	
	// atributos basicos
	
	private List<Refeicao> listaRefeicoes;
	private List<Bebida> listaBebidas;
	
	// construtor 
	
	public Cardapio() {
		listaRefeicoes = new ArrayList<Refeicao>();
		
		// cardapio refeição
		
		listaRefeicoes.add(new Refeicao(Proteina.CARNE_DE_SOL, Carboidrato.ARROZ));
		listaRefeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.ARRUMADINHO));
		listaRefeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.BATATA));
		listaRefeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.FEIJAO));
		listaRefeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.PURE));
		
		listaBebidas = new ArrayList<Bebida>();
		
		// cardapio bebidas
		
		listaBebidas.add(new Bebida(SaborBebida.CERVEJA, Tamanho.GRANDE));
		listaBebidas.add(new Bebida(SaborBebida.COCA_COLA, Tamanho.MEDIO));
		listaBebidas.add(new Bebida(SaborBebida.QUARANA, Tamanho.GRANDE));
		listaBebidas.add(new Bebida(SaborBebida.SUCO_DE_LARANJA, Tamanho.PEQUENO));
		listaBebidas.add(new Bebida(SaborBebida.WHISKY, Tamanho.MEDIO));
	}
	
	// getters

	public List<Bebida> getListaBebidas() {
		return listaBebidas;
	}

	public List<Refeicao> getListaRefeicoes() {
		return listaRefeicoes;
	}
	
	// metodo para retornar uma lista do cardapio
	
	public List<Item> getCardapio() {
		List<Item> cardapio = new ArrayList<Item>();
		cardapio.addAll(listaRefeicoes);
		cardapio.addAll(listaBebidas);
		return cardapio;
	}

}
