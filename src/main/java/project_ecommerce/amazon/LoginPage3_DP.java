package project_ecommerce.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage3_DP {
    WebDriver driver;

    @FindBy(id = "ap_email")
    WebElement un;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement continue_button;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement pass;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement pass_button;

    public LoginPage3_DP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void email_id(String username) {
        System.out.println("Passed value: " + username);
        un.sendKeys(username);
    }

    public void sign_continue() {
        continue_button.click();
    }

    public void password(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys(password);
    }

    public void pass_submit() {
        pass_button.click();
    }
}
