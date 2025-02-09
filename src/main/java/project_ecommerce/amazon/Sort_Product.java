package project_ecommerce.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sort_Product {
	WebDriver driver;
	@FindBy(id="s-result-sort-select")
	WebElement sort;
	
	public void sort() {
		Select s = new Select(sort);
		s.selectByIndex(1);

		
		
	}
	public Sort_Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
