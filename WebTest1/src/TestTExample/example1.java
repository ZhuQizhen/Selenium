package TestTExample;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;



public class example1 {
	public static void main(String[] args){
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.baidu.com");
//		WebElement element = driver.findElement(By.name("wd"));
//		element.sendKeys("Cheese!");
//		element.submit();
//		System.out.println(driver.getTitle());
//		driver.quit();
		
		//first
//		WebDriver driver =new FirefoxDriver();
//		driver.get("http://mail.zju.edu.cn/");
//		driver.findElement(By.id("uid")).sendKeys("3120104907@zju.edu.cn");
//		driver.findElement(By.name("password")).sendKeys("DDdd930605FFff");
//		driver.findElement(By.name("action:login")).click();
				
//		String url=driver.getCurrentUrl();
//		String pattern="https://mail.zju.edu.cn/coremail/XJS/index.jsp\\?sid=.*";
//		if(Pattern.matches(pattern, url))
//			System.out.println("Passed");
//		else
//			System.out.println(url);
//		
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getPageSource());		
//
		
		
//		navigation methods:
//		loads into a new page in current window
//		driver.navigate().to("http://www.baidu.com");
		
//		a single back/forward/refresh in browser history 

//		driver.navigate().back();
		
//		driver.navigate().forward();
		
//		driver.navigate().refresh();


//		super blue bird
		WebDriver driver= new FirefoxDriver();
		driver.get("http://xyq.cbg.163.com/cgi-bin/query.py?&act=query&server_id=378");
		
		//wait for expected element to appear
		//WebDriverWait wait = new WebDriverWait(driver, 5);// 1s
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("advance_search_box")));
		//
		//second method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		WebElement inputStr=driver.findElement(By.id("advance_search_box"));
		inputStr.sendKeys("³¬¼¶Çàð½");
		//click() and submit()
		
		//submit() can be executed on any element of the form, but js may be ignored
		//so use click()
		driver.findElement(By.xpath("/html/body/div[29]/div[2]/div/form/input[2]")).click();		
		
		
		if(!doesWebElementExist(driver,By.className("cRed")))
		{
			String[] url=driver.getCurrentUrl().split("query_order=");
			
			String URL=url[0]+"query_order=price+ASC"+url[1];
			driver.navigate().to(URL);
		}
		else
			System.out.println("wait");
		//WebElement element = driver.findElement(By.name("wd"));
		//element.sendKeys("Cheese!");
		//clear the value
		//element.clear();
		
		//check is enabled or not
//		element.isEnabled();
//		element.isDisplayed();
//		element.isSelected();
		
		
//		driver.manage().window().getSize()
		
//		driver.close();
		
//		close all browsers that opened by webdriver during execution		
//		driver.quit();
	}
	
	public static boolean doesWebElementExist(WebDriver driver, By selector)
	{ 
	        try { 
	                driver.findElement(selector); 
	               return true; 
	        } catch (NoSuchElementException e) { 
	            return false; 
	        } 
	 } 
}
