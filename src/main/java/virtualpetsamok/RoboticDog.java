package virtualpetsamok;

public class RoboticDog extends Robotic implements DogActions {

	RoboticDog(String name, int healthLevel, int happinessLevel) {
		super(name, healthLevel, happinessLevel);
	}

	@Override
	public void goForWalk() {
		happinessLevel +=1;
		
	}

	

}
