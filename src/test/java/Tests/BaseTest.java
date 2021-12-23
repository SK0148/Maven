package Tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static  WebDriver driver;
	
	@BeforeClass
	public void initalization() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Slenium Jar\\Chrome_96\\chromedriver.exe");

		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
		
	}

}
