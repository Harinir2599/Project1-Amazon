package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T10_Product_increment_cart {
	WebDriver driver;
	@FindBy(css=".a-icon-small-add")
	WebElement increment;
	
	@FindBy(css="a-icon-small-remove")
	WebElement decrement;
	
	public void increment() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(increment)).click();
		
		
	}
	public void decrement() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(decrement)).click();
	}
	
	public T10_Product_increment_cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
