package virtualpetsamok;

import java.util.HashMap;

public class Shelter {

	private int catLitterBoxLevel = 0;

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

	public void waterAllOrganicPets() {
		for (OrganicDog dog : allOrganicDogs.values()) {
			dog.giveWater();
		}
		for (OrganicCat cat : allOrganicCats.values()) {
			cat.giveWater();
		}
	}

	public void feedAllOrganicPets() {
		for (OrganicDog dog : allOrganicDogs.values()) {
			dog.giveFood();
		}
		for (OrganicCat cat : allOrganicCats.values()) {
			cat.giveFood();
		}
	}

	public void oilAllRoboticPets() {
		for (RoboticDog dog : allRoboticDogs.values()) {
			dog.giveOil();
		}
		for (RoboticCat cat : allRoboticCats.values()) {
			cat.giveOil();
		}
	}

	public void maintainAllRoboticPets() {
		for (RoboticDog dog : allRoboticDogs.values()) {
			dog.performMaintenance();
		}
		for (RoboticCat cat : allRoboticCats.values()) {
			cat.performMaintenance();
		}
	}

	public void addOrganicDog(OrganicDog dog) {
		allOrganicDogs.put(dog.getName(), dog);

	}

	public void addRoboticDog(RoboticDog dog) {
		allRoboticDogs.put(dog.getName(), dog);

	}

	public void cleanLitterBox() {
		catLitterBoxLevel -= 4;
	}

	public int getLitterBoxLevel() {
		return catLitterBoxLevel;
	}

}
