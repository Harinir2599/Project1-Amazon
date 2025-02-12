package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T6_SearchwithfilterTest {
	@Test
	public void testcase() {
		EdgeOptions options= new EdgeOptions();
		options.addArguments("--inprivate");
		
		WebDriver driver = new EdgeDriver(options);
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
		
		T6_Searchwithfilter s = new T6_Searchwithfilter(driver);
		s.Titan_brand();
		s.matrix_filter_brand();
		s.Womens_Watch();
		
		WebElement w1 = driver.findElement(By.xpath("//a[@aria-label='Apply the filter Titan to narrow results']//i[@class='a-icon a-icon-checkbox']"));
		boolean b1 = w1.isSelected();
		System.out.println(b1);
		//Assert.assertEquals(b1, true);
		
		/*
		 * boolean b1 = matrix_filter_brand(); Assert.assertEquals(b1, true); boolean b2
		 * = s.Titan_brand(); Assert.assertEquals(b2, true);
		 */
		 
		driver.quit();
		
		
		
	}

}
