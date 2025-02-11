package project_ecommerce.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T11_CheckOut_page {
	WebDriver driver;
	@FindBy(css="input[name='proceedToRetailCheckout']")
	WebElement proceed_button;
	
	@FindBy(css=".a-button-input[data-csa-c-slot-id='checkout-secondary-continue-payselect']")
	WebElement use_payment_button;
	
	@FindBy(css="a[data-args='redirectReason=spcChangeClicked']")
	WebElement review_button;
	
	public void procced_to_buy() {
		proceed_button.click();
	}
	
	public void use_payment_method() {
		use_payment_button.click();
	}
	public void review_method() {
		review_button.click();
	}
	
	public T11_CheckOut_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
