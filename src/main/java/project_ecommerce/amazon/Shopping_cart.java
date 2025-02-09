package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping_cart {
WebDriver driver;
	
	@FindBy(id="a-autoid-1-announce")
	WebElement cart_button;
	
	@FindBy(id="nav-cart")
	WebElement item_cart;
	
	
	
	public void cart() {
		cart_button.click();
	}
	public void item_in_cart() {
		item_cart.click();
	}
	
	public Shopping_cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
