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

public class Testng_listener implements ITestListener {
    private static WebDriver driver;

    public static void setDriver(WebDriver driver2) {
        driver = driver2;
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (driver != null) { 
            TakesScreenshot t = (TakesScreenshot) driver;
            File f1 = t.getScreenshotAs(OutputType.FILE);
            File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\amazon\\Screenshot\\Pass_Testcase.png");
            try {
                FileHandler.copy(f1, f2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.log("TestCase is passed");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (driver != null) { 
            TakesScreenshot t = (TakesScreenshot) driver;
            File f1 = t.getScreenshotAs(OutputType.FILE);
            File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\amazon\\Screenshot\\Fail_Testcase.png");
            try {
                FileHandler.copy(f1, f2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.log("Testcase is failed");
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        if (driver != null) {  // ✅ Null check before quitting
            driver.quit();
        }
    }
}
