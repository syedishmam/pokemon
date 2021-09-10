package execute;

import pokemon.*;
import pokemon.electric_types.Pikachu;

import java.util.*;

import interactions.Battle;
import pokemon.fire_types.*;
import pokemon.grass_types.Bulbasaur;
import pokemon.water_types.Squirtle;

public class Execute {

	public static void main(String[] args) throws Exception {
		
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		
		Squirtle squirtle = new Squirtle();
		Pikachu pikachu = new Pikachu();
		
		List<Pokemon> teamOne = new ArrayList<Pokemon>();
		List<Pokemon> teamTwo = new ArrayList<Pokemon>();
		
		teamOne.add(charmander);
		teamOne.add(bulbasaur);
		
		teamTwo.add(squirtle);
		teamTwo.add(pikachu);
		
		//Battle battle = new Battle(teamOne, teamTwo);
		
		Battle battle = new Battle(teamOne, teamTwo);
		
	}
	
}
