package virtualpetsamok;

import java.util.Random;

public abstract class Organic extends Pet {

	private Random rand = new Random();
	private int hunger;
	private int thirst;

	Organic(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel);
		this.hunger = hunger;
		this.thirst = thirst;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel + "\tHunger: " + hunger
				+ "\tThirst: " + thirst;
	}

	protected void giveFood() {
		hunger -= 1;
	}

	protected void giveWater() {
		thirst -= 1;
	}

	protected void increaseHunger() {
		hunger += rand.nextInt(5);
	}

	protected void increaseThirst() {
		thirst += rand.nextInt(5);
	}

	protected int getHunger() {
		return hunger;
	}

	protected int getThirst() {
		return thirst;
	}

	

}
