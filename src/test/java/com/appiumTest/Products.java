package com.appiumTest;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appiumTest.AppiumBasics;
import chrpmetest.SetupChrome;
import io.appium.java_client.AppiumDriver;

public class Products {

	public static AppiumDriver driver;

	@org.testng.annotations.BeforeClass()
	public void setUp() throws MalformedURLException {
		driver = Login.test();
		// driver=AppiumBasics.setup();
	}

	@Test(priority = 1, dependsOnGroups = "login")
	public void test01() throws InterruptedException, MalformedURLException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Air Jordan 4 ')]")).click();

		List<WebElement> cart = driver
				.findElements(By.xpath("//android.widget.TextView[contains(@text,'ADD TO CART')]"));
		for (int i = 0; i < cart.size(); i++) {
			String text = cart.get(i).getText();
			System.out.println("text value " + text);

		}
		cart.get(0).click();

	}

	@AfterSuite
	public void teatDown() {
		 System.out.println("Before quitting the driver");
		    try {
		        if (driver != null) {
		            driver.quit();
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    System.out.println("After quitting the driver");
	}

}
