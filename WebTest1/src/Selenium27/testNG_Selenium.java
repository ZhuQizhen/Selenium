package Selenium27;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Selenium {
	WebDriver driver;
	// only 2 test cases, before each launchBrowser is executed
	// and after each closeBrowser is executed.
	@BeforeMethod
	public void launchBrowser()
	{
		driver =new FirefoxDriver();
	}
	
	@Test(priority = 1)
	public void verifyPageTitle1()
	{
		driver.get("https://www.gmail.com/");
		Assert.assertEquals("Gmail", driver.getTitle());
	}
	
	@Test(priority = 2)
	public void verifyPageTitle2()
	{
		//driver.navigate().to("https://in.yahoo.com/");
		driver.get("https://in.yahoo.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
