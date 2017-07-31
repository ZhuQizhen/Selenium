package Selenium23;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;


public class TestCase {
	public static void main(String args[]){
		m4();
	}

	
	public static void m1()
	{
		//verify Internal and External links in wikipedia.org
		//internal : redirects to another page or location in the same application
		//external : redirects to another page or location in another application		
		
		//steps
		//1.launch the browser
		//2.navigate to wikipedia
		//3.click 'create account' link
		//4.capture url
		//5.navigate back
		//6.click  'wikibooks' lick
		//7.capture url
		//8.close browser
		
		//verification points
		//1.check if the 1st url is an internal link or not
		//2.check if the 2nd url is an external link or not
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		WebElement element0 = driver.findElement(By.linkText("Create account"));

		element0.click();
		String urlCrea = driver.getCurrentUrl();
		//System.out.println(urlCrea);
		if(urlCrea.contains("wikipedia.org"))
		{
			System.out.println("It is an Internal link- Redirected ti another page in the same application -Passed");
		}
		else
		{
			System.out.println("It is an External link- Redirected ti another page in another application -Failed");			
		}
		
		
		driver.navigate().back();
		
		WebElement element1 = driver.findElement(By.linkText("Wikibooks"));

		element1.click();
		String urlBook = driver.getCurrentUrl();
		//System.out.println(urlBook);
		if(urlBook.contains("wikipedia.org"))
		{
			System.out.println("It is an Internal link- Redirected ti another page in the same application -Failed");
		}
		else
		{
			System.out.println("It is an External link- Redirected ti another page in another application -Passed");			
		}
		
		
		driver.close();
	}


	public static void m2()
	{
		//verify element existence(gmail link existence in google home page)
		
		//test steps
		//1.lanch the browser
		//2.navigate to google home page
		
		//verify point
		//1.check the existence of gmail link
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.jp");
		
		String linkText0 = "Gmail";
		try
		{
			if(driver.findElement(By.linkText(linkText0)).isDisplayed() )
			{
				System.out.println(linkText0+" link exists-- Passed");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println(linkText0+" link Not exists-- Failed");
		}
		
		driver.close();
	}

	public static void m3()
	{
		//login  with some verifying code
		
		WebDriver driver = new FirefoxDriver();
		driver.get("");  // navigate
		
		//input username and password
		//....
		
		
		//input captcha (by hand)
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Capcha");
		String captcha =scan.nextLine();
		scan.close();
		captcha.getClass();
		//input captcha
		
		//click or submit
		
		//check something
		
				
		driver.close();
	}

	public static void m4()
	{
		//verify customer Registration in gcrShop web portal
		
		//test steps
		//1.launch the browser
		//2.navigate
		//3.Enter all mandatory fields
		//4.click "Continue" button
		
		//verification points
		//1.capture conformation message and compare with expected
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");  // navigate
		driver.findElement(By.linkText("create an account")).click();
		
		//male radio box
		driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		//First Name input
		driver.findElement(By.name("firstname")).sendKeys("Zhu");
		//Last Name input
		driver.findElement(By.name("lastname")).sendKeys("Qizhen");
		
		//date of brith
		driver.findElement(By.id("dob")).sendKeys("06/05/1993");
	
		//email
		driver.findElement(By.name("email_address")).sendKeys("leaf67697@gmail.com");
		
		//company
		driver.findElement(By.name("company")).sendKeys("titech");
		
		//address
		driver.findElement(By.name("street_address")).sendKeys("Nagatsuta House");
		
		//suburb
		driver.findElement(By.name("suburb")).sendKeys("Nagatsuta");
		
		//postcode
		driver.findElement(By.name("postcode")).sendKeys("2260018");
		
		//city
		driver.findElement(By.name("city")).sendKeys("Yokohama");
		
		//state
		driver.findElement(By.name("state")).sendKeys("Kanagawa");
		
		//country
		Select dropDown = new Select (driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("Japan");
		
		//tel
		driver.findElement(By.name("telephone")).sendKeys("08046206478");
		
		//fax
		driver.findElement(By.name("fax")).sendKeys("12138");
		
		//newsletter
		driver.findElement(By.name("newsletter")).click();
		
		//password
		driver.findElement(By.name("password")).sendKeys("DDdd930605FFff");
		
		//confirmation
		driver.findElement(By.name("confirmation")).sendKeys("DDdd930605FFff");
		
		//submit
		driver.findElement(By.id("tdb4")).click();
	
		String conformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
	
		if(conformationMessage.equals("Your Account Has Been Created!"))
		{
			System.out.println("Customer Registration Sucessful - Passed");
		}
		else
		{
			System.out.println("Customer Registration Unsucessful - Failed");
		}
		
		driver.close();
	}
	
	
	
}
