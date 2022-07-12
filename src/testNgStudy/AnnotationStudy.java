package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
@BeforeClass
	public void LaunchingBrowser()
	{
	  Reporter.log("Launching Browser",true);
	}

@BeforeMethod
public void UserLogIn()
{
	Reporter.log("LogIn Successfull",true);
}

@Test
  public void ValidateUserName() {
	  Reporter.log("UserName Validated",true);
  }

 @Test
  public void ValidateDashboard()
  {
	  Reporter.log("Dashboard Validated",true);
  }
 
 @AfterMethod
 public void UserLogout()
 {
	 Reporter.log("Logout Successfull",true);
 }
 
 @AfterClass
 public void ClosingBrowser()
 {
	 Reporter.log("Close Browser",true);
 }

}
