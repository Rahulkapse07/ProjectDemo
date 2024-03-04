package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileBrowser {
	
	public AppiumDriver driver;
	
	//@BeforeTest
	@Test
	public void luanchchrome() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("Device Name", "Galaxy S 21");
		//caps.setCapability("appPackage", "com.zoomcar");
		caps.setCapability("app", "C:\\Users\\Public\\Zoomcar.apk");
		//caps.setBrowserName("chrome");
		//caps.setCapability("app", "http://10.65.5.167:8080/job/Lime%20iPad/ws/build/artifacts/LimeDemo-2.ipa");
		//caps.setCapability("bundleId", "com.sec.android.app.camera");
	
	//UiAutomator2Options options =new UiAutomator2Options();
	//options.setPlatformName("Android");			
	//options.setDeviceName("Galaxy A13").withBrowserName("chrome");
	//options.setDeviceName("Galaxy A13").setApp("https://appdistribution.firebase.google.com/testerapps/1:413279949394:android:73fc9c80bbc2bf597b458b/releases/2m0cnfuaj40no?utm_source=firebase-console");
	
	
	
	
	
    URL url = new URL("http://127.0.0.1:4723");
	//driver = new AppiumDriver(url, options);
	driver = new AppiumDriver(url, caps);
	
	ChromeOptions options = new ChromeOptions();
	//options.addExtensions(new File("/path/to/extension.crx"));
	ChromeDriver driver1 = new ChromeDriver(options);
	driver1.get("www.google.com");
	
	//boolean isAppInstalled =new isAppInstalled("com.zoomcar");
	
	
	//driver.get("https://rc.truvideo.com/reports/home");
	Thread.sleep(10000);

	System.out.println("Testing browser");
	//driver.findElement(By.xpath("//input[@placeholder='Email/Username']")).sendKeys("rahul.kapse@5exceptions.com");
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("rahul.kapse@5exceptions.com");
	
	
	}
	
	public void swipeLeft_quarter() {
	    Dimension size = driver.manage().window().getSize();
	    int startX = size.getWidth() * 3 / 4; // Swipe from 75% of the width
	    int endX = size.getWidth() / 4;       // Swipe to 25% of the width
	    int startY = size.getHeight() / 2;     // Swipe vertically at the middle of the screen
	    int endY = size.getHeight() / 2;       // Swipe vertically at the middle of the screen
	    performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	private void performScrollUsingSequence(int startX, int endX, int startY, int endY) {
		PointerInput input = new PointerInput(PointerInput.Kind.MOUSE, "first-finger");
		Sequence sequence = new Sequence(input, 0)
				.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(input.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
				.addAction(input.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
				.addAction(input.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
		driver.perform(Collections.singletonList(sequence));
	}

	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("Testing browser");
		swipeLeft_quarter();
		swipeLeft_quarter();
		swipeLeft_quarter();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='GET STARTED']")).click();
	}
	
}
