package virtualpetsamok;

public abstract class Organic extends Pet {

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
		hunger += 1;
	}

	protected void increaseThirst() {
		thirst += 1;
	}

	protected int getHunger() {
		return hunger;
	}

	protected int getThirst() {
		return thirst;
	}

}
