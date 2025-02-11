package project_ecommerce.amazon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T3_LoginPage3_Dp_test {
    WebDriver driver;
    @DataProvider(name="login")
	public Object[][] logindetails()
	{
	Object data[][]=new Object[5][2];	
		//set 1->login with valid email id and password
		data[0][0]="hariniravi25.hr@gmail.com";//un 1
		data[0][1]="Tejas@2024"; //pwd0
		//set 2-0>login with valid mobile no and password
		data[1][0]="9025371260";//un 2
		data[1][1]="Tejas@2025"; //pwd
		//set 3-valid mobile no and wrong password
		data[2][0]="9025371260";//un 3
		data[2][1]="250799"; //pwd
		//set 4-invalid mobile no and correct password
		data[3][0]="90257896";//un
		data[3][1]="Tejas@2025"; //pwd
		//set 5->wrong username and wrong password
		data[4][0]="90257896";//un
		data[4][1]="6543tre"; //pwd
		return data;	
	}
    @Test(dataProvider = "login")
    public void testcase(String username, String password) throws IOException {
    	driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        T3_LoginPage3_DP login = new T3_LoginPage3_DP(driver);

        // Perform Login
        login.email_id(username);
        login.sign_continue();
        login.password(password);
        login.pass_submit();

        
    }
}
