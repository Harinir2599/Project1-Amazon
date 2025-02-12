package project_ecommerce.amazon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testng_listener.class)
public class T15_CartPage_without_LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        Testng_listener.setDriver(driver); 
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    

    @Test
    public void testcase() {
        T5_Productsearch p = new T5_Productsearch(driver);
        p.search_product();

        T9_Shopping_cart sc = new T9_Shopping_cart(driver);
        sc.cart();
        sc.item_in_cart();

        T11_CheckOut_page cp = new T11_CheckOut_page(driver);
        cp.procced_to_buy();
        WebElement w1 = driver.findElement(By.id("ap_email"));
        boolean b1 = w1.isDisplayed();

        Assert.assertEquals(b1, true);
    }
    @AfterMethod
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
