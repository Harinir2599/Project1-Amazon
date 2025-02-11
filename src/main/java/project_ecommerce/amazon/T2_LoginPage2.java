package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T2_LoginPage2 {
	@FindBy(id="ap_email")
	WebElement un;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pass;

	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement pass_button;
	
	
	public void email_id(WebDriver driver) {
		
		un.sendKeys("9025371260");
	}
	public void sign_continue() {
		continue_button.click();
	}
	public void password(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys("Tejas@2025");
	}
	public void pass_submit() {
		pass_button.click();
	}
	public T2_LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
