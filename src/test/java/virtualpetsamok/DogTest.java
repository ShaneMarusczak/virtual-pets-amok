package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DogTest {

	@Test
	public void roboticDogShouldBeInstanceOfPet() {
		RoboticDog testDog = new RoboticDog(10,10);
		assertTrue(testDog instanceof Robotic);
		assertTrue(testDog instanceof Pet);

	}

	@Test
	public void roboticDogShouldHaveAHealthLevel() {
		RoboticDog testDog = new RoboticDog(10,10);
		int healthLevel = testDog.getHealthLevel();
		assertThat(healthLevel, is(10));

	}

	@Test
	public void organicDogShouldBeInstanceOfPet() {
		OrganicDog testDog = new OrganicDog(10,10);
		assertTrue(testDog instanceof Organic);
		assertTrue(testDog instanceof Pet);
	}
	
	@Test
	public void allDogsIncreaseHappinessWhenWalked() {
		OrganicDog testDog1 = new OrganicDog(10,10);
		RoboticDog testDog2 = new RoboticDog(10,10);
		int testDog1BegginningHappiness = testDog1.getHappiness();
		int testDog2BegginningHappiness = testDog2.getHappiness();
		testDog1.goForWalk();
		testDog2.goForWalk();
		int testDog1EndingHappiness = testDog1.getHappiness();
		int testDog2EndingHappiness = testDog2.getHappiness();
		assertTrue(testDog1EndingHappiness > testDog1BegginningHappiness);
		assertTrue(testDog2EndingHappiness > testDog2BegginningHappiness);
	}
}
