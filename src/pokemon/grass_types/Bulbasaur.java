package pokemon.grass_types;

import pokemon.Pokemon;

public class Bulbasaur extends Pokemon {

	public Bulbasaur() {
		super(49, 150, 45, 25, "Bulbasaur");
	}
	
	public Pokemon evolve() {
		Ivysaur evolvedPokemon = new Ivysaur();
		System.out.println(this.getName() + " evolved into " + evolvedPokemon.getName());
		return evolvedPokemon;
	}
	
}
