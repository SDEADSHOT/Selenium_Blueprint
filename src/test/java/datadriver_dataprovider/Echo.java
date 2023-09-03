package datadriver_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Echo {
	@Test(dataProvider = "dataProvider", dataProviderClass = Foxtrott.class)
	public void TestCase_1(String un,String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(un);
		driver.findElement(By.id("inputUsername")).sendKeys(un);
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(5000);
		String val = driver.findElement(By.xpath("//p[contains(@style,'color: rgb(27, 179, 102); ')]")).getText();
		System.out.println(val);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		driver.close();
	}
}
