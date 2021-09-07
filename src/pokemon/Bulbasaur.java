package pokemon;

public class Bulbasaur extends Pokemon {

	public Bulbasaur() {
		super(49, 150, 45, 5, "Bulbasaur");
	}
	
	@Override
	public Pokemon evolve() {
		Charmeleon evolvedPokemon = new Charmeleon();
		return evolvedPokemon;
	}
	
}
