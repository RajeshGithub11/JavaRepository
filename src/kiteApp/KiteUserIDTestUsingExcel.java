package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIDTestUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		
		// using WorkbookFactory class call create method and pass details
		// to read String type value
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys(UN);
		password.sendKeys(PWD);
		Login.click();
		
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		ContinueButton.click();
		
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualresult = userName.getText();
		String ExpecteduserName = "ELR321";
		
		
		if(actualresult.equals(ExpecteduserName))
		{
			System.out.println("UserId is matching TC is Passed");
		}
		else
		{
			System.out.println("UserId is not matching TC is failed");
		}
		
		Thread.sleep(1000);
		userName.click();
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		
		Thread.sleep(1000);
		driver.close();

	}

}
