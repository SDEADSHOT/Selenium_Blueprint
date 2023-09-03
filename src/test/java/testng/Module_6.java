package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module_6 {
	static WebDriver driver;

	// @Test(dataProvider = "dataProvider",dataProviderClass=Classname.class)
	@Test(dataProvider = "dataProvider")
	public void TestCase_1(String un, String pw) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(un);

		/** Using Name locator */
		driver.findElement(By.name("inputPassword")).sendKeys(pw);
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log Out']"));

	}

	@DataProvider
	public Object[][] dataProvider() {
		Object data[][] = new Object[2][2];
		data[0][0] = "Test1";
		data[0][1] = "rahulshettyacademy";

		data[1][0] = "Test2";
		data[1][1] = "rahulshettyacademy";
		return data;
	}
}
