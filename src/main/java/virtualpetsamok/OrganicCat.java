package virtualpetsamok;

public class OrganicCat extends Organic {

	OrganicCat(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel, hunger, thirst);
	}

	@Override
	public String toString() {
		return "Organic Cat\tName: " + name + "\tHealth Level: " + healthLevel + "\tHappiness Level: " + happinessLevel
				+ "\tHunger: " + hunger + "\tThirst: " + thirst;
	}

	public int useLitterBox() {
		return 1;
	}

}
