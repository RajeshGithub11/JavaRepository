package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 {
@Test(groups = "regression")
	public void x() 
	{
		Reporter.log("x is running",true);
	}
@Test(groups = "sanity")
	public void y()
	{
		Reporter.log("y is running",true);
	}
@Test(groups = "sanity")
	public void z() 
	{
		Reporter.log("z is running",true);
	}
}
