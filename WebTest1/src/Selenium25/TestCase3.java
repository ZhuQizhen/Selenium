package Selenium25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//using user defined methods/reusable components 

public class TestCase3 {
	
	public void adminLogin(String username, String password)
	{
		driver.get("http://www.gcrit.com/build3/admin/");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();

	}
	static WebDriver  driver;
	public void launchBrowser()
	{
		driver =new FirefoxDriver();
	}
	public void closeBrowser()
	{
		if(!driver.toString().contains("null") )
		{
			driver.close();
		}
	}
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		
		TestCase3 obj = new TestCase3();
		obj.launchBrowser();
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();
		obj.launchBrowser();
		obj.adminLogin("admin", "admin@1234");
		obj.closeBrowser();
	}
}
