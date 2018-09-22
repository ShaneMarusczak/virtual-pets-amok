package virtualpetsamok;

public abstract class Pet {
	String name;
	protected int healthLevel;
	protected int happinessLevel;
	
	Pet(String name, int healthLevel, int happinessLevel){
		this.name = name;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getHappiness() {
		return happinessLevel;
	}
	

}
