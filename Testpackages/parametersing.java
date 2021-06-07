package Testpackages;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;

public class parametersing {
	
 
  @Test(dataProvider="getdata")
  public void parameter(String username,String password)
  {
	  System.out.println(hyperlink);
	  System.out.println(username);
	  System.out.println(password);
  }
  @DataProvider
  public object[][] getdata()
  {
	  Object[][] obj = new Object[3][2];
	  //1St set of data
	  obj[0][0] = "Firstusername";
	  obj[0][1] = "Password";
	  //2nd set of data
	  obj[1][0] = "Secondusername";
	  obj[1][1] = "Password";
	  //3rd set of data
	  obj[2][0] = "Thirdusername";
	  obj[2][1] = "Password";
	  
	  return obj;
  }
}
