package project_ecommerce.amazon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class T5_ProductsearchTest {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void amazon_link(String nameofbrowser) {
        if (nameofbrowser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (nameofbrowser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }

    @Test
    public void testcase() {
        T2_LoginPage2 l = new T2_LoginPage2(driver);
        l.email_id(driver);
        l.sign_continue();
        l.password(driver);
        l.pass_submit();

        T5_Productsearch p = new T5_Productsearch(driver);
        p.search_product();

        WebElement w1 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")); 
        boolean b1 = w1.isDisplayed();
        Assert.assertEquals(b1, true);
    }

    @AfterMethod
    public void logout() {
        if (driver != null) {
            driver.quit();
        }
    }
}
