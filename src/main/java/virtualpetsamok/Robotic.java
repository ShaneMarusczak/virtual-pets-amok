package virtualpetsamok;

import java.util.Random;

public abstract class Robotic extends Pet {

	private Random rand = new Random();
	private int oilLevel;
	private int maintenanceLevel;

	Robotic(String name, int healthLevel, int happinessLevel, int oilLevel, int maintenanceLevel) {
		super(name, healthLevel, happinessLevel);
		this.oilLevel = oilLevel;
		this.maintenanceLevel = maintenanceLevel;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel + "\tOil Level: " + oilLevel + "\tMaintenance: " + maintenanceLevel;
	}

	protected int getOilLevel() {
		return oilLevel;
	}

	protected int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	protected void giveOil() {
		oilLevel += 1;
	}

	protected void performMaintenance() {
		maintenanceLevel += 1;
	}

	protected void decreaseOilLevel() {
		oilLevel -= rand.nextInt(5);
	}

	protected void decreaseMaintenanceLevel() {
		maintenanceLevel -= rand.nextInt(5);
	}
}
