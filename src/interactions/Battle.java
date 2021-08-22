package interactions;

import pokemon.*;

public class Battle {

	public Battle(Pokemon pokemonOne, Pokemon pokemonTwo) {
		duel(pokemonOne, pokemonTwo);
	}
	
	public void duel(Pokemon pokemonOne, Pokemon pokemonTwo) {
		//While both pokemon have 1 HP or more, continue dueling
		while(pokemonOne.getHP() > 0 && pokemonTwo.getHP() > 0) {
			pokemonTwo.takeHit(pokemonOne.attack());
			//If pokemonOne didn't kill pokemonTwo, then pokemonTwo will attack
			if(pokemonTwo.getHP() > 0) pokemonOne.takeHit(pokemonTwo.attack());
		}
		if(pokemonOne.getHP() < 1) {
			System.out.println(pokemonTwo.getName() + " WINS!");
		} else System.out.println(pokemonOne.getName() + " WINS!");
	}
	
}
