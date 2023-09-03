package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Body {
	static WebDriver driver;

	// @Test(dataProvider = "dataProvider",dataProviderClass=Classname.class)
	@Parameters({ "browser" })
	@Test
	public void TestCase_1(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("We Don't have " + browser);
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Test_1");

		/** Using Name locator */
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.submit")).click();
		//Thread.sleep(5000);
		// driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		// Thread.sleep(6000);
		driver.close();
	}
}
