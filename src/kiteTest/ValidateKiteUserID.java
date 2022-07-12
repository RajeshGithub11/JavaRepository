package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.Base;
import kitePOMUsingTestNG.KiteHomePage;
import kitePOMUsingTestNG.KiteLoginPage;
import kitePOMUsingTestNG.KitePinPage;
import kiteUtility.Utility;

public class ValidateKiteUserID extends Base 
{
	kitePOMnew.KiteLoginPage login;
	kitePOMnew.KitePinPage pin;
	kitePOMnew.KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login=new kitePOMnew.KiteLoginPage(driver);
		pin=new kitePOMnew.KitePinPage(driver);
		home=new kitePOMnew.KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.SendUsername(Utility.readDataFromExcel(5, 0));
		login.SendPassword(Utility.readDataFromExcel(5, 1));
		login.ClickOnlogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.PINPage(Utility.readDataFromExcel(5, 2));
		pin.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.assertEquals(home.getActualUserID(), Utility.readDataFromExcel(5, 0),"Actual and Expected are not matching TC is failed");
	  
	}
  
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.Logout();
	}
  
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
  
  
}
