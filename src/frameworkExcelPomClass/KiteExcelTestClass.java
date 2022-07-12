package frameworkExcelPomClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteExcelTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");    // disable the small window from browser.
		//opt.addArguments("--headless");      //webpage is open just show the output in console.
		//opt.addArguments("--incognito");    // by using this we have to make browser as private use and any data does not store get in history. 
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");

		File myfile = new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String un = mysheet.getRow(5).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(5).getCell(1).getStringCellValue();
		String pinn = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		Thread.sleep(1000);
		KiteLoginPage login=new KiteLoginPage(driver);
		login.SendUsername(un);
		login.SendPassword(pwd);
		login.ClickOnlogin();
		
		Thread.sleep(1000);
		KitePinPage pinpage=new KitePinPage(driver);
		pinpage.PINPage(pinn);
		pinpage.ClickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home=new KiteHomePage(driver);
		home.ValidateUserName(un);
		//home.ClickOnUsername();
		//home.Logout();
		
		
		
	}

}
