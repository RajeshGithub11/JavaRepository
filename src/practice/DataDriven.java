package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

@Test(dataProvider = "logindata")
	public void login(String user , String pwd , String pin) throws InterruptedException
	{
		//System.out.println(user+pwd+pin);
		driver.get("https://kite.zerodha.com/");
		
		WebElement UserID = driver.findElement(By.id("userid"));
		Thread.sleep(5000);
		UserID.sendKeys(user);
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(5000);
		password.sendKeys(pwd);
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(5000);
		Login.click();
	}
	@DataProvider(name = "logindata")
	public String [][] getdata()
	{
		String logindata [][]= {
				
								{"HD5857","Ajinkya@123","969696"},
								{"ELR321","Dhana1111","982278"}

				
		                       };
		return logindata;
	}
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
