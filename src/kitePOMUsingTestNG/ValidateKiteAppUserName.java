package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	
	WebDriver driver;
	Sheet mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	@BeforeClass
	public void launchBrowser () throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String un = mysheet.getRow(5).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(5).getCell(1).getStringCellValue();
		String pinn = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		login.SendUsername(un);
		Reporter.log("Sending Username",true);
		login.SendPassword(pwd);
		Reporter.log("Sending Password",true);
		login.ClickOnlogin();
		Reporter.log("Clicking on login Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.PINPage(pinn);
		pin.ClickOnContinueButton();
		Reporter.log("Clicking on Continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
	
	@Test
	public void ValidateUserName() 
	{	  
	  	String expectedUN = mysheet.getRow(5).getCell(0).getStringCellValue();
	  	String actualUN = home.getActualUserID();
	  	Reporter.log("Validating UserName",true);
	  	Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
	  	Reporter.log("Actual and Expected UN are matching TC passed",true);
	}
  
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
	  Thread.sleep(1000);
	  home.Logout();
	  Reporter.log("logging out.....",true);
	}
  
  @AfterClass
  public void closebrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Close Browser",true);
	  driver.close();
  }
}
