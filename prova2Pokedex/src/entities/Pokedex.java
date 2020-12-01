package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Tipo;

public class Pokedex {
	
	// atributos basicos
	
	private List<Pokemon> pokemons;
	
	
	
	// construtor
	
	public Pokedex() {
		this.pokemons = new ArrayList<Pokemon>();
	}
	
	// getters

	public List<Pokemon> getPokemons() {
		return pokemons;
	}
	
	// metodo adicionar pokemon
	
	public void adicionarPokemon(Pokemon p) {
		this.pokemons.add(p);
	}
	
	public void adicionarPokemon(String nome, Tipo tipo, Data diaCaptura) {
		Pokemon pokemon = new Pokemon(nome, tipo, diaCaptura);
		this.pokemons.add(pokemon);
	}
	
	// metodo para retornar a quantidade de pokemons na lista
	
	public int getQuantidadePokemons() {
		int quantidade = 0;
		for (Pokemon pokemon: this.pokemons) {
			if (pokemon.getNome() != null) {
				quantidade ++;
			}
		}
		return quantidade;
	}
	
	// metodo para retornar a quantidade de pokemons de um determinado tipo
	
	public int getQuantidadePokemons(Tipo tipo) {
		int quantidade = 0;
		for (Pokemon pokemon: this.pokemons) {
			if (pokemon.getTipo().equals(tipo)) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	// metodo que retorne todos os pokemons capturado em um determinado dia
	
	public List<Pokemon> getPokemonsCapturados(Data dia) {
		boolean status = false;
		List<Pokemon> listaAuxiliar = new ArrayList<Pokemon>();
		for (Pokemon pokemon: this.pokemons) {
			if (pokemon.getDiaCaptura().getDia() == dia.getDia()) {
				listaAuxiliar.add(pokemon);
				status = true;
			}
		}
		if (status) {
			return listaAuxiliar;
		}
		else {
			return null;
		}
		
	}
	
	// Função que retorne o pokémon mais antigo da PokéDex
	
	
	public Pokemon getPokémonMaisAntigo() {
		boolean status = false;
		Pokemon pokemonComparado = new Pokemon("Exemplo", Tipo.NORMAL, new Data(30, 12, 2020));
		for (Pokemon pokemon: this.pokemons) {
			if (pokemon.getDiaCaptura().getAno() <= pokemonComparado.getDiaCaptura().getAno() &&
					pokemon.getDiaCaptura().getMes() <= pokemonComparado.getDiaCaptura().getMes() &&
					 pokemon.getDiaCaptura().getDia() <= pokemonComparado.getDiaCaptura().getDia()) {
				pokemonComparado = pokemon;
				status = true;
			}
		}
		if (status) {
			return pokemonComparado;
		}
		else {
			return null;
		}
	}
	
	// Função que retorne o tipo de pokémon predominante da PokéDex
	
	
	
	
}
