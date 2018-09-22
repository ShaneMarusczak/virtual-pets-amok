package virtualpetsamok;

public class RoboticDog extends Robotic implements DogActions {

	RoboticDog(int healthLevel, int happinessLevel) {
		super(healthLevel, happinessLevel);
	}

	@Override
	public void goForWalk() {
		happinessLevel +=1;
		
	}

	

}
