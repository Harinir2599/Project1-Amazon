package project_ecommerce.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T13_Coupon_code_page {
	
	WebDriver driver;
	
	@FindBy(css=".a-input-text.a-form-normal.a-width-large.a-span9.pmts-claim-code")
	WebElement enter_code;
	
	public void enter_code_method() {
		enter_code.sendKeys("ABCDE");
		
	}
	
	public T13_Coupon_code_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
