package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeAndexcludeUse2 {
	@Test
	public void P() 
	  {
		Reporter.log("P is running",true);
	  }
	@Test
	public void Q()
	  {
		Reporter.log("Q is running",true);
	  }
	@Test
	public void R() 
	{
		Reporter.log("R is running",true);
	}
}
