package virtualpetsamok;

import java.util.HashMap;

public class Shelter {

	HashMap<String, RoboticCat> allRoboticCats = new HashMap();
	HashMap<String, RoboticDog> allRoboticDogs = new HashMap();
	HashMap<String, OrganicCat> allOrganicCats = new HashMap();
	HashMap<String, OrganicDog> allOrganicDogs = new HashMap();

	public void takeAllDogsForWalk() {
		for (OrganicDog dog : allOrganicDogs.values()) {
			dog.goForWalk();
		}
		for (RoboticDog dog : allRoboticDogs.values()) {
			dog.goForWalk();
		}
	}

	public void addOrganicDog(OrganicDog dog) {
		allOrganicDogs.put(dog.getName(), dog);

	}

	public void addRoboticDog(RoboticDog dog) {
		allRoboticDogs.put(dog.getName(), dog);

	}

}
