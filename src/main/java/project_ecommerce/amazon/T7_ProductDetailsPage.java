package project_ecommerce.amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T7_ProductDetailsPage {
	WebDriver driver;
	
	
	@FindBy(css=".a-price-whole")
	WebElement price;
	
	@FindBy(xpath="//td[@class='a-span9']")
	List<WebElement> product_print;
	
	@FindBy(css=".a-expander-content a-expander-partial-collapse-content")
	WebElement product_details;
	
	
	
@FindBy(css="h2.a-size-base-plus.a-spacing-none.a-color-base.a-text-normal")
List<WebElement> product_selection;
	
	
	public void product_details() {
		String Product_expected_text = "SUGAR POP Ultrastay Transferproof Matte Lipstick 02 Floral Fantasy - 4 Gms - Enriched With Vitamin E | Smooth Glide | Waterproof | Longlasting";
        
        for (WebElement product :product_selection ) {
            String product_actual_text = product.getText().trim();
            //System.out.println(product_actual_text); 

            if (product_actual_text.equals(Product_expected_text)) {
                System.out.println("The product is present");
                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(product)).click();
                switchToNewTab(driver);
                
            }
	}
	}
	public void switchToNewTab(WebDriver driver) {
		Set<String> pid =driver.getWindowHandles();
		Iterator<String> i = pid.iterator();
		String parent =i.next();
		String child=i.next();
		driver.switchTo().window(child);
		System.out.println("The parent session id"+parent);
		System.out.println("The child session id"+child);
	}

	
	public String price_detail() {
		String price_lip = price.getText();
		System.out.println("The Price of product is "+price_lip);
		return price_lip;
	}
	public void product_complete_detail() {

            for(WebElement products:product_print) {
            	
			String product_des=products.getText();
			System.out.println("The Product details are"+product_des);
		}
	}
	public T7_ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
