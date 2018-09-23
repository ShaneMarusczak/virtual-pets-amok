package virtualpetsamok;

import java.util.HashMap;

public class Shelter {

	private int catLitterBoxLevel = 0;

	HashMap<String, Pet> allPets = new HashMap<String, Pet>();

	public HashMap<String, Pet> getAllPets() {
		return allPets;
	}

	public void cleanAllDogCages() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}

	public void takeAllDogsForWalk() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof DogActions) {
				((DogActions) pet).goForWalk();
			}
		}
	}

	public void waterAllOrganicPets() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).giveWater();
			}
		}
	}

	public void feedAllOrganicPets() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).giveFood();
			}
		}
	}

	public void oilAllRoboticPets() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).giveOil();
			}
		}
	}

	public void maintainAllRoboticPets() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).performMaintenance();
			}
		}
	}

	public void addNewPet(Pet pet) {
		allPets.put(pet.getName(), pet);

	}

	public void emptyLitterBox() {
		catLitterBoxLevel = 0;
	}

	public int getLitterBoxLevel() {
		return catLitterBoxLevel;
	}

	public void tick() {
		for (Pet pet : allPets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).increaseHunger();
				((Organic) pet).increaseThirst();
			}
		}
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).decreaseOilLevel();
				((Robotic) pet).decreaseMaintenanceLevel();
			}
		}
		for (Pet pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).makeCageDirtier();
			}
		}
		for (Pet pet : allPets.values()) {
			if (pet instanceof OrganicCat) {
				catLitterBoxLevel += ((OrganicCat) pet).useLitterBox();
			}
		}
	}

}
