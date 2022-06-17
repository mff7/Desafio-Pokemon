//PACOTE
package br.com.desafio.pokemon.batalha;

import br.com.desafio.pokemon.modelo.Pokemon;

public class Batalha {

	public static void main(String[] args) {

		// CRIANDO O 1º POKEMON (NOME, VIDA, DEFESA, ATAQUE, IDTIPO)
		Pokemon pokemon1 = new Pokemon("Magikarp", 206, 24, 28, 1);

		// MOSTRANDO NO CONSOLE OS DADOS DO POKEMON1
		pokemon1.dadosDoPokemon();

		// CRIANDO O 1º POKEMON (NOME, VIDA, DEFESA, ATAQUE, IDTIPO)
		Pokemon pokemon2 = new Pokemon("Pikachu", 231, 28, 37, 2);

		// MOSTRANDO NO CONSOLE OS DADOS DO POKEMON2
		pokemon2.dadosDoPokemon();

		// ATAQUE DO POKEMON1 CONTRA O POKEMON2
		pokemon1.ataque1(pokemon1.getAtaque(), pokemon2);

		// DEFESA DO POKEMON2
		pokemon2.defesa1(pokemon2.getDefesa());

		// ATAQUE DO POKEMON2
		pokemon2.ataque4(pokemon2.getAtaque(), pokemon1);

		// MOSTRA O DADOS NO CONSOLE DOS POKEMONS
		pokemon1.dadosDoPokemon();
		pokemon2.dadosDoPokemon();

	}
}
