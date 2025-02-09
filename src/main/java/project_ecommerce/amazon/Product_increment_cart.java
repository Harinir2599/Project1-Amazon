package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_increment_cart {
	WebDriver driver;
	@FindBy(xpath="//div[@id='sc-active-e63006f0-0eb8-4a59-a7ef-565e9a34c091']//button[@aria-label='Increase quantity by one']")
	WebElement increment;
	
	@FindBy(xpath="//button[@aria-label='Decrease quantity by one']")
	WebElement decrement;
	
	public void increment() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(increment)).click();
		
	}
	public void decrement() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(decrement)).click();
	}
	
	public Product_increment_cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
