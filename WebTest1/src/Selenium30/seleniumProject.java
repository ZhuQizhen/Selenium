package Selenium30;

//functional test
//
//project info:
//
//project domain:  Ecommerce
//
//Sub-Domain: B2C
//
//Application:Online Shopping portal
//
//App environment: LAMP( linux, Apache, MySQL, PHP)
//
//production: Internet Public Application
//
//Test environment: Internet(company local network)
//
//project description:
//This web portal provides interface in between vendors/Manufacturers and customers,
//Vendors place their products and sell
//Customers view products and Buy products
//Financial service providers provide money transfers.
//corier sever provides ship products from Vendors to Customers
//--------------------------
//Stake holders of the project
//1)Web portal owner
//2)manufacturers/ Vendors
//3)Financial service providers
//4)Corier service providers
//5)customers....etc
//-------------------------------
//Two interfaces of the application
//1)Admin interface  / Serverside interface
//2)user interface  /  client interface
//user:  project admin, vendors,....
//
//Admin URL:  http://www.gcrit.com/build3/admin/
//gcrit.com -- Web Domain
//build3   -- folder
//admin    -- sub folder
//
//Features to be tested in admin interface:
//1)Redirect from Admin interface to user interface
//2)Admin login
//2.5)Redirect from Admin interface to user interface after login
//3)Add/Edit/Delete Manufacturers(portal admin)
//4)Add/Edit/Delete Categories(manufacturers)
//5)Add/Edit/Delete Products (manufacturers)
//6)Add/Edit/Delete Currency(portal admin)
//7)Order Status(portal admin / manufacturers)
//8)Products reports
//9)Customer reports

//Features to be tested in user interface:
//Users:
//Guest users(Launch application, view products, search products)
//Registered users(Buy products etc...)
//1)Launch application
//2)search products
//3)customer registration
//4)customer login
//5)track order status
//6)buy products(Add/delete products, currency, add/edit quantity, select payment option, check out)
//---------------------
//Sanity Tests for Admin Interface:
//1)Admin/ manufacturers login
//2)Admin/ manufacturers logout
//3)Add Category
//4)Add product
//5)Add currency etc...
//-----------------------------------
//Test Execution Levels
//	Sanity Testing on Initial build
//	Comprehensive Testing
//	Sanity Testing on Modified build
//	Regression Testing Cycle 1s
//	.
//	.
//	.
//	Final Regression
	
//---------------------------------
//Business flows in User interface
//1)Launch Application + View products + Close Application 
//2)Launch Application + View products +Search products + Close Application
//3)Launch Application + View products +Search products +Registration + Buy products + Close Application
//4)Launch Application + View products +Search products +Buy products + login + Close Application
//5)Launch Application + View products +Buy products + Register + Close Application
//6)Launch Application + Registration + Close Application
//7)Launch Application + Close Application
//8)Launch Application + Add to Cart(Without Check out) + Close Application
//----------------------------------------
//Comprehensive Tests for Admin Interface:
//1)Launch Application
//2)Redirect to User Interface
//3)Existence of Elements
//4)Admin Login
//Note : In 2 ways we can verify admin login: (1)using positive and negative test cases; (2)using data Driven testing
//5)Admin logout
//6)Existence of Elements after login
//7)Add manufacturer
//8)Edit manufacturer
//9)Delete manufacturer
//10)Add category
//11)edit category
//12)delete category
//13)Add product
//14)edit product
//15)delete product
//---------------------
//Comprehensive Tests for User Interface:
//1)Launch Application
//2)Existence of Elements
//3)Customer Registration
//4)Customer Login
//5)Logout
//6)By products  etc...
//---------------------------
//Test Automation
//1)Automate the Test Cases using Selenium WebDriver and Java Programming
//And
//2)Automate the Test Cases using Selenium WebDriver, Java Programming and TestNG


public class  seleniumProject {

	
	
}
