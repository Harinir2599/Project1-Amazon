package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class T5_Productsearch {
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public void search_product() {
		search.sendKeys("LipStick"+Keys.ENTER);
	}
	
	public T5_Productsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
