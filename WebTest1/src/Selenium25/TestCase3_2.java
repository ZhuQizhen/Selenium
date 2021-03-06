package Selenium25;


public class TestCase3_2 extends TestCase3 {
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		//test admin login functionality with valid inputs(positive test case)
		String expected = "http://www.gcrit.com/build3/admin/index.php";
		
		TestCase3_2 object = new TestCase3_2();
		object.launchBrowser();
		object.adminLogin("admin", "admin@123");
		
		String url = driver.getCurrentUrl();
		if(url.equals(expected))
		{
			System.out.println("Admin Login Successfully -Passed");
		}
		else
		{
			System.out.println("Admin Login Unsuccessfully -Failed");
		}
		object.closeBrowser();
	}
}
