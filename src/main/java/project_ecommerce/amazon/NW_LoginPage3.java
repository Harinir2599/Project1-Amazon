package project_ecommerce.amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NW_LoginPage3 {
	WebDriver driver;
	
	String username;
	String password;
	
	public static String[] excel_data() throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\1816775.INDIA\\eclipse-workspace\\amazon\\Excel\\LoginTestData.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		long mob_number = (long) w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue();
		String username = NumberToTextConverter.toText(mob_number);
		String password = w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println("My number is "+username);
		System.out.println("My password"+password);
		return new String[]{username, password};
		
	}
	@FindBy(id="ap_email")
	WebElement un;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pass;

	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement pass_button;
	
	
	public void email_id(WebDriver driver) {
		System.out.println("Passed value"+username);
		un.sendKeys(username);
	}
	public void sign_continue() {
		continue_button.click();
	}
	public void password(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys(password);
	}
	public void pass_submit() {
		pass_button.click();
	}
	public NW_LoginPage3(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
		 
	}

}
