package pokemon;

public abstract class Pokemon {
	
	private int atkPts;
	private int hitPts;
	
	public Pokemon(int atkPts, int hitPts) {
		//Assuming that all pokemon must have a minimum damage and minimum health of 1
		if(atkPts < 1) this.atkPts = 1;
		if(hitPts < 1) this.hitPts = 1;
		this.atkPts = atkPts;
		this.hitPts = hitPts;
	}

}
