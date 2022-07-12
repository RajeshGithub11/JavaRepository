package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIDTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		Login.click();
		
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
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
