package virtualpetsamok;

public abstract class Pet {
	String name;
	protected int healthLevel;
	protected int happinessLevel;

	Pet(String name, int healthLevel, int happinessLevel) {
		this.name = name;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}

	protected int getHealthLevel() {
		return healthLevel;
	}

	protected int getHappiness() {
		return happinessLevel;
	}

	protected String getName() {
		return name;
	}

}
