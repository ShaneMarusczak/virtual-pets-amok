package virtualpetsamok;

public class OrganicDog extends Organic implements DogActions {

	OrganicDog(String name, int healthLevel, int happinessLevel) {
		super(name, healthLevel, happinessLevel);
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;

	}

}
