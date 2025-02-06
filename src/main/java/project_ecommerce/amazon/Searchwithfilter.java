package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchwithfilter {
	WebDriver driver;
	
	@FindBy(xpath="//a[@aria-label='Apply the filter Get It by Tomorrow to narrow results']//i[@class='a-icon a-icon-checkbox']")
	WebElement delivery_filter;
	
	@FindBy(xpath="//a[@aria-label='Apply the filter Fastrack to narrow results']/descendant::i")
	WebElement brand_filter;
	
	@FindBy(xpath="//span[text()=\"Women's Watches\"]")
	WebElement women_watch;
	
	public WebElement Fastrack_brand() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(brand_filter)).click();
		return brand_filter;
	}
	
	public WebElement  Deliverydate_Filter() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(delivery_filter)).click();
		return delivery_filter;
		
	}
	public void Womens_Watch(){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(women_watch)).click();
	}
	
	
	public Searchwithfilter(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
