package pokemon;

import java.lang.Math;

public abstract class Pokemon {
	
	private int atkPts;
	private int hitPts;
	private int accPts;
	
	public Pokemon(int atkPts, int hitPts, int accPts) {
		//Assuming that all pokemon must have a minimum damage and minimum health of 1
		if(atkPts < 1) this.atkPts = 1;
		if(hitPts < 1) this.hitPts = 1;
		if(accPts < 1) this.accPts = 1;
		this.atkPts = atkPts;
		this.hitPts = hitPts;
		this.accPts = accPts;
	}
	
	public int attack() {
		if(Math.random() * 100 <= this.accPts) {
			System.out.println("Charmander attacked and HIT!");
		} else System.out.println("Charmander attacked but MISSED!");
		return this.atkPts;
	}

}
