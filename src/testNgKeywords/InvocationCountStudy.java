package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 3)
  public void a() {
	  
	  Reporter.log("a method is running",true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("c methid is running",true);
  }
  
  @AfterMethod
  public void b() 
  {
	  Reporter.log("b method is running",true);
  }
}
