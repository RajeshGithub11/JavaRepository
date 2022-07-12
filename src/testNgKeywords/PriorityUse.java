package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = 4)
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
  @Test(priority = 3)
  public void b()
  {
	  Reporter.log("b method is running",true);
  }
  @Test(priority = 2)
  public void c()
  {
	  Reporter.log("c method is running",true);
  }
  @Test(priority = 1)
  public void d()
  {
	  Reporter.log("d method is ruuning",true);
  }
  
}
