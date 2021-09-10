package interactions;

import java.util.List;

import pokemon.*;

public class Battle {

	public Battle(Pokemon pokemonOne, Pokemon pokemonTwo) {
		Pokemon winner = duel(pokemonOne, pokemonTwo);
	}
	
	public Battle(List<Pokemon> teamOne, List<Pokemon> teamTwo) {
		Pokemon battleOneWinner = duel(teamOne.get(0), teamTwo.get(0));
		Pokemon battleTwoWinner = duel(teamOne.get(1), teamTwo.get(1));
		
		if(teamOne.contains(battleOneWinner) && teamOne.contains(battleTwoWinner)) {
			System.out.println("Team One wins!");
		} 
		else if(teamOne.contains(battleOneWinner) && teamOne.contains(battleTwoWinner)) {
			System.out.println("Team Two wins!");
		} else {
			Pokemon winner = duel(battleOneWinner, battleTwoWinner);
			if(teamOne.contains(winner)) System.out.println("Team One wins!");
			else System.out.println("Team Two wins!");
		}
	}
	
	public Pokemon duel(Pokemon pokemonOne, Pokemon pokemonTwo) {
		
		/*
		 * Battling logic
		 * As long as both Pokemons are above 0 HP, continue to fight
		 */
		
		while(pokemonOne.getHP() > 0 && pokemonTwo.getHP() > 0) {
			
			pokemonTwo.takeHit(pokemonOne.attack());		
			if(pokemonTwo.getHP() > 0) pokemonOne.takeHit(pokemonTwo.attack());
			
		}
		
		/*
		 * Determining winner based on remaining HP
		 * Winning Pokemon will receive xp points based on the defeated Pokemon's prowess
		 * After xp gain, determine if Pokemon can evolve
		 */
		
		if(pokemonOne.getHP() < 1) {
			System.out.println(pokemonTwo.getName() + " WINS!");
			pokemonTwo.setXP(pokemonOne.getProwess());
			if(pokemonTwo.getXP() >= 25) pokemonTwo = pokemonTwo.evolve();
			return pokemonTwo;
		} else {
			System.out.println(pokemonOne.getName() + " WINS!");
			pokemonOne.setXP(pokemonOne.getProwess());
			if(pokemonOne.getXP() >= 25) pokemonOne = pokemonOne.evolve();
			return pokemonOne;
		}
	}
	
	public void testEvolve(Pokemon pokemon) throws Exception {
		pokemon.setXP(10);
		System.out.println(pokemon.getXP());
		pokemon = pokemon.evolve();
		System.out.println(pokemon.getXP());
	}
	
}













