package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import Tests.BaseTest;

public class TestNgListeners1 extends BaseTest implements ITestListener{

	
	

	@Override
	public void onTestFailure(ITestResult result) {
	
		
		System.out.println("On test Failure");
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File source=tsc.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(System.getProperty("user.dir")+"\\snap4.png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	

}
