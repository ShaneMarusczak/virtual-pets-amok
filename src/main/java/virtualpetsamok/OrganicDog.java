package virtualpetsamok;

public class OrganicDog extends Organic implements DogActions {

	OrganicDog(int healthLevel, int happinessLevel) {
		super(healthLevel, happinessLevel);
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;

	}

}
