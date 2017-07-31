package Selenium28;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	@BeforeGroups(groups = {"sanity","regression"})
	public void login() 
	{
		System.out.println("Login Successfully");
	}  
	
	@Test (groups = {"sanity"})
	public void fundTransfer() 
	{
		System.out.println("Fund Transfer Successfully");
	}

	@Test(groups = {"sanity"})
	public void search() 
	{
		System.out.println("Search Successfully");
	}
	
	@Test(groups = {"regression"})
	public void advancedSearch() 
	{
		System.out.println("Advanced Search Successfully");
	}
	
	@Test (groups = {"sanity","regression"})
	public void prePaidRecharge() 
	{
		System.out.println("prePaid Recharge Successfully");
	}
	
	@Test (groups = {"regression"})
	public int billPayments() 
	{
		int bill =1000;
		return bill;
	}
	
	@AfterGroups (groups = {"sanity","regression"})
	public void logout() 
	{
		System.out.println("Logout Successfully");
	}
}
