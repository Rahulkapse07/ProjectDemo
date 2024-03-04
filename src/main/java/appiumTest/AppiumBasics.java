package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
	       setup();
		

	}
	public static AndroidDriver setup() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
	      //  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	     //   caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	      // caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S 21");
	        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        caps.setCapability(MobileCapabilityType.APP, "C:/Users/rahul/Downloads/General-Store.apk");
	        //caps.setCapability("appPackage", "com.androidsample.generalstore");
	        caps.setCapability("noReset","true");
	       
	        URL url=new URL("http://127.0.0.1:4723");

	        driver = new AndroidDriver(url, caps);
	        
	        System.out.println("Connected to Appium");
	        return driver;
	}

}
