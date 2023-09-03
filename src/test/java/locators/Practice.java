package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Demo");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Demo@123");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9887767546");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		Thread.sleep(3000);
		String val = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String v[] = val.split(" ");
		String s;
		for (String c : v) {
			if (c.equalsIgnoreCase("'rahulshettyacademy'")) {
				driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("inputUsername")).sendKeys("Demo");
				for (int i = 1; i < c.length() - 1; i++) {
					if (i == 0 || i == c.length() - 1) {
					} else {
						s = c.charAt(i) + "";
						// System.out.print(s);
						driver.findElement(By.name("inputPassword")).sendKeys(s);
					}

				}
				driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
				driver.findElement(By.cssSelector("button.submit")).click();
			}
		}
		Thread.sleep(5000);
		String value = driver.findElement(By.xpath("//p[contains(@style,'color: rgb(27, 179, 102);')]")).getText();
		System.out.println(value);

		driver.close();
	}
}