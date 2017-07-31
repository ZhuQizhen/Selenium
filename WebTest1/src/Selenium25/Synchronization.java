package Selenium25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Synchronization {
//1)what is synchronization?
//process of coordinating or matching two or more activities/devices/processes in time
	
//process of matching the speeds of AUT(application Under test) and test tool in order to get 
//proper execution

//2)Why synchronization is required?
//During test execution, test tool gives instructions one by one with same speed, but AUT
//takes less time for some steps execution and more time for some other steps. In order
//to keep them in Sync, Synchronization is required.

//3)types of Sync
//a)unconditional Sync
//In this we specify timeout value, we will make the tool to wait certain amount of time and
//then proceed.
//Thread.sleep()
//b)conditional Sync
//It will not work for all commands/statements in the application
//It works only for findElement and findElements in the application
//dirver.manage.timeouts.implicitlyWait(Time in Seconds, TimeUint.SECONDS);

	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.co.jp");
		
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();
		
	}
}
