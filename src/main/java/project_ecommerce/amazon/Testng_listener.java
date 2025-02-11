package project_ecommerce.amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Testng_listener implements ITestListener{
	static WebDriver driver;
	
	public static void setDriver(WebDriver driver2) {
		driver = driver2;
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		ITestListener.super.onTestSuccess(result);
		//driver.get("https://grotechminds.com/");
		TakesScreenshot t =  (TakesScreenshot) driver;
		File f1 = t.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\amazon\\Screenshot\\Pass_Testcase.png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
		
		e.printStackTrace();
	}
		Reporter.log("TestCase is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		TakesScreenshot t =  (TakesScreenshot) driver;
		File f1 = t.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\amazon\\Screenshot\\Fail_Testcase.png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
		
		e.printStackTrace();
	}
		Reporter.log("Testcase is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		driver.quit();

}
}

