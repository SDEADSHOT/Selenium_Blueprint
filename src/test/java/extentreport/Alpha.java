package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Alpha {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter report = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Alpha.html");
		extent.attachReporter(report);

		ExtentTest Test_1 = extent.createTest("Test_1");
		Test_1.log(Status.PASS, "The TestCase is Passed");

		extent.createTest("Test_2").fail("The TestCase is Failed");

		ExtentTest Test_3 = extent.createTest("Test_3");
		Test_3.skip("The TestCase is Skipped");

		extent.flush();
	}
}
