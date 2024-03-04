//package com.TruVideo_Enterprise;
//
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import appiumTest.AppiumBasics;
//import io.appium.java_client.android.AndroidDriver;
//
//public class DealerCode {
//	public static AndroidDriver driver;
//	
//	@BeforeSuite
//	public static AndroidDriver test() throws MalformedURLException {
//		driver = AppiumBasics.setup();
//		return driver;
//	}
//
//	@Test(priority = 1, groups = "login")
//	public void test01() throws InterruptedException {
//		Thread.sleep(8000);
//		
//
//		
//
//	}
//
//	@Test(priority = 2, groups = "login")
//	public void test02() {
//		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"))
//				.sendKeys("Rahul Test");
//	}
//
//	@Test(priority = 3, groups = "login")
//	public void test03() {
//		//selectGender("Male");
//	}
//
//
//}
