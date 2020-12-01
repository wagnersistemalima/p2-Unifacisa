package entities.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Data;
import entities.Pokedex;
import entities.Pokemon;
import entities.enums.Tipo;

public class PokedexTeste {

	private Pokedex pokedex;

	@Before
	public void setUp() {

		pokedex = new Pokedex();

	}

	// metodo para adicionar pokemon recebendo um nome, tipo, data de captura/ ok

	@Test
	public void testAdicionarPokemon1() {

		assertEquals(0, pokedex.getPokemons().size());

		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(3, pokedex.getPokemons().size());

	}

	// metodo para adicionar pokemon recebendo um Pokemon/ ok

	@Test
	public void testAdicionarPokemon2() {

		assertEquals(0, pokedex.getPokemons().size());

		Pokemon pokemon = new Pokemon("Chico", Tipo.FANTASMA, new Data(6, 4, 1956));

		pokedex.adicionarPokemon(pokemon);

		assertEquals(1, pokedex.getPokemons().size());

	}

	// metodo para para retornar quantidade de pok�mons capturados / ok

	@Test
	public void testQuantidadeDePokemons() {

		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(3, pokedex.getQuantidadePokemons());
	}

	// fun��o para retornar a quantidade de pokemons capturados de um determinado
	// tipo

	@Test
	public void testQuantidadeDePokemonsTipo() {

		pokedex.adicionarPokemon("Carol", Tipo.EL�TRICO, new Data(3, 5, 1915));
		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(2, pokedex.getQuantidadePokemons(Tipo.EL�TRICO));
	}

	// que retorne todos os Pok�mons capturados em determinado dia / ok

	@Test
	public void testPokemonCapturados1() {

		pokedex.adicionarPokemon("Carol", Tipo.EL�TRICO, new Data(2, 5, 1915));
		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(2, pokedex.getPokemonsCapturados(new Data(2, 8, 2020)).size());
	}

	// Caso n�o haja pok�mons que foram capturados em uma data especificada, retorne
	// null /ok

	@Test
	public void testPokemonCapturados2() {

		pokedex.adicionarPokemon("Carol", Tipo.EL�TRICO, new Data(2, 5, 1915));
		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(null, pokedex.getPokemonsCapturados(new Data(15, 8, 2020)));
	}

	// metodo que retorne o pok�mon mais antigo da Pok�Dex

	@Test
	public void testPokemonMaisAntigo() {

		pokedex.adicionarPokemon("Carol", Tipo.EL�TRICO, new Data(2, 5, 1915));
		pokedex.adicionarPokemon("Joao", Tipo.DRAG�O, new Data(2, 8, 2020));
		pokedex.adicionarPokemon("Pedro", Tipo.EL�TRICO, new Data(5, 4, 2018));
		pokedex.adicionarPokemon("Maria", Tipo.GELO, new Data(8, 5, 2017));

		assertEquals(new Pokemon("Carol", Tipo.EL�TRICO, new Data(2, 5, 1915)), pokedex.getPok�monMaisAntigo());
	}

	// Caso a PokeDex n�o contenha nenhum pok�mon, retorne null

	@Test
	public void testPokemonMaisAntigoComListaVazia() {


		assertEquals(null, pokedex.getPok�monMaisAntigo());
	}
	
	// Fun��o que retorne o tipo de pok�mon predominante da Pok�Dex
	
	

}
