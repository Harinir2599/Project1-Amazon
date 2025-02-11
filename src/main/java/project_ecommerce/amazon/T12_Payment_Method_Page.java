package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T12_Payment_Method_Page {
	WebDriver driver;
	
	@FindBy(id="pp-f4liOS-110")
	WebElement credit_rb;
	
	@FindBy(id="pp-f4liOS-116")
	WebElement netbanking_rb;
	
	@FindBy(id="pp-f4liOS-136")
	WebElement UPI_rb;
	
	public void credit_rb_method() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(credit_rb)).click();
		
	}
	public void netbanking_rb_method() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(netbanking_rb)).click();
		
	}
	public void UPI_rb() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(UPI_rb)).click();
		
	}
	public T12_Payment_Method_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
