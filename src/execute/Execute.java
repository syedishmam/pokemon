package execute;

import pokemon.*;
import java.util.*;

import interactions.Battle;
import pokemon.fire_types.*;
import pokemon.grass_types.Bulbasaur;

public class Execute {

	public static void main(String[] args) throws Exception {
		
		Charmander charmanderOne = new Charmander();
		Bulbasaur bulbasaurOne = new Bulbasaur();
		
		Charmander charmanderTwo = new Charmander();
		Bulbasaur bulbasaurTwo = new Bulbasaur();
		
		List<Pokemon> teamOne = new ArrayList<Pokemon>();
		List<Pokemon> teamTwo = new ArrayList<Pokemon>();
		
		teamOne.add(bulbasaurOne);
		teamOne.add(charmanderOne);
		
		teamTwo.add(bulbasaurTwo);
		teamTwo.add(charmanderTwo);
		
		//Battle battle = new Battle(teamOne, teamTwo);
		
		Battle battle = new Battle(charmanderOne, charmanderTwo);
		
	}
	
}
