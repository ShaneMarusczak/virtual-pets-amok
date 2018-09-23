package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DogTest {

	@Test
	public void roboticDogShouldBeInstanceOfPet() {
		RoboticDog testDog = new RoboticDog("Bob", 10, 10, 0, 0);
		assertTrue(testDog instanceof Robotic);
		assertTrue(testDog instanceof Pet);

	}

	@Test
	public void roboticDogShouldHaveAHealthLevel() {
		RoboticDog testDog = new RoboticDog("Bob", 10, 10, 0, 0);
		int healthLevel = testDog.getHealthLevel();
		assertThat(healthLevel, is(10));

	}

	@Test
	public void organicDogShouldBeInstanceOfPet() {
		OrganicDog testDog = new OrganicDog("Bob", 10, 10, 0, 0);
		assertTrue(testDog instanceof Organic);
		assertTrue(testDog instanceof Pet);
	}

	@Test
	public void allDogsIncreaseHappinessWhenWalked() {
		Shelter shelter = new Shelter();
		OrganicDog testDog1 = new OrganicDog("Bob", 10, 10, 0, 0);
		RoboticDog testDog2 = new RoboticDog("Bill", 10, 10, 0, 0);
		int testDog1BegginningHappiness = testDog1.getHappiness();
		int testDog2BegginningHappiness = testDog2.getHappiness();
		shelter.addNewPet(testDog1);
		shelter.addNewPet(testDog2);
		shelter.walkAllDogs();
		int testDog1EndingHappiness = testDog1.getHappiness();
		int testDog2EndingHappiness = testDog2.getHappiness();
		assertTrue(testDog1EndingHappiness > testDog1BegginningHappiness);
		assertTrue(testDog2EndingHappiness > testDog2BegginningHappiness);
	}

}
