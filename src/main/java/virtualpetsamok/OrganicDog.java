package virtualpetsamok;

public class OrganicDog extends Organic implements DogActions {

	int cageDirtiness;

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

	}

	public int getCageDirtiness() {
		return cageDirtiness;
	}

	public void cleanCage() {
		cageDirtiness -= 1;
	}

	public void makeCageDirtier() {
		cageDirtiness += 1;
	}

}
