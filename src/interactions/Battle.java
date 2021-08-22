package interactions;

import pokemon.*;

public class Battle {

	public Battle(Pokemon pokemonOne, Pokemon pokemonTwo) {
		duel(pokemonOne, pokemonTwo);
	}
	
	public void duel(Pokemon pokemonOne, Pokemon pokemonTwo) {
		while(pokemonOne.getHP() > 0 && pokemonTwo.getHP() > 0) {
			pokemonTwo.takeHit(pokemonOne.attack());
			if(pokemonTwo.getHP() > 0) pokemonOne.takeHit(pokemonTwo.attack());
		}
		if(pokemonOne.getHP() < 1) {
			System.out.println(pokemonTwo.getName() + " WINS!");
		} else System.out.println(pokemonOne.getName() + " WINS!");
	}
	
}
