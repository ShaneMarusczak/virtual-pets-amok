package virtualpetsamok;

import java.util.HashMap;

public class Shelter {

	private int catLitterBoxLevel = 0;

	HashMap<String, Pet> allPets = new HashMap<String, Pet>();

	HashMap<String, Pet> getAllPets() {
		return allPets;
	}

	void cleanAllDogCages() {
		System.out.println("\nYou clean all the cages of the organic dogs.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}

	public void walkAllDogs() {
		System.out.println("\nYou take all dogs for a walk.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof DogActions) {
				((DogActions) pet).goForWalk();
			}
		}
	}

	public void waterAllOrganicPets() {
		System.out.println("\nYou give bowls of water to all organic pets.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).giveWater();
			}
		}
	}

	public void feedAllOrganicPets() {
		System.out.println("\nYou give bowls of food to all organic pets.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).giveFood();
			}
		}
	}

	public void oilAllRoboticPets() {
		System.out.println("\nYou give oil to all robotic pets.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).giveOil();
			}
		}
	}

	public void maintainAllRoboticPets() {
		System.out.println("\nYou perform maintenance on all robotic pets.");
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).performMaintenance();
			}
		}
	}

	public Pet getPet(String name) {
		return allPets.get(name);
	}

	public void addNewPet(Pet pet) {
		allPets.put(pet.getName(), pet);

	}

	public void removePet(Pet pet) {
		allPets.remove(pet.getName(), pet);
	}

	public void emptyLitterBox() {
		System.out.println("\nThe litter box is now empty.");
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
				((Organic) pet).decreaseHappiness();
			}
		}
		for (Pet pet : allPets.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).decreaseOilLevel();
				((Robotic) pet).decreaseMaintenanceLevel();
				((Robotic) pet).decreaseHappiness();
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
		for (Pet pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				if (((OrganicDog) pet).getCageDirtiness() > 5) {
					System.out.println("\n" + pet.getName() + "'s cage is getting very dirty.");
					System.out.println("Clean it soon or they will get more unahppy and possible get sick!");
					pet.decreaseHealth();
					pet.decreaseHappiness();
				}
			}
		}
		if (catLitterBoxLevel > 25) {
			for (Pet pet : allPets.values()) {
				if (pet instanceof Organic) {
					System.out.println(
							"Waring! The litter box is full! Organic pets will start losing health until it is cleaned.");
					pet.decreaseHealth();
				}
			}
		}
	}
}
