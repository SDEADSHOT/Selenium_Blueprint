package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenCap {
	public static void screenCap(WebDriver driver, String name) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Code_F\\Basic_M\\ScreenShot\\" + name + ".png");
		Files.copy(src, dest);
	}
}
