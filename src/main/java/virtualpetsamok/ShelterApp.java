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
			do {
				System.out.println("What would you like to do?");
				System.out.println("Enter 1 to walk all the dogs.");
				System.out.println("Enter 2 to clean all the dogs cages.");
				System.out.println("Enter 3 to clean the shelter's litter box.");
				System.out.println("Enter 4 to oil all robotic pets.");
				menuInput = input.nextInt();
				input.nextLine();
			} while (menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4);

		}

	}

}
