package com.appiumTest;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import appiumTest.AppiumBasics;
import io.appium.java_client.android.AndroidDriver;

public class Login {

	public static AndroidDriver driver;

	private void performScrollUsingSequence(int startX, int endX, int startY, int endY) {
		PointerInput input = new PointerInput(PointerInput.Kind.MOUSE, "first-finger");
		Sequence sequence = new Sequence(input, 0)
				.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(input.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
				.addAction(input.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
				.addAction(input.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
		driver.perform(Collections.singletonList(sequence));
	}

	public void scrollDown() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = size.getWidth() / 2;
		int startY = size.getHeight() / 2;
		int endY = (int) (size.getHeight() * 0.25);
		performScrollUsingSequence(startX, endX, startY, endY);
	}

	private boolean isEndOfPage(String pageSource) {
		return pageSource.equals(driver.getPageSource());
	}

	public void scrollForVisualElement(By list, String attName, String text) {
		String previousPageSource = "";
		boolean flag = false;
		do {
			previousPageSource = driver.getPageSource();
			for (WebElement ele : driver.findElements(list)) {
				if (ele.getAttribute(attName).equalsIgnoreCase(text)) {
					ele.click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
			else
				scrollDown();
		} while (!isEndOfPage(previousPageSource) && flag == false);
	}

	public void selectGender(String male1) {
		List<WebElement> genderSelect = driver.findElements(By.xpath("//android.widget.RadioButton"));
		System.out.println("Tets 1");

		for (int i = 0; i < genderSelect.size(); i++) {
			System.out.println("Tets 4");
			String value1 = genderSelect.get(i).getAttribute("text");
			System.out.println("value1 in from loop" + value1);
		}

		for (WebElement webElement : genderSelect) {
			System.out.println("Tets 2");
			String value = webElement.getAttribute("text");
			System.out.println("value" + value);
			if (value.equals(male1)) {
				System.out.println("Tets 3");
				webElement.click();
				System.out.println("value   fff");
			}
		}

	}

//	public static AndroidDriver getDriver() {
//		return driver;
//	}

	@BeforeSuite
	public static AndroidDriver test() throws MalformedURLException {
		driver = AppiumBasics.setup();
		return driver;
	}

	@Test(priority = 1, groups = "login")
	public void test01() throws InterruptedException {
		Thread.sleep(8000);
		WebElement dropdown = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Spinner"));

		dropdown.click();
		Thread.sleep(2000);

		By element = By.xpath("//android.widget.ListView/android.widget.TextView");

		scrollForVisualElement(element, "text", "Canada");

	}

	@Test(priority = 2, groups = "login")
	public void test02() {
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"))
				.sendKeys("Rahul Test");
		
	}

	@Test(priority = 3, groups = "login")
	public void test03() {
		selectGender("Male");
	}

	@Test(priority = 4, groups = "login",testName = "testtest")
	public void test04() {
		driver.findElement(By.xpath("//android.widget.Button")).click();
	}

}
