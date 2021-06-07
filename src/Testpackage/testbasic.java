package Testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testbasic {
  @Test
  public void car() {
	  System.out.println("Color of the car is red");
  }
  
  @Test(groups={"Smoke"})
  public void carloan()
  {
	  System.out.println("Color of the car is gray");
  }
  
  
}
