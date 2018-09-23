package virtualpetsamok;

import java.util.Scanner;

public class ShelterApp {

	public static void main(String[] args) {

		boolean usingSoftware = true;
		int menuInput;

		Scanner input = new Scanner(System.in);
		Shelter shelter = new Shelter();
		OrganicCat garfield = new OrganicCat("Garfield", 100, 100, 0, 0);
		OrganicDog otto = new OrganicDog("Otto", 100, 100, 0, 0);
		RoboticDog chip = new RoboticDog("Chip", 100, 100, 100, 100);
		RoboticCat meowth = new RoboticCat("Meowth", 100, 100, 100, 100);
		shelter.addNewPet(garfield);
		shelter.addNewPet(otto);
		shelter.addNewPet(chip);
		shelter.addNewPet(meowth);

		System.out.println("Welcome to the New and Improved Virtual Pet Shelter, now including robots!");
		System.out.println(
				"Each type of pet has specific needs, whether its robotic or organic, cat or dog. Make sure you can keep track of which pet needs what.");
		while (usingSoftware) {
			System.out.println("\nHere are your pets!");
			for (Pet pet : shelter.getAllPets().values()) {
				System.out.println(pet);
			}
			System.out.println("Litter box level (the litter box will overflow and make the pets health go down when it is above 25): " + shelter.getLitterBoxLevel());
			do {
				System.out.println("\nWhat would you like to do?");
				System.out.println("Enter 1 to walk all the dogs.");
				System.out.println("Enter 2 to clean all the dog's cages.");
				System.out.println("Enter 3 to clean the shelter's litter box.");
				System.out.println("Enter 4 to oil all robotic pets.");
				System.out.println("Enter 5 to perform maintenance on the robotic pets.");
				System.out.println("Enter 6 to water all the organic pets.");
				System.out.println("Enter 7 to feed all the organic pets.");
				System.out.println("Enter 8 to do nothing.");
				System.out.println("Enter 0 to quit.");
				menuInput = input.nextInt();
				input.nextLine();
			} while (menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 && menuInput != 5
					&& menuInput != 6 && menuInput != 7 && menuInput != 8 && menuInput != 0);
			if (menuInput == 1) {
				shelter.walkAllDogs();
			} else if (menuInput == 2) {
				shelter.cleanAllDogCages();
			} else if (menuInput == 3) {
				shelter.emptyLitterBox();
			} else if (menuInput == 4) {
				shelter.oilAllRoboticPets();
			} else if (menuInput == 5) {
				shelter.maintainAllRoboticPets();
			} else if (menuInput == 6) {
				shelter.waterAllOrganicPets();
			} else if (menuInput == 7) {
				shelter.feedAllOrganicPets();
			} else if (menuInput == 8) {
				shelter.tick();
			} else if (menuInput == 0) {
				System.out.println("Goodbye.");
				usingSoftware = false;
			}
			shelter.tick();

		}
		input.close();

	}

}
