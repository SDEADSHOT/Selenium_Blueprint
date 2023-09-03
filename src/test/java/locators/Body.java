package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Body {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();

		/** Using ID locator */
		driver.findElement(By.id("inputUsername")).sendKeys("Username");

		/** Using Name locator */
		driver.findElement(By.name("inputPassword")).sendKeys("Password");

		/** Using ClassName locator */
		driver.findElement(By.className("forgot-pwd-container")).click();

		/** Using CSS Selector */
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Username");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("Password");
		//driver.findElement(By.cssSelector("button.submit")).click();

		/** Using Link Text */
		driver.findElement(By.linkText("Forgot your password?")).click();

		/** Using Partial Link Text */
		driver.findElement(By.partialLinkText("Forgot your")).click();

		/** Using XPath */
		driver.findElement(By.xpath("//div/form/div/button[text()='Go to Login']")).click();
		
		/** Tag Name*/	
		driver.findElement(By.tagName("button"));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
