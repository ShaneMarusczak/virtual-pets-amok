package virtualpetsamok;

public class OrganicDog extends Organic implements DogActions {

	int cageDirtiness;

	OrganicDog(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel, hunger, thirst);
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;

	}

	public int getCageCleanliness() {
		return cageDirtiness;
	}

	public void cleanCage() {
		cageDirtiness -= 1;
	}

	public void makeCageDirtier() {
		cageDirtiness += 1;
	}

}
