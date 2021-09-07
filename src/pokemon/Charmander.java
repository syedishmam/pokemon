package pokemon;

public class Charmander extends Pokemon{

	public Charmander() {
		super(52, 150, 40, 5, "Charmander");
	}
	
	@Override
	public Pokemon evolve() {
		Charmeleon evolvedPokemon = new Charmeleon();
		return evolvedPokemon;
	}
	
}
