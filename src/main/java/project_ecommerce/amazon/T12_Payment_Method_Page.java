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
	
	@FindBy(xpath="//span[@class='pmts-instrument-selector']")
	WebElement credit_rb;
	
	@FindBy(xpath="(//span[@role='radio'])[1]")
	WebElement netbanking_rb;
	
	@FindBy(css=".a-radio")
	WebElement UPI_rb;
	
	public void credit_rb_method() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(credit_rb)).click();
		//return credit_rb.isSelected();
		Thread.sleep(1000);
		System.out.println(credit_rb.isSelected());
		
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
