package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
  @Test
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  
  @Test
  public void z()
  {
	  Reporter.log("z method is running",true);
  }
  
  @Test(timeOut = 100)
  public void a() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("a method is running",true);
  }
}
