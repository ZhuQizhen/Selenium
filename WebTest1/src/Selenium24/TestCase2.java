package Selenium24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase2 {
	public static void main(String args[])
	{
		m4();
	}
	
	public static void m1()
	{
		//Check admin login functionality in gcrShop web portal(Positive Test Case, we use valid input)
		
		//Test steps
		//1.launch the browser
		//2.navigate to gcrShop Admin Interface
		//3.enter valid user name
		//4.enter valid password
		//5.click login button
		
		//verification point
		//1.capture the url and compare with expexted  
		String expected = "http://www.gcrit.com/build3/admin/index.php";
		
		//Test Data
		//User name = admin
		//Password  = admin@123
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals(expected)){
			System.out.println("Admin Login Successfully -Passed");
		}
		else
		{
			System.out.println("Admin Login Unsuccessfully -Failed");
		}
		driver.close();
	}
	public static void m2()
	{
		//Check error message in gcrShop Admin login web portal(Negative Test Case)
		
		//Test steps
		//1.launch the browser
		//2.navigate to gcrShop Admin Interface
		//3.enter invalid user name or invalid password
		//4.click login button
		
		//verification point
		//1.capture the error message and compare with the expected.  
		String expected = " Error: Invalid administrator login attempt.";
		
		//Test Data
		//User name = admin
		//Password  = admin@123
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@1234");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
		if(url.equals(expected)){
			System.out.println("Handling Invalid Inputs  -Passed");
		}
		else
		{
			System.out.println("Not Handling Invalid Inputs   -Failed");
		}
		driver.close();

	}
	public static void m3()
	{
		//combine m1 and m2
		
		//test steps
		//1.launch the browser
		//2.navigate
		//3.enter valid user name
		//4.enter valid password
		//5.click login button
		//*repeat the navigation with invalid data
		
		//verification points
		//1.capture the url and compare with expected
		
		
		m1();
		m2();
		
		//negative scenarios
		//1.invalid username and invalid password
		//2.invalid username and valid password
		//3.valid username and invalid password
		//4.blank username and invalid/valid password
		//5.invalid/valid username and blank password
		//6.blank username and blank password
	}
	
	public static void m4()
	{
		//find the maximum login attemps (invalid inputs)

		//Test steps
		//1.launch the browser
		//2.navigate to gcrShop Admin Interface
		//3.enter invalid user name or invalid password
		//4.click login button
		//5.if not get maximum message, go to step 3
		
		
		//verification point
		//1.capture the error message and compare with the expected.  
		String maximum = " Error: The maximum number of login attempts has been reached. Please try again in 5 minutes.";
		
		//Test Data
		//User name = admin
		//Password  = admin@123
		int count =0;
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		while(true){
			count+=1;
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@1234");
			driver.findElement(By.id("tdb1")).click();
		
			String url = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
			
			if(url.equals(maximum)){
				System.out.println("The maximum login attemps is " + count);
				break;
			}
		}
		
		driver.close();

		
	}



}
