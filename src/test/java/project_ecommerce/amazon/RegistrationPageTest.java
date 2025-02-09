package project_ecommerce.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class RegistrationPageTest {
	@Test
	public void testcase() {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	    String url1 = driver.getCurrentUrl();
	    System.out.println(url1);
	    RegistrationPage p = new RegistrationPage(driver);
	    p.name();
	    p.ph_number();
	    p.password();
	    p.button_continue();
	    String url2 = driver.getCurrentUrl();
	    System.out.println(url2);
	    //WebElement w1 = driver.findElement(By.id("auth-pv-enter-code"));
	    //boolean b1 = w1.isDisplayed();
	    Assert.assertNotEquals(url1, url2);
	    //Assert.assertEquals(b1, true);
	    
	    
	    
		
	}

}
