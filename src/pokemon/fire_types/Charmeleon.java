package pokemon.fire_types;

import pokemon.Pokemon;

public class Charmeleon extends Pokemon {

	public Charmeleon() {
		super(80, 175, 60, 20, "Charmeleon");
	}
	
	@Override
	public Pokemon evolve() {
		System.out.println("This Pokemon currently does not evolve");
		return this;
	}
	
}
