package Selenium25;

import org.openqa.selenium.By;

public class TestCase3_1 extends TestCase3{

	
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		//test case: redirect to user interface from admin interface
		
		TestCase3_1 object =new TestCase3_1();
		
		object.launchBrowser();
		
		object.adminLogin("admin", "admin@123");
		
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/"))
		{
			System.out.println("Redirected to User Interface -Passed");
		}
		else
		{
			System.out.println("Not Redirected to User Interface -Failed");
		}
		
		object.closeBrowser();
	}
}
