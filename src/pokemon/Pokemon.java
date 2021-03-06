package pokemon;

import java.lang.Math;

public abstract class Pokemon implements Evolve {
	
	private int atkPts;
	private int accPts;
	protected int xpPts;
	private int HP;
	protected int prowess;
	private String name;
	
	public Pokemon(int atkPts, int HP, int accPts, int prowess, String name) {
		//Assuming that all pokemon must have a minimum damage and minimum health of 1
		if(atkPts < 1) this.atkPts = 1;
		if(HP < 1) this.HP = 1;
		if(accPts < 1) this.accPts = 1;
		this.atkPts = atkPts;
		this.HP = HP;
		this.accPts = accPts;
		this.xpPts = 0;
		this.prowess = prowess;
		this.name = name;
	}
	
	public int attack() {
		//Randomize hit or miss based on pokemon's accuracy
		if(Math.random() * 100 <= this.accPts) {
			System.out.println(this.name + " attacked and HIT!");
			return this.atkPts;
		} else {
			System.out.println(this.name + " attacked but MISSED!");
			return 0;
		}
	}
	
	public void takeHit(int amt) {
		if(amt > 0) {
			//Check to make sure HP doesn't dip below 0
			if(this.HP - amt < 1) {
				this.HP = 0;
			} else this.HP = this.HP - amt;
			System.out.println(this.name + " took " + amt + " points of damage, HP now " + this.HP);
		}
	}
	
	public int getHP() {
		return this.HP;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getProwess() {
		return this.prowess;
	}
	
	public void setXP(int num) {
		if(num > 0) this.xpPts = xpPts + num;
	}
	
	public int getXP() {
		return this.xpPts;
	}

}
