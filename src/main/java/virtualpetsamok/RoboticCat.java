package virtualpetsamok;

public class RoboticCat extends Robotic {

	RoboticCat(String name, int healthLevel, int happinessLevel, int oilLevel, int maintenanceLevel) {
		super(name, healthLevel, happinessLevel, oilLevel, maintenanceLevel);
	}

	@Override
	public String toString() {
		return "Robotic Cat\tName: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel
				+ "\tOil Level: " + oilLevel + "\tMaintenance: " + maintenanceLevel;
	}

}
