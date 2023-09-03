package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Bravo {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter report = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Bravo.html");
		extent.attachReporter(report);

		extent.createTest("Test Case_1").log(Status.PASS, "Passed").log(Status.FAIL, "Failed")
				.log(Status.SKIP, "Skipped").log(Status.WARNING, "Warning").log(Status.INFO, "Info");

		extent.createTest("Test Case_2").log(Status.PASS, "Passed").log(Status.SKIP, "Skipped")
				.log(Status.WARNING, "Warning").log(Status.INFO, "Info");

		extent.createTest("Test Case_3").log(Status.PASS, "Passed").log(Status.WARNING, "Warning").log(Status.INFO,
				"Info");

		extent.flush();
	}
}
