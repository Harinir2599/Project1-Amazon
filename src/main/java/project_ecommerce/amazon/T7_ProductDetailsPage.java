package project_ecommerce.amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T7_ProductDetailsPage {
	WebDriver driver;
	@FindBy(xpath="(//a[@class=\"a-link-normal s-line-clamp-2 s-link-style a-text-normal\"])[1]")
	WebElement product1;
	
	@FindBy(css=".a-price-whole")
	WebElement price;
	
	@FindBy(css=".a-expander-content a-expander-partial-collapse-content")
	WebElement product_details;
	
	@FindBy(xpath="//span[text()='Special Feature']")
	WebElement special_feature;
	
	@FindBy(xpath="//span[text()='Operating System']")
	WebElement os;
	
	@FindBy(xpath="//span[text()='Battery Capacity']")
	WebElement battery_capacity;
	
	public void product(WebDriver driver) {
		product1.click();
		Set<String> pid =driver.getWindowHandles();
		Iterator<String> i = pid.iterator();
		String parent =i.next();
		String child=i.next();
		driver.switchTo().window(child);
		System.out.println("The parent session id"+parent);
		System.out.println("The child session id"+child);
	}
	public String product_details() {
		String Product_text = "Fire-Boltt Phoenix Ultra Luxury Stainless Steel, Bluetooth Calling Smart Watch, AI Voice Assistant, Metal Body with 120+ Sports Modes, SpO2, Heart Rate Monitoring (Gold)";
		
		String product_details_watch = price.getText();
		System.out.println("The product details of watch is "+product_details_watch);
		return product_details_watch;
	}
	
	public String price_detail() {
		String price_watch = price.getText();
		System.out.println("The Price of watch is "+price_watch);
		return price_watch;
	}
	public void special_feature_detail() {
		String special_feature_watch = special_feature.getText();
		System.out.println("The special feature of watch is "+special_feature_watch);
	}
	public void operating_system_detail() {
		String os_detail = os.getText();
		System.out.println("The os of watch is "+os_detail);
	}
	public void battery_capacity_detail() {
		String bc_detail = os.getText();
		System.out.println("The battery_capacity of watch is "+bc_detail);
	}
	public T7_ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
