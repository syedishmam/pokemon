package pokemon.water_types;

import pokemon.Pokemon;

public class Squirtle extends Pokemon {

	public Squirtle() {
		super(50, 150, 45, 25, "Squirtle");
	}
	
	public Pokemon evolve() {
		Wartortle evolvedPokemon = new Wartortle();
		System.out.println(this.getName() + " evolved into " + evolvedPokemon.getName());
		return evolvedPokemon;
	}
	
}
