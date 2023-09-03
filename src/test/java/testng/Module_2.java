package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module_2 {
	@BeforeTest
	public static void BeforeTest() {
		System.out.println("BeforeTest");
	}

	@Test
	public static void TestCase_1() {
		System.out.println("TestCase_1");
	}

	@Test
	public static void TestCase_2() {
		System.out.println("TestCase_2");
	}

	@Test(groups= {"Smoke"})
	public static void TestCase_3() {
		System.out.println("TestCase_3");
	}

	@Test
	public static void TestCase_4() {
		System.out.println("TestCase_4");
	}

	@org.testng.annotations.AfterTest
	public static void AfterTest() {
		System.out.println("AfterTest");
	}
}
