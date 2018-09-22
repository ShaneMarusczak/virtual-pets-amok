package virtualpetsamok;

public abstract class Organic extends Pet {

	int hunger;
	int thirst;

	Organic(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel);
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public void giveFood() {
		hunger -= 1;
	}

	public void giveWater() {
		thirst -= 1;
	}

}
