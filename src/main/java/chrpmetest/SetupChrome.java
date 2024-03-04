package chrpmetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SetupChrome {
	 static WebDriver driver;
	
	
		/*
		 * public static WebDriver getDriver() { return driver; }
		 */
//	public static WebDriver setUpChrome() {
//	driver=new ChromeDriver();
//	return driver;
//	}
//	
//	@Test(groups="ABC")
//	public void loadpage() {
//		setUpChrome();
//		driver.get("https://www.google.com/");
//	}
	
	
	
	
//	 private static WebDriver driver;

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    @BeforeClass
	    public static void setUpChrome() {
	        driver = new ChromeDriver();
	    }

	    @Test(groups = "ABC")
	    public void loadPage() {
	       // getDriver().get("https://www.google.com/");
	        driver.get("https://www.google.com/");
	    }
	
	
}
