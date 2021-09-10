package pokemon.electric_types;

import pokemon.Pokemon;

public class Pikachu extends Pokemon {

	public Pikachu() {
		super(50, 150, 45, 25, "Pikachu");
	}
	
	public Pokemon evolve() {
		Raichu evolvedPokemon = new Raichu();
		System.out.println(this.getName() + " evolved into " + evolvedPokemon.getName());
		return evolvedPokemon;
	}
	
}
