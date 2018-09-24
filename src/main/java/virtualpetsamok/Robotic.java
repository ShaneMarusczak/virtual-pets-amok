package virtualpetsamok;

import java.util.Random;

public abstract class Robotic extends Pet {

	private Random rand = new Random();
	protected int oilLevel;
	protected int maintenanceLevel;

	Robotic(String name, int healthLevel, int happinessLevel, int oilLevel, int maintenanceLevel) {
		super(name, healthLevel, happinessLevel);
		this.oilLevel = oilLevel;
		this.maintenanceLevel = maintenanceLevel;
	}

	protected int getOilLevel() {
		return oilLevel;
	}

	protected int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	protected void giveOil() {
		oilLevel += 10;
		healthLevel += 1;
	}

	protected void performMaintenance() {
		maintenanceLevel += 10;
		healthLevel += 1;
	}

	protected void decreaseOilLevel() {
		if (oilLevel > 7) {
			oilLevel -= rand.nextInt(7);
		} else {
			oilLevel = 1;
		}
	}

	protected void decreaseMaintenanceLevel() {
		if (maintenanceLevel > 7) {
			maintenanceLevel -= rand.nextInt(7);
		} else {
			oilLevel = 1;
		}
	}
}
