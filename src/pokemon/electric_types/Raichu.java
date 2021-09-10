package pokemon.electric_types;

import pokemon.Pokemon;

public class Raichu extends Pokemon {

	public Raichu() {
		super(80, 175, 60, 20, "Raichu");
	}
	
	public Pokemon evolve() {
		System.out.println("This Pokemon currently does not evolve");
		return this;
	}
	
}
