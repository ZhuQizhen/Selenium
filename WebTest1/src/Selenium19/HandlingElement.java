package Selenium19;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElement {
	public static void main(String args[]) throws InterruptedException{
		
		m8();
	}
	
	public static void m1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.jp/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		//String pageSource= driver.getPageSource();
		//System.out.println(pageSource);
		
		String windowHandle= driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		
		driver.close();
	}
	
	public static void m2(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.jp/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://login.yahoo.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.close();
	}

	public static void m3() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("leaf67698@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("identifier")).clear();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("leaf67697@gmail.com");
		
		
		//driver.findElement(By.className("CwaK9")).click();
		driver.close();
	}
	
	public static void m4(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		WebElement Email= driver.findElement(By.id("identifierId"));
		Email.sendKeys("123");
		//type of object
		System.out.println(Email.getAttribute("type"));
		//value
		System.out.println(Email.getText()); // ""
		//displayed status
		System.out.println(Email.isDisplayed());
		//enabled status
		System.out.println(Email.isEnabled());
		driver.close();
	}

	public static void m5(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		WebElement head= driver.findElement(By.id("headingText"));
		
		System.out.println(head.getText()); // ��½
		
		System.out.println(head.getTagName());//h1
		
		driver.close();
	}

	public static void m6(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		//WebElement userName = driver.findElement(By.id("login-username"));
		WebElement signIn= driver.findElement(By.id("login-signin"));
		signIn.click();
		String errorMessage = driver.findElement(By.id("username-error")).getText();
		System.out.println(errorMessage);
		
		//driver.close();
	}

//alert
	public static void m7(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement go = driver.findElement(By.name("proceed"));
		go.click();

		Alert alert = driver.switchTo().alert();
		String errorMessage =alert.getText();
		System.out.println(errorMessage);
		
		//alert.dismiss(); // for cancel
		alert.accept();    // for ok
		
		WebElement userName= driver.findElement(By.id("login1"));
		userName.sendKeys("CNM");
		
		driver.close();
	}

	public static void m8(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("leaf67697@gmail.com");
		
		driver.findElement(By.className("CwaK9")).click();
		
		WebElement passwordNext = driver.findElement(By.className("CwaK9"));
		passwordNext.click();
		
			
		
		////*[@id="password"]/div[1]/div/div[1]/input
		
		//driver.close();
	}
}
