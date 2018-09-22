package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	@Test
	public void roboticCatShouldBeInstanceOfPet() {
		RoboticCat testCat = new RoboticCat("Bob", 10, 10);
		assertTrue(testCat instanceof Robotic);
		assertTrue(testCat instanceof Pet);

	}

	@Test
	public void roboticCatShouldHaveAHealthLevel() {
		RoboticCat testCat = new RoboticCat("Bob", 10, 10);
		int healthLevel = testCat.getHealthLevel();
		assertThat(healthLevel, is(10));

	}

	@Test
	public void organicCatShouldBeInstanceOfPet() {
		OrganicCat testCat = new OrganicCat("Bob", 10, 10);
		assertTrue(testCat instanceof Organic);
		assertTrue(testCat instanceof Pet);
	}

}
