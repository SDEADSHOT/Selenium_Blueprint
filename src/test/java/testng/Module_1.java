package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Module_1 {
	@org.testng.annotations.BeforeMethod
	public static void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test(groups= {"Smoke"})
	public static void TestCase_1() {
		System.out.println("TestCase_1");
	}

	@Test
	public static void TestCase_2() {
		System.out.println("TestCase_2");
	}

	@Test
	public static void TestCase_3() {
		System.out.println("TestCase_3");
	}

	@Test(groups= {"Smoke"})
	public static void TestCase_4() {
		System.out.println("TestCase_4");
	}

	@AfterMethod
	public static void AfterMethod() {
		System.out.println("AfterMethod");
	}
}
