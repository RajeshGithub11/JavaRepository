package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {
@Test(groups = "sanity")
	public void P() 
	  {
		Reporter.log("P is running",true);
	  }
@Test(groups = "regression")
	public void Q()
	  {
		Reporter.log("Q is running",true);
	  }
@Test(groups = "regression")
	public void R()
	{
		Reporter.log("R is running",true);
	}
}
