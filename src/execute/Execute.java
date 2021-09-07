package execute;

import pokemon.*;
import java.util.*;
import interactions.Battle;


public class Execute {

	public static void main(String[] args) {
		
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
		
		Battle battle = new Battle(teamOne, teamTwo);
		
	}
	
}
