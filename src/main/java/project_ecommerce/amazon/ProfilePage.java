package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage{
	
    WebDriver driver;
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']") 
	WebElement accountandlist_hoverover;
	
	@FindBy(xpath="//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
	WebElement profile;
	
	@FindBy(xpath = "//div[text()='Preferred department']")
	WebElement department;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add_button;
	
	@FindBy(id="a-popover-content-1")
	WebElement iframe;
	
	@FindBy(xpath = "//button[normalize-space()='Women']")
	WebElement women_button;
	
	
	
	@FindBy(linkText="View")
	WebElement view_link;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement edit_icon;
	
	@FindBy(id="editProfileNameInputId")
	WebElement edit_name;
	
	@FindBy(xpath="//input[@aria-labelledby='editProfileContinueButton-announce']")
	WebElement continue_button;
	
	public void account_list(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(accountandlist_hoverover).perform();
	}
	public void account_profile() {
		profile.click();
	}
	public void prefered_department() {
		department.click();
	}
	public void add_button() {
		add_button.click();
	}
	public void women_button(WebDriver driver) {
		driver.switchTo().frame(iframe);
		women_button.click();
	}
	
	public void view() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(view_link)).click();
	}
	public void edit() {
		edit_icon.click();
	}
	public void edit_profile_name() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(edit_name)).sendKeys("Ravi");

		
	}
	
	public void continue_button() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(continue_button)).click();
	}
	public ProfilePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
