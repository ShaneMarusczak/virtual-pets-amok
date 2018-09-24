package virtualpetsamok;

import java.util.Random;

public abstract class Organic extends Pet {

	private Random rand = new Random();
	protected int hunger;
	protected int thirst;

	Organic(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel);
		this.hunger = hunger;
		this.thirst = thirst;
	}

	protected void giveFood() {
		if (hunger > 5) {
			hunger -= 5;
			healthLevel += 1;
		} else {
			hunger = 0;
			healthLevel += 1;
		}
	}

	protected void giveWater() {
		if (thirst > 5) {
			thirst -= 5;
			healthLevel += 1;
		} else {
			thirst = 0;
			healthLevel += 1;
		}
	}

	protected void increaseHunger() {
		hunger += rand.nextInt(7);
	}

	protected void increaseThirst() {
		thirst += rand.nextInt(7);
	}

	protected int getHunger() {
		return hunger;
	}

	protected int getThirst() {
		return thirst;
	}

}
