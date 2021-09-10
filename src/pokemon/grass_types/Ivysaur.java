package pokemon.grass_types;

import pokemon.Pokemon;

public class Ivysaur extends Pokemon {

	public Ivysaur() {
		super(85, 165, 65, 20, "Ivysaur");
	}
	
	public Pokemon evolve() {
		System.out.println("This Pokemon currently does not evolve");
		return this;
	}
	
}
