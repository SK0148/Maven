package Tests;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.LoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestClass extends BaseTest {
	String url="https://opensource-demo.orangehrmlive.com/";
	
	LoginPageClass lpg;	

	

	@Test 
	public void navigate() {
		
		driver.get(url);
		
	}
	
	@Test (dependsOnMethods="navigate")
	public void login() {
		
		lpg=new LoginPageClass(driver);
		lpg.login();
		Assert.assertFalse(true);
	}

}
