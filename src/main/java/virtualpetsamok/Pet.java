package virtualpetsamok;

public abstract class Pet {
	int healthLevel;
	int happinessLevel;
	
	Pet(int healthLevel, int happinessLevel){
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
