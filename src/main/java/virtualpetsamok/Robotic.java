package virtualpetsamok;

public abstract class Robotic extends Pet {

	private int oilLevel;
	private int maintenanceLevel;

	Robotic(String name, int healthLevel, int happinessLevel, int oilLevel, int maintenanceLevel) {
		super(name, healthLevel, happinessLevel);
		this.oilLevel = oilLevel;
		this.maintenanceLevel = maintenanceLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}
	
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}
}
