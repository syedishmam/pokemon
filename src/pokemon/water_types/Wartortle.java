package pokemon.water_types;

import pokemon.Pokemon;

public class Wartortle extends Pokemon {
	
	public Wartortle() {
		super(80, 175, 60, 20, "Wartortle");
	}
	
	public Pokemon evolve() {
		System.out.println("This Pokemon currently does not evolve");
		return this;
	}

}
