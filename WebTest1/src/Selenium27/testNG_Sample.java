package Selenium27;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class testNG_Sample {
	
	@Test (enabled = false)
	public void verifyTitle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Gmail");
		driver.close();
	}	
	//main method is not used for testNG program
	//testNG programs contains only methods that contain @Test Annotations
	//if no @Test, then the methods are not going to be executed
	
	//all the case are executed in alphabet order
	//we can use priority attribute to control the execution order.
	
	@Test (priority = 1) // default 0
	public void b()
	{
		
	}
	
	@Test (priority = 2, enabled= true) //default true
	public void a()
	{
		
	}
	
	@Test(priority = 2, dependsOnMethods={"a"}) // if a is not executed before, there will be error 
	public void c()
	{
		
	}
	
	
	@Test ()
	public void e()
	{
		Assert.assertEquals("1","0");
	}
	
	//hard dependency
	@Test (dependsOnMethods={"e"}) //  e() failed, and then f() will be skipped
	public void f()
	{
		
	}
	
	//soft dependency
	@Test (dependsOnMethods={"e"}, alwaysRun= true) //e() failed, but g() will not be skipped
	public void g()
	{
		
	}
}
