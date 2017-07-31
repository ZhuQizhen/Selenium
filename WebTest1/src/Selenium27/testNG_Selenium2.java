package Selenium27;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG_Selenium2 {
	WebDriver driver;
	// only 2 test cases, before them, launchBrowser will be executed once,
	//after them, closeBrowser will be executed once
	@BeforeClass
	public void launchBrowser()
	{
		driver =new FirefoxDriver();
	}
	
	@Test
	public void verifyPageTitle1()
	{
		driver.get("https://www.gmail.com/");
		Assert.assertEquals("Gmail", driver.getTitle());
	}
	
	@Test
	public void verifyPageTitle2()
	{
		//driver.navigate().to("https://in.yahoo.com/");
		driver.navigate().to("https://in.yahoo.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
