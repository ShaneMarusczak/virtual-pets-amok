package virtualpetsamok;

public class RoboticDog extends Robotic implements DogActions {

	RoboticDog(String name, int healthLevel, int happinessLevel, int oilLevel, int maintenanceLevel) {
		super(name, healthLevel, happinessLevel, oilLevel, maintenanceLevel);
	}

	@Override
	public String toString() {
		return "Robotic Dog\tName: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel
				+ "\tOil Level: " + oilLevel + "\tMaintenance: " + maintenanceLevel;
	}

	@Override
	public void goForWalk() {
		happinessLevel += 1;

	}

}
