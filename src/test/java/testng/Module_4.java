package testng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Module_4 {
	static WebDriver driver;

	@BeforeTest
	public static void BeforeTest() {
		System.out.println("Launching");
	}

	@Parameters({ "URL" })
	@Test()
	public static void TestCase_1(String URL) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
	}

	@org.testng.annotations.AfterTest
	public static void AfterTest() {
		driver.close();
		System.out.println("Closed");
	}
}
