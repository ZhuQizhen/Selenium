package Selenium28;
//using XML file             NewTest1,  NewTest2
//
//Tags in XML:
//<suite name = "Suite Name">
//	<test name = "Test Name">
//		<classes>
//			<class name = "package.ClassName1"/>
//			<class name = "package.ClassName2"/>
//		</classes>
//	</test>
//</suite>

//-------------------
//Create XML file
//select java project/package
//>right click > New
//>Other
//>Enter TestNG and select TestNG class
//>Enter source and package names
//>Enter XML file NAME

//---------------------------
//TestNG Annotations
//@Test-  The annotated method is a part of a Test Case
//@BeforeMethod-  The annotated method will be run before each Test method
//@AfterMethod-  The annotated method will be run after each Test method
//@BeforeClass-  The annotated method will be run before the first Test method in the current class
//@AfterClass-  The annotated method will be run after the last Test method in the current class

//@BeforeTest-  The annotated method will be run before any Test methods belonging to classes inside the tag is run
//@AfterTest-  The annotated method will be run after all the Test methods belonging to classes inside the tag is run

//----------------------------------
//Group Test Cases                 NewTest3
//>select a package
//>new
//>other
//>TestNG class

//---------------------------------------
//Pararllel Test Cases               NewTest5, NewTest6
//Thread- A Thread is a concurrent unit of execution.


public class TestNG2 {

}
