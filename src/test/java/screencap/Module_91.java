package screencap;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Module_91 extends Module_B {
	@Test
	public void one() {
		System.out.println("One");
	}

	@Test
	public void two() {
		assertTrue(false);
		System.out.println("Two");
	}
}
