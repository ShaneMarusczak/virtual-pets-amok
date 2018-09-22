package virtualpetsamok;

public class OrganicCat extends Organic {

	OrganicCat(String name, int healthLevel, int happinessLevel, int hunger, int thirst) {
		super(name, healthLevel, happinessLevel, hunger, thirst);
	}
	
	public int useLitterBox() {
		return 1;
	}

}
