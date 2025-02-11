package project_ecommerce.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T13_Coupon_code_page {
	
	WebDriver driver;
	
	@FindBy(css="span[data-action='page-transit-no-update-action'] a[class='a-link-normal']")
	WebElement promo_code_link;
	
	@FindBy(id="pp-f4liOS-107")
	WebElement enter_code;
	
	public void promo_link_method() {
		promo_code_link.click();
		
	}
	public void enter_code_method() {
		enter_code.sendKeys("ABCDE");
		
	}
	
	public T13_Coupon_code_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
