package screencap;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Module_B implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				ScreenCap.screenCap(driver, result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Screen Shot taken for " + result.getMethod().getMethodName());
	}
}
