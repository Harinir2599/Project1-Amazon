package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T11_CheckOutPage_Test {
	WebDriver driver;
	@Test
	public void testcase() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		T2_LoginPage2 l = new T2_LoginPage2(driver);
		l.email_id(driver);
		l.sign_continue();
		l.password(driver);
		l.pass_submit();
		
		T5_Productsearch p = new T5_Productsearch(driver);
		p.search_product();
				
		T9_Shopping_cart sc = new T9_Shopping_cart(driver);
		sc.cart();
		sc.item_in_cart();
		
		T11_CheckOut_page cp = new T11_CheckOut_page(driver);
		cp.procced_to_buy();
		cp.use_payment_method();
		cp.review_method();
		
		WebElement w1 = driver.findElement(By.xpath("(//input[@id='placeOrder'])[1]"));
		boolean b1 = w1.isDisplayed();
		Assert.assertEquals(b1, true);
		
		driver.quit();
	}

}
