package testng;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Module_7_Listener extends Module_7 implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				ScreenCap.screenCap(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
