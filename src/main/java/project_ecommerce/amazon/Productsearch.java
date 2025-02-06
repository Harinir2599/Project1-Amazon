package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Productsearch {
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public void search_product() {
		search.sendKeys("Watch"+Keys.ENTER);
	}
	
	public Productsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
