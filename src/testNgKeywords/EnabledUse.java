package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void a() 
  {
	  Reporter.log("a is running",true);
  }
  @Test(enabled = false)
  public void b()
  {
	  Reporter.log("b is running",true);
  }
  @Test
  public void c() {
	  Reporter.log("c is running",true);
  }
}
