package testng;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Module_7 {
	static WebDriver driver;

	@BeforeTest
	public static void BeforeTest() {
		System.out.println("Launching");
	}

	@Test()
	public static void TestCase_1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		assertTrue(false);
	
	}

	@org.testng.annotations.AfterTest
	public static void AfterTest() {
		driver.close();
		System.out.println("Closed");
	}
}
