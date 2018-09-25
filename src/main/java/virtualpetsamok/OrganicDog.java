package virtualpetsamok;

import java.util.Random;

public class OrganicDog extends Organic implements DogActions {

	Random rand = new Random();
	private int cageDirtiness;

	OrganicDog(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel, hunger, thirst);
	}

	@Override
	public String toString() {
		return "Organic Dog\tName: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel
				+ "\tHunger: " + hunger + "\tThirst: " + thirst + "\tCage Dirtiness: " + cageDirtiness;
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;
		int a = rand.nextInt(4);
		if (a == 2) {
			if (cageDirtiness > 1) {
				cageDirtiness -= 1;
			} else {
				cageDirtiness = 0;
			}
		}

	}

	protected int getCageDirtiness() {
		return cageDirtiness;
	}

	protected void cleanCage() {
		if (cageDirtiness > 7) {
			cageDirtiness -= 7;
		} else {
			cageDirtiness = 0;
		}
	}

	protected void makeCageDirtier() {
		cageDirtiness += 1;
	}

}
