package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumParellelTesting {
	//public static AppiumDriver driver;
	//public static WebDriver webDriver;
	 //AppiumDriverLocalService service;
	//public Logger log = LogManager.getLogger(this.getClass().getName());
	public static String capabilityName = System.getProperty("capabilityName", "Galaxy S21 5G");
	//public static String browserName = System.getProperty("browser", "Chrome");
	
	
public static AppiumDriver androidDriver;
	
	public Logger log = LogManager.getLogger(this.getClass().getName());
	//DealerCode_PO dealercode=new DealerCode_PO(androidDriver);
	
	
	 // @BeforeMethod
	//@BeforeClass
	public void setUpAndroid() {

		

		try {

			DesiredCapabilities capabalities = new DesiredCapabilities();
			UiAutomator2Options options =new UiAutomator2Options();
			options.setPlatformName("Android");
			options.setApp("C:\\Users\\Public\\RCTruvideoflutter.apk");
			

			
			capabalities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			capabalities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabalities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 5G");
			//capabalities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Public\\RCTruvideoflutter.apk");

			 capabalities.setCapability("appPackage", "com.sec.android.app.camera");
			
			capabalities.setCapability("noReset", "false");
			capabalities.setCapability("autoGrantPermissions", "true");

			URL url = new URL("http://127.0.0.1:4723");
			androidDriver = new AppiumDriver(url, options);

		// implicit wait
			androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		} catch (Exception exp) {
			log.info("Cause is : " + exp.getCause());
			log.info("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
		
		
		log.info("Connected to Appium Server, Launching Android App. . .");
		
		//dealercode.enterDealerCodeRO();
	  }

//	
//	public AppiumDriver setUpApplication() throws MalformedURLException, Exception {
//		System.out.println(capabilityName);
//		//startAppiumService();
//		
//		
//		
//		
//		try {
//			DesiredCapabilities capabilities=new DesiredCapabilities();
//			capabilities.setCapability("platformName", "Android");
//			capabilities.setCapability("automationName", "UiAutomator2");
//			capabilities.setCapability(capabilityName, capabilities);
//			capabilities.setCapability(capabilityName, capabilities);
//			capabilities.setCapability(capabilityName, capabilities);
//			capabilities.setCapability(capabilityName, capabilities);
//			 driver = new AppiumDriver(new
//			 URL("http://127.0.0.1:4723"),CapabilityReader.getDesiredCapabilities(capabilityName,"./Capabilities.json"));
//			//driver = new AppiumDriver(service,
//				//	CapabilityReader.getDesiredCapabilities(capabilityName, "./Capabilities.json"));
//			log.info("Capability file read....");
//			
//			
//		} catch (Exception e) {
//			log.info("Error in Reading Capabilities from Json File ");
//			e.printStackTrace();
//		}
//		if (driver != null) {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			log.info("Connected to Appium Server, Launching Application. . .");
//			return driver;
//		} else {
//			log.error("Driver is null. Unable to connect to Appium Server or Launch Application.");
//		}
//		return driver;
	///}
	
	@Test
public void test1() throws MalformedURLException, Exception
{
		setUpAndroid();
	System.out.println("Just testing");
	androidDriver.findElement(AppiumBy.accessibilityId("2")).click();
	androidDriver.findElement(AppiumBy.accessibilityId("4")).click();
	androidDriver.findElement(AppiumBy.accessibilityId("7")).click();
	androidDriver.findElement(AppiumBy.accessibilityId("3")).click();
	androidDriver.findElement(AppiumBy.accessibilityId("0")).click();
	androidDriver.findElement(AppiumBy.accessibilityId("1")).click();
}

}
