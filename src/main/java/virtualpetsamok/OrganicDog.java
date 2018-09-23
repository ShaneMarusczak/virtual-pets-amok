package virtualpetsamok;

public class OrganicDog extends Organic implements DogActions {

	int cageCleanliness;

	OrganicDog(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel, hunger, thirst);
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;

	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public void cleanCage() {
		cageCleanliness -= 1;
	}

}
