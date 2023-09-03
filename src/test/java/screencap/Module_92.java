package screencap;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Module_92 extends Module_B {
	@Test
	public void three() {
		System.out.println("Three");
	}

	@Test
	public void four() {
		assertTrue(false);
		System.out.println("Four");
	}
}
