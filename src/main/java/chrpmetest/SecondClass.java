package chrpmetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondClass extends SetupChrome{
	//static WebDriver driver=SetupChrome.setUpChrome();
	
	@Test(priority = 1, dependsOnGroups = "ABC")
	public void test1() {
		String value1=driver.getTitle();
		System.out.println(value1);
	}
	
	@Test(priority = 2, dependsOnGroups = "ABC")
	public void test2() {
		String value2=driver.getTitle();
		System.out.println(value2);
	}
	
	@Test(priority = 3, dependsOnGroups = "ABC")
	public void test3() {
		String value3=driver.getTitle();
		System.out.println(value3);
	}
	
	@Test(priority = 4, dependsOnGroups = "ABC")
	public void test4() {
		String value4=driver.getTitle();
		System.out.println(value4);
	}
	
	
//	 private WebDriver driver;
//		
//	 @BeforeClass
//		  public void setUp() { driver = SetupChrome.getDriver(); }
//		 
//	    @Test(priority = 1, dependsOnGroups = "ABC")
//	    public void test1() {
//	        String value1 = driver.getTitle();
//	        System.out.println(value1);
//	    }
//
//	    @Test(priority = 2, dependsOnGroups = "ABC")
//	    public void test2() {
//	        String value2 = driver.getTitle();
//	        System.out.println(value2);
//	    }
//
//	    @Test(priority = 3, dependsOnGroups = "ABC")
//	    public void test3() {
//	        String value3 = driver.getTitle();
//	        System.out.println(value3);
//	    }
//
//	    @Test(priority = 4, dependsOnGroups = "ABC")
//	    public void test4() {
//	        String value4 = driver.getTitle();
//	        System.out.println(value4);
//	    }
	
	

}
