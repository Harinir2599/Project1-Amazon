package project_ecommerce.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	@FindBy(id="ap_customer_name")
	WebElement your_name;
	
	@FindBy(id="ap_phone_number")
	WebElement number;
	
	@FindBy(id="ap_password")
	WebElement pass;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	public void name() {
		your_name.sendKeys("Harini B R");
	}
	public void ph_number() {
		number.sendKeys("8939636697");
	}
	public void password() {
		pass.sendKeys("Radhe@2025");
	}
	public void button_continue() {
		continue_button.click();
		
	}
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
