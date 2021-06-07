package Testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
@BeforeClass
    public void beforeclass()
    {
	    System.out.println("Before class is executed");
	}
	@BeforeMethod
	public void executefirst()
	{
		System.out.println("I will excecute before every testcase with in the calss level");
	}
	@AfterMethod
	public void Executenext()
	{
		System.out.println("I will excecute After every testcase with in the calss level");
	}
	
	
	@Test
	public void demo() 
	{
		System.out.println("hello");
	}
	@Test(dependsOnMethods= {"demo","Executenext"})
	public void demo1()
	{
		System.out.println("reddy");
	}
	@Test(enabled=true) // If u want to skip execution in case you aware that if bug exists in the class ,To enable use true
	public void demo2()
	{
		System.out.println("deepi");
	}
	@AfterSuite
	public void EducationLoan()
	  {
		  System.out.println("I will execute at last in the suite");
	  }
	@Test(groups= {"Smoke"})
	public void demo3()
	{
		System.out.println("chandu");
	}
	@BeforeTest
	public void demo4()
	{
		System.out.println("Hay its clearing the existing reports of last iteration");
	}
	@AfterTest
	public void Bikeloan()
	  {
		  System.out.println("Bike loan disbursed");
	  }
	@Test(timeOut=4000)
	public void HomeLoan()
	  {
		  System.out.println("Home loan disbursed");
	  }
	@BeforeSuite
	public void Retailloan()
	  {
		  System.out.println("it will excecute first in the suite level");
	  }
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Execute after class");
	}
	

}
