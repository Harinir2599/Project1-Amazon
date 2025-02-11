package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T6_Searchwithfilter {
	WebDriver driver;
	
	@FindBy(css="a[aria-label='Apply the filter Matrix to narrow results'] i[class='a-icon a-icon-checkbox']")
	WebElement matrix_filter;
	
	@FindBy(xpath="//a[@aria-label='Apply the filter Titan to narrow results']//i[@class='a-icon a-icon-checkbox']")
	WebElement brand_filter;
	
	@FindBy(xpath="//span[text()=\"Women's Watches\"]")
	WebElement women_watch;
	
	public void Titan_brand() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(brand_filter)).click();
		//return brand_filter.isSelected();
	}
	
	public void  matrix_filter_brand() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(matrix_filter)).click();
		//return matrix_filter.isSelected();
		
	}
	
	
	public void Womens_Watch(){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(women_watch)).click();
	}
	
	
	public T6_Searchwithfilter(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
