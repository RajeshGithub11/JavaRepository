package testNgKeywords;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test(dependsOnMethods = {"C"})
	  public void A() 
	  {
		  Reporter.log("A method is running",true);
	  }
	  
	  @Test
	  public void B()
	  {
		  Reporter.log("B method is running",true);
	  }
	  
	  @Test(priority = 1 )            //alwaysRun = true
	  public void C()
	  {
		  Assert.fail();    //C method is failed and dependent method is skipped
		  Reporter.log("C method is running",true);
	  }
}
