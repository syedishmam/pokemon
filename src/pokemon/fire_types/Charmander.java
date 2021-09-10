package pokemon.fire_types;

import pokemon.Pokemon;

public class Charmander extends Pokemon{

	public Charmander() {
		super(52, 150, 40, 25, "Charmander");
	}
	
	public Pokemon evolve() {
		Charmeleon evolvedPokemon = new Charmeleon();
		System.out.println(this.getName() + " evolved into " + evolvedPokemon.getName());
		return evolvedPokemon;
	}
	
}