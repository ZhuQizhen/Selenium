package Selenium28;

import org.testng.annotations.Test;

public class NewTest5 {
  @Test
  public void testCase1() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test Case 1 is Successful - Tread id is : "+id);
  }
  
  @Test
  public void testCase2() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test Case 2 is Successful - Tread id is : "+id);
  }
  
  @Test
  public void testCase3() {
	  long id =Thread.currentThread().getId();
	  System.out.println("Test Case 3 is Successful - Tread id is : "+id);
  }
}